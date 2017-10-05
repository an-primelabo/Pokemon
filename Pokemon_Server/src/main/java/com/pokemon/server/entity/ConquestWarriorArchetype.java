package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_archetypes")
public class ConquestWarriorArchetype implements Serializable {
	private static final long serialVersionUID = 7418243697286581337L;

	@Id
	@Column(name = "conquest_warrior_archetype_id", unique = true, nullable = false)
	private Integer conquestWarriorArchetypeId;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	public ConquestWarriorArchetype() {
	}

	public ConquestWarriorArchetype(Integer conquestWarriorArchetypeId, String nameAlias) {
		this.conquestWarriorArchetypeId = conquestWarriorArchetypeId;
		this.nameAlias = nameAlias;
	}

	public Integer getConquestWarriorArchetypeId() {
		return conquestWarriorArchetypeId;
	}

	public void setConquestWarriorArchetypeId(Integer conquestWarriorArchetypeId) {
		this.conquestWarriorArchetypeId = conquestWarriorArchetypeId;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	@Override
	public String toString() {
		return "ConquestWarriorArchetype [conquestWarriorArchetypeId=" + conquestWarriorArchetypeId + ", nameAlias="
				+ nameAlias + "]";
	}
}