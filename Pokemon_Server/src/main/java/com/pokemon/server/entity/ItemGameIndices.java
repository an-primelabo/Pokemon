package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_item_game_indices")
public class ItemGameIndices implements Serializable {
	private static final long serialVersionUID = -5821411331061273531L;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "game_index")
	private Integer gameIndex;

	public ItemGameIndices() {
	}

	public ItemGameIndices(Integer itemId, Integer generationId, Integer gameIndex) {
		this.itemId = itemId;
		this.generationId = generationId;
		this.gameIndex = gameIndex;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Integer getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(Integer gameIndex) {
		this.gameIndex = gameIndex;
	}

	@Override
	public String toString() {
		return "ItemGameIndices [itemId=" + itemId + ", generationId=" + generationId + ", gameIndex=" + gameIndex
				+ "]";
	}
}