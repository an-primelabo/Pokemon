package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_pockets")
public class ItemPocket implements Serializable {
	private static final long serialVersionUID = 353781732843545586L;

	@Id
	@Column(name = "item_pocket_id", unique = true, nullable = false)
	private Integer itemPocketId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public ItemPocket() {
	}

	public ItemPocket(Integer itemPocketId, String name, String nameAlias) {
		this.itemPocketId = itemPocketId;
		this.name = name;
		this.nameAlias = nameAlias;
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
		return "ItemPocket [itemPocketId=" + itemPocketId + ", name=" + name + ", nameAlias=" + nameAlias + "]";
	}
}