package net.ninemm.survey.service.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFrequencyCondition<M extends BaseFrequencyCondition<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setAnswerRestrictId(java.lang.String answerRestrictId) {
		set("answer_restrict_id", answerRestrictId);
	}
	
	public java.lang.String getAnswerRestrictId() {
		return getStr("answer_restrict_id");
	}

	public void setAnswerRestrictType(java.lang.Integer answerRestrictType) {
		set("answer_restrict_type", answerRestrictType);
	}
	
	public java.lang.Integer getAnswerRestrictType() {
		return getInt("answer_restrict_type");
	}

	public void setAnswerRestrictValue(java.lang.Integer answerRestrictValue) {
		set("answer_restrict_value", answerRestrictValue);
	}
	
	public java.lang.Integer getAnswerRestrictValue() {
		return getInt("answer_restrict_value");
	}

	public void setTotalAnswerSheetNum(java.lang.Integer totalAnswerSheetNum) {
		set("total_answer_sheet_num", totalAnswerSheetNum);
	}
	
	public java.lang.Integer getTotalAnswerSheetNum() {
		return getInt("total_answer_sheet_num");
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