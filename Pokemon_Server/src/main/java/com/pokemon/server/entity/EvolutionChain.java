package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_evolution_chains")
public class EvolutionChain implements Serializable {
	private static final long serialVersionUID = -5553346040260409334L;

	@Id
	@Column(name = "evolution_chain_id", unique = true, nullable = false)
	private Integer evolutionChainId;

	@Column(name = "baby_trigger_item_id")
	private Integer babyTriggerItemId;

	public EvolutionChain() {
	}

	public EvolutionChain(Integer evolutionChainId, Integer babyTriggerItemId) {
		this.evolutionChainId = evolutionChainId;
		this.babyTriggerItemId = babyTriggerItemId;
	}

	public Integer getEvolutionChainId() {
		return evolutionChainId;
	}

	public void setEvolutionChainId(Integer evolutionChainId) {
		this.evolutionChainId = evolutionChainId;
	}

	public Integer getBabyTriggerItemId() {
		return babyTriggerItemId;
	}

	public void setBabyTriggerItemId(Integer babyTriggerItemId) {
		this.babyTriggerItemId = babyTriggerItemId;
	}

	@Override
	public String toString() {
		return "EvolutionChain [evolutionChainId=" + evolutionChainId + ", babyTriggerItemId=" + babyTriggerItemId
				+ "]";
	}
}