package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_warrior_skills")
public class ConquestWarriorSkill implements Serializable {
	private static final long serialVersionUID = 1983291422749570863L;

	@Id
	@Column(name = "conquest_warrior_skill_id", unique = true, nullable = false)
	private Integer conquestWarriorSkillId;

	@Column(name = "name", length = 32)
	private String name;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	public ConquestWarriorSkill() {
	}

	public ConquestWarriorSkill(Integer conquestWarriorSkillId, String name, String nameAlias) {
		this.conquestWarriorSkillId = conquestWarriorSkillId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getConquestWarriorSkillId() {
		return conquestWarriorSkillId;
	}

	public void setConquestWarriorSkillId(Integer conquestWarriorSkillId) {
		this.conquestWarriorSkillId = conquestWarriorSkillId;
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
		return "ConquestWarriorSkill [conquestWarriorSkillId=" + conquestWarriorSkillId + ", name=" + name
				+ ", nameAlias=" + nameAlias + "]";
	}
}