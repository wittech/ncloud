package net.ninemm.upms.service.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserGroupRel<M extends BaseUserGroupRel<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}
	
	public java.lang.String getUserId() {
		return getStr("user_id");
	}

	public void setGroupId(java.lang.String groupId) {
		set("group_id", groupId);
	}
	
	public java.lang.String getGroupId() {
		return getStr("group_id");
	}

}
