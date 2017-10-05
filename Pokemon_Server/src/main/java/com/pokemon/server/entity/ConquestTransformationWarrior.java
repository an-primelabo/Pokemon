package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_conquest_transformation_warriors")
public class ConquestTransformationWarrior implements Serializable {
	private static final long serialVersionUID = 1258662705816722224L;

	@Column(name = "conquest_transformation_warrior_id")
	private Integer conquestTransformationWarriorId;

	@Column(name = "present_warrior_id")
	private Integer presentWarriorId;

	public ConquestTransformationWarrior() {
	}

	public ConquestTransformationWarrior(Integer conquestTransformationWarriorId, Integer presentWarriorId) {
		this.conquestTransformationWarriorId = conquestTransformationWarriorId;
		this.presentWarriorId = presentWarriorId;
	}

	public Integer getConquestTransformationWarriorId() {
		return conquestTransformationWarriorId;
	}

	public void setConquestTransformationWarriorId(Integer conquestTransformationWarriorId) {
		this.conquestTransformationWarriorId = conquestTransformationWarriorId;
	}

	public Integer getPresentWarriorId() {
		return presentWarriorId;
	}

	public void setPresentWarriorId(Integer presentWarriorId) {
		this.presentWarriorId = presentWarriorId;
	}

	@Override
	public String toString() {
		return "ConquestTransformationWarrior [conquestTransformationWarriorId=" + conquestTransformationWarriorId
				+ ", presentWarriorId=" + presentWarriorId + "]";
	}
}