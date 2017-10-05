package com.pokemon.server.constant;

import javax.persistence.Table;

import com.pokemon.server.entity.Region;

public final class Constants {
	private Constants() {
	}

	public static final String BLANK = "";
	public static final String NULL = "null";
	public static final String PATH_FOLDER_DATA = System.getProperty("user.dir") + "\\data\\";
	public static final String PATH_FOLDER_SQL = System.getProperty("user.dir") + "\\data\\sql\\";

	public static final String MSG_NOT_FOUND = "{0} with 【id = {1}】 not found !";
	public static final String MSG_TABLE_EMPTY = "Table 【{0}】 is empty !";
	public static final String MSG_CONFLICT = "{0} with 【id = {1}】 already exists !";

	public static final String MSG_FOUND_RECORD = "Found {0}:";
	public static final String MSG_FOUND_LIST = "Found 【{0}】 records !";
	public static final String MSG_CREATED = "Created {0}:";
	public static final String MSG_UPDATED = "Updated {0}:";
	public static final String MSG_DELETED = "{0} with 【id = {1}】  was deleted !";

	public static final String TABLE_REGION_NAME = Region.class.getAnnotation(Table.class).name();
	public static final String TABLE_REGION_ENTITY_NAME = "Region";
}