package net.ninemm.survey.service.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseWxPayOrder<M extends BaseWxPayOrder<M>> extends JbootModel<M> implements IBean {

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

	public void setProductId(java.lang.String productId) {
		set("product_id", productId);
	}
	
	public java.lang.String getProductId() {
		return getStr("product_id");
	}

	public void setBody(java.lang.String body) {
		set("body", body);
	}
	
	public java.lang.String getBody() {
		return getStr("body");
	}

	public void setDetail(java.lang.String detail) {
		set("detail", detail);
	}
	
	public java.lang.String getDetail() {
		return getStr("detail");
	}

	public void setAttach(java.lang.String attach) {
		set("attach", attach);
	}
	
	public java.lang.String getAttach() {
		return getStr("attach");
	}

	public void setSceneInfo(java.lang.String sceneInfo) {
		set("scene_info", sceneInfo);
	}
	
	public java.lang.String getSceneInfo() {
		return getStr("scene_info");
	}

	public void setTotalFee(java.lang.String totalFee) {
		set("total_fee", totalFee);
	}
	
	public java.lang.String getTotalFee() {
		return getStr("total_fee");
	}

	public void setMchId(java.lang.String mchId) {
		set("mch_id", mchId);
	}
	
	public java.lang.String getMchId() {
		return getStr("mch_id");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setTradeType(java.lang.String tradeType) {
		set("trade_type", tradeType);
	}
	
	public java.lang.String getTradeType() {
		return getStr("trade_type");
	}

	public void setNonceStr(java.lang.String nonceStr) {
		set("nonce_str", nonceStr);
	}
	
	public java.lang.String getNonceStr() {
		return getStr("nonce_str");
	}

	public void setNotifyUrl(java.lang.String notifyUrl) {
		set("notify_url", notifyUrl);
	}
	
	public java.lang.String getNotifyUrl() {
		return getStr("notify_url");
	}

	public void setSign(java.lang.String sign) {
		set("sign", sign);
	}
	
	public java.lang.String getSign() {
		return getStr("sign");
	}

	public void setPrepayId(java.lang.String prepayId) {
		set("prepay_id", prepayId);
	}
	
	public java.lang.String getPrepayId() {
		return getStr("prepay_id");
	}

	public void setCodeUrl(java.lang.String codeUrl) {
		set("code_url", codeUrl);
	}
	
	public java.lang.String getCodeUrl() {
		return getStr("code_url");
	}

	public void setOpenid(java.lang.String openid) {
		set("openid", openid);
	}
	
	public java.lang.String getOpenid() {
		return getStr("openid");
	}

	public void setOrderStatus(java.lang.Integer orderStatus) {
		set("order_status", orderStatus);
	}
	
	public java.lang.Integer getOrderStatus() {
		return getInt("order_status");
	}

	public void setTransactionId(java.lang.String transactionId) {
		set("transaction_id", transactionId);
	}
	
	public java.lang.String getTransactionId() {
		return getStr("transaction_id");
	}

	public void setUserId(java.lang.String userId) {
		set("user_id", userId);
	}
	
	public java.lang.String getUserId() {
		return getStr("user_id");
	}

	public void setDeptId(java.lang.String deptId) {
		set("dept_id", deptId);
	}
	
	public java.lang.String getDeptId() {
		return getStr("dept_id");
	}

	public void setDataArea(java.lang.String dataArea) {
		set("data_area", dataArea);
	}
	
	public java.lang.String getDataArea() {
		return getStr("data_area");
	}

	public void setEndDate(java.util.Date endDate) {
		set("end_date", endDate);
	}
	
	public java.util.Date getEndDate() {
		return get("end_date");
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