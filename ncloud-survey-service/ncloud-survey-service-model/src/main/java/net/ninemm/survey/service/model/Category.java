package net.ninemm.survey.service.model;

import io.jboot.db.annotation.Table;
import net.ninemm.survey.service.model.base.BaseCategory;

/**
 * Generated by Jboot.
 */
@Table(tableName = "survey_category", primaryKey = "id")
public class Category extends BaseCategory<Category> {
    public static final String CACHE_NAME="survey_category";
}