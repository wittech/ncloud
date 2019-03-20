package net.ninemm.survey.service.model;

import io.jboot.db.annotation.Table;
import io.swagger.models.auth.In;
import net.ninemm.survey.service.model.base.BaseSurvey;

/**
 * Generated by Jboot.
 */
@Table(tableName = "survey", primaryKey = "id")
public class Survey extends BaseSurvey<Survey> {
    public enum SurveyStatus {
        //问卷状态 0：草稿  1：测试中 2：已发布 3：已结束 4：已删除 5：彻底删除 6：归档
        DRAFT(0),TEST(1),PUBLISH(2),FINISH(3),DELETE(4),DELETED(5),FILE(6);
        private Integer statu;
        SurveyStatus(int statu){
            this.statu = statu;
        }
        public int getStatu() {
            return statu;
        }
    }

    public static final String CACHE_NAME="survey";

}
