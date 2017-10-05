package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warriors")
public class ConquestWarrior implements Serializable {
	private static final long serialVersionUID = 850280755187796282L;

	@Id
	@Column(name = "conquest_warrior_id", unique = true, nullable = false)
	private Integer conquestWarriorId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	@Column(name = "gender_id")
	private Integer genderId;

	@Column(name = "conquest_warrior_archetype_id")
	private Integer conquestWarriorArchetypeId;

	public ConquestWarrior() {
	}

	public ConquestWarrior(Integer conquestWarriorId, String name, String nameAlias, Integer genderId,
			Integer conquestWarriorArchetypeId) {
		this.conquestWarriorId = conquestWarriorId;
		this.name = name;
		this.nameAlias = nameAlias;
		this.genderId = genderId;
		this.conquestWarriorArchetypeId = conquestWarriorArchetypeId;
	}

	public Integer getConquestWarriorId() {
		return conquestWarriorId;
	}

	public void setConquestWarriorId(Integer conquestWarriorId) {
		this.conquestWarriorId = conquestWarriorId;
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

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public Integer getConquestWarriorArchetypeId() {
		return conquestWarriorArchetypeId;
	}

	public void setConquestWarriorArchetypeId(Integer conquestWarriorArchetypeId) {
		this.conquestWarriorArchetypeId = conquestWarriorArchetypeId;
	}

	@Override
	public String toString() {
		return "ConquestWarrior [conquestWarriorId=" + conquestWarriorId + ", name=" + name + ", nameAlias=" + nameAlias
				+ ", genderId=" + genderId + ", conquestWarriorArchetypeId=" + conquestWarriorArchetypeId + "]";
	}
}