package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_flavor_summaries")
public class ItemFlavorSummary implements Serializable {
	private static final long serialVersionUID = 3183400806498923304L;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "flavor_summary")
	private String flavorSummary;

	public ItemFlavorSummary() {
	}

	public ItemFlavorSummary(Integer itemId, String flavorSummary) {
		this.itemId = itemId;
		this.flavorSummary = flavorSummary;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getFlavorSummary() {
		return flavorSummary;
	}

	public void setFlavorSummary(String flavorSummary) {
		this.flavorSummary = flavorSummary;
	}

	@Override
	public String toString() {
		return "ItemFlavorSummary [itemId=" + itemId + ", flavorSummary=" + flavorSummary + "]";
	}
}