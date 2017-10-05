package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_flag_map")
public class ItemFlagMap implements Serializable {
	private static final long serialVersionUID = -7463908773628781918L;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "item_flag_id")
	private Integer itemFlagId;

	public ItemFlagMap() {
	}

	public ItemFlagMap(Integer itemId, Integer itemFlagId) {
		this.itemId = itemId;
		this.itemFlagId = itemFlagId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemFlagId() {
		return itemFlagId;
	}

	public void setItemFlagId(Integer itemFlagId) {
		this.itemFlagId = itemFlagId;
	}

	@Override
	public String toString() {
		return "ItemFlagMap [itemId=" + itemId + ", itemFlagId=" + itemFlagId + "]";
	}
}