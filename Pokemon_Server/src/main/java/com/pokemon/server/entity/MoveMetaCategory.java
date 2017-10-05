package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_meta_categories")
public class MoveMetaCategory implements Serializable {
	private static final long serialVersionUID = -8874364363628010865L;

	@Id
	@Column(name = "move_meta_category_id", unique = true, nullable = false)
	private Integer moveMetaCategoryId;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	public MoveMetaCategory() {
	}

	public MoveMetaCategory(Integer moveMetaCategoryId, String nameAlias, String description) {
		this.moveMetaCategoryId = moveMetaCategoryId;
		this.nameAlias = nameAlias;
		this.description = description;
	}

	public Integer getMoveMetaCategoryId() {
		return moveMetaCategoryId;
	}

	public void setMoveMetaCategoryId(Integer moveMetaCategoryId) {
		this.moveMetaCategoryId = moveMetaCategoryId;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MoveMetaCategory [moveMetaCategoryId=" + moveMetaCategoryId + ", nameAlias=" + nameAlias
				+ ", description=" + description + "]";
	}
}