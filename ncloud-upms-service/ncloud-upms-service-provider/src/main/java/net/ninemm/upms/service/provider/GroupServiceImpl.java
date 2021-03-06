package net.ninemm.upms.service.provider;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import io.jboot.Jboot;
import io.jboot.aop.annotation.Bean;
import io.jboot.core.cache.annotation.Cacheable;
import io.jboot.db.model.Columns;
import io.jboot.utils.StrUtils;
import net.ninemm.base.web.base.BaseService;
import net.ninemm.upms.service.api.GroupService;
import net.ninemm.upms.service.model.Group;

import javax.inject.Singleton;
import java.util.List;
import java.util.Map;

/**
 * 用户分组业务处理
 * @author Eric
 * @date  2018-12-29 17:09
 */

@Bean
@Singleton
public class GroupServiceImpl extends BaseService<Group> implements GroupService {

    @Override
    public Page<Group> paginate(int page, int pageSize, Map<String, Object> params) {
        Columns columns = Columns.create();
        Object groupName = params.get("groupName");
        if (groupName != null) {
            columns.likeAppendPercent("group_name", groupName);
        }

        Object dataArea = params.get("dataArea");
        if (dataArea != null) {
            columns.like("data_area", dataArea);
        }

        Object isAsc = params.get("isAsc");
        Object orderByField = params.get("orderByField");
        String orderBy = orderBy(orderByField, isAsc);

        return DAO.paginateByColumns(page, pageSize, columns, orderBy);
    }

    @Override
    @Cacheable(name = "upms_group", key = "group:#(groupName)")
    public String findGroupIdByGroupName(String groupName) {
        return Db.queryStr("select id from upms_group where group_name = ?", groupName);
    }

    @Override
    public boolean deleteById(Object id) {
        return super.deleteById(id);
    }

    @Override
    public List<Record> findListAsOptions(String dataArea) {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("select id, group_name as name from upms_group where 1=1");
        if (StrUtils.isNotBlank(dataArea)) {
            sqlBuilder.append(" AND data_area = ?");
        }

        return Db.find(sqlBuilder.toString());
    }

    /**
     * 清除 model 缓存
     */
    @Override
    protected void clearAllCache() {
        Jboot.me().getCache().removeAll(Group.CACHE_NAME);
    }
}