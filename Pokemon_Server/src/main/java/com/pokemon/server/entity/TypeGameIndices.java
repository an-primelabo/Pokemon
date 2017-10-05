package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_type_game_indices")
public class TypeGameIndices implements Serializable {
	private static final long serialVersionUID = -2693455620310882730L;

	@Column(name = "type_id")
	private Integer typeId;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "game_index")
	private Integer gameIndex;

	public TypeGameIndices() {
	}

	public TypeGameIndices(Integer typeId, Integer generationId, Integer gameIndex) {
		this.typeId = typeId;
		this.generationId = generationId;
		this.gameIndex = gameIndex;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
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
		return "TypeGameIndices [typeId=" + typeId + ", generationId=" + generationId + ", gameIndex=" + gameIndex
				+ "]";
	}
}