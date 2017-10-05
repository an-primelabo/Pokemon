package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_fling_effects")
public class ItemFlingEffect implements Serializable {
	private static final long serialVersionUID = -4568125338442209317L;

	@Id
	@Column(name = "item_fling_effect_id", unique = true, nullable = false)
	private Integer itemFlingEffectId;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "effect")
	private String effect;

	public ItemFlingEffect() {
	}

	public ItemFlingEffect(Integer itemFlingEffectId, String nameAlias, String effect) {
		this.itemFlingEffectId = itemFlingEffectId;
		this.nameAlias = nameAlias;
		this.effect = effect;
	}

	public Integer getItemFlingEffectId() {
		return itemFlingEffectId;
	}

	public void setItemFlingEffectId(Integer itemFlingEffectId) {
		this.itemFlingEffectId = itemFlingEffectId;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	@Override
	public String toString() {
		return "ItemFlingEffect [itemFlingEffectId=" + itemFlingEffectId + ", nameAlias=" + nameAlias + ", effect="
				+ effect + "]";
	}
}