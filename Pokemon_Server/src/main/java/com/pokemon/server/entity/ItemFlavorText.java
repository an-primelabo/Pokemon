package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_flavor_text")
public class ItemFlavorText implements Serializable {
	private static final long serialVersionUID = -3281005920382837435L;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "flavor_text")
	private String flavorText;

	public ItemFlavorText() {
	}

	public ItemFlavorText(Integer itemId, Integer versionGroupId, String flavorText) {
		this.itemId = itemId;
		this.versionGroupId = versionGroupId;
		this.flavorText = flavorText;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	@Override
	public String toString() {
		return "ItemFlavorText [itemId=" + itemId + ", versionGroupId=" + versionGroupId + ", flavorText=" + flavorText
				+ "]";
	}
}