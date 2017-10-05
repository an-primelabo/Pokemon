package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_flags")
public class ItemFlag implements Serializable {
	private static final long serialVersionUID = -9049684819589866419L;

	@Id
	@Column(name = "item_flag_id", unique = true, nullable = false)
	private Integer itemFlagId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "description")
	private String description;

	public ItemFlag() {
	}

	public ItemFlag(Integer itemFlagId, String name, String nameAlias, String description) {
		this.itemFlagId = itemFlagId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.description = description;
	}

	public Integer getItemFlagId() {
		return itemFlagId;
	}

	public void setItemFlagId(Integer itemFlagId) {
		this.itemFlagId = itemFlagId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "ItemFlag [itemFlagId=" + itemFlagId + ", name=" + name + ", nameAlias=" + nameAlias + ", description="
				+ description + "]";
	}
}