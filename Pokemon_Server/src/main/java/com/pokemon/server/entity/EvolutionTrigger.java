package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_evolution_triggers")
public class EvolutionTrigger implements Serializable {
	private static final long serialVersionUID = 4968086338720323295L;

	@Id
	@Column(name = "evolution_trigger_id", unique = true, nullable = false)
	private Integer evolutionTriggerId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public EvolutionTrigger() {
	}

	public EvolutionTrigger(Integer evolutionTriggerId, String name, String nameAlias) {
		this.evolutionTriggerId = evolutionTriggerId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getEvolutionTriggerId() {
		return evolutionTriggerId;
	}

	public void setEvolutionTriggerId(Integer evolutionTriggerId) {
		this.evolutionTriggerId = evolutionTriggerId;
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
		return "EvolutionTrigger [evolutionTriggerId=" + evolutionTriggerId + ", name=" + name + ", nameAlias="
				+ nameAlias + "]";
	}
}