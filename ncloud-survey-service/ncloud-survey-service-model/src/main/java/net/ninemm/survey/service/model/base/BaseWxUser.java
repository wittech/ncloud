package net.ninemm.survey.service.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWxUser<M extends BaseWxUser<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setAppid(java.lang.String appid) {
		set("appid", appid);
	}
	
	public java.lang.String getAppid() {
		return getStr("appid");
	}

	public void setOpenid(java.lang.String openid) {
		set("openid", openid);
	}
	
	public java.lang.String getOpenid() {
		return getStr("openid");
	}

	public void setSubscribe(java.lang.Integer subscribe) {
		set("subscribe", subscribe);
	}
	
	public java.lang.Integer getSubscribe() {
		return getInt("subscribe");
	}

	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}
	
	public java.lang.String getNickname() {
		return getStr("nickname");
	}

	public void setSex(java.lang.Integer sex) {
		set("sex", sex);
	}
	
	public java.lang.Integer getSex() {
		return getInt("sex");
	}

	public void setCountry(java.lang.String country) {
		set("country", country);
	}
	
	public java.lang.String getCountry() {
		return getStr("country");
	}

	public void setProvince(java.lang.String province) {
		set("province", province);
	}
	
	public java.lang.String getProvince() {
		return getStr("province");
	}

	public void setCity(java.lang.String city) {
		set("city", city);
	}
	
	public java.lang.String getCity() {
		return getStr("city");
	}

	public void setHeadimgurl(java.lang.String headimgurl) {
		set("headimgurl", headimgurl);
	}
	
	public java.lang.String getHeadimgurl() {
		return getStr("headimgurl");
	}

	public void setSubscribeTime(java.util.Date subscribeTime) {
		set("subscribe_time", subscribeTime);
	}
	
	public java.util.Date getSubscribeTime() {
		return get("subscribe_time");
	}

	public void setQrSceneStr(java.lang.String qrSceneStr) {
		set("qr_scene_str", qrSceneStr);
	}
	
	public java.lang.String getQrSceneStr() {
		return getStr("qr_scene_str");
	}

	public void setIsManager(java.lang.Integer isManager) {
		set("is_manager", isManager);
	}
	
	public java.lang.Integer getIsManager() {
		return getInt("is_manager");
	}

	public void setUnionid(java.lang.String unionid) {
		set("unionid", unionid);
	}
	
	public java.lang.String getUnionid() {
		return getStr("unionid");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setModifyDate(java.util.Date modifyDate) {
		set("modify_date", modifyDate);
	}
	
	public java.util.Date getModifyDate() {
		return get("modify_date");
	}

}