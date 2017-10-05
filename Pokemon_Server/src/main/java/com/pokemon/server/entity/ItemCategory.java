package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_categories")
public class ItemCategory implements Serializable {
	private static final long serialVersionUID = -4984903293100517420L;

	@Id
	@Column(name = "item_category_id", unique = true, nullable = false)
	private Integer itemCategoryId;

	@Column(name = "item_pocket_id")
	private Integer itemPocketId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public ItemCategory() {
	}

	public ItemCategory(Integer itemCategoryId, Integer itemPocketId, String name, String nameAlias) {
		this.itemCategoryId = itemCategoryId;
		this.itemPocketId = itemPocketId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getItemCategoryId() {
		return itemCategoryId;
	}

	public void setItemCategoryId(Integer itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public Integer getItemPocketId() {
		return itemPocketId;
	}

	public void setItemPocketId(Integer itemPocketId) {
		this.itemPocketId = itemPocketId;
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

	@Override
	public String toString() {
		return "ItemCategory [itemCategoryId=" + itemCategoryId + ", itemPocketId=" + itemPocketId + ", name=" + name
				+ ", nameAlias=" + nameAlias + "]";
	}
}