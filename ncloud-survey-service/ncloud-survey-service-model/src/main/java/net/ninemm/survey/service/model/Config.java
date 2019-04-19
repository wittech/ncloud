package net.ninemm.survey.service.model;

import io.jboot.db.annotation.Table;
import net.ninemm.survey.service.model.base.BaseConfig;

/**
 * Generated by Jboot.
 */
@Table(tableName = "survey_config", primaryKey = "id")
public class Config extends BaseConfig<Config> {
    public static final String CACHE_NAME="survey_config";
}