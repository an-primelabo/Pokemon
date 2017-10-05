package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_items")
public class Item implements Serializable {
	private static final long serialVersionUID = -9015419116181446799L;

	@Id
	@Column(name = "item_id", unique = true, nullable = false)
	private Integer itemId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "item_category_id")
	private Integer itemCategoryId;

	@Column(name = "cost")
	private Integer cost;

	@Column(name = "fling_power")
	private Integer flingPower;

	@Column(name = "item_fling_effect_id")
	private Integer itemFlingEffectId;

	@Column(name = "short_effect")
	private String shortEffect;

	@Column(name = "effect")
	private String effect;

	public Item() {
	}

	public Item(Integer itemId, String name, String nameAlias, Integer itemCategoryId, Integer cost, Integer flingPower,
			Integer itemFlingEffectId, String shortEffect, String effect) {
		this.itemId = itemId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.itemCategoryId = itemCategoryId;
		this.cost = cost;
		this.flingPower = flingPower;
		this.itemFlingEffectId = itemFlingEffectId;
		this.shortEffect = shortEffect;
		this.effect = effect;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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

	public Integer getItemCategoryId() {
		return itemCategoryId;
	}

	public void setItemCategoryId(Integer itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getFlingPower() {
		return flingPower;
	}

	public void setFlingPower(Integer flingPower) {
		this.flingPower = flingPower;
	}

	public Integer getItemFlingEffectId() {
		return itemFlingEffectId;
	}

	public void setItemFlingEffectId(Integer itemFlingEffectId) {
		this.itemFlingEffectId = itemFlingEffectId;
	}

	public String getShortEffect() {
		return shortEffect;
	}

	public void setShortEffect(String shortEffect) {
		this.shortEffect = shortEffect;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", nameAlias=" + nameAlias + ", itemCategoryId="
				+ itemCategoryId + ", cost=" + cost + ", flingPower=" + flingPower + ", itemFlingEffectId="
				+ itemFlingEffectId + ", shortEffect=" + shortEffect + ", effect=" + effect + "]";
	}
}