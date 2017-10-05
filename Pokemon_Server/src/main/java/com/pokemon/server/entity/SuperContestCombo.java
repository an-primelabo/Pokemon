package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_super_contest_combos")
public class SuperContestCombo implements Serializable {
	private static final long serialVersionUID = 1845721570591968381L;

	@Column(name = "first_move_id")
	private Integer firstMoveId;

	@Column(name = "second_move_id")
	private Integer secondMoveId;

	public SuperContestCombo() {
	}

	public SuperContestCombo(Integer firstMoveId, Integer secondMoveId) {
		this.firstMoveId = firstMoveId;
		this.secondMoveId = secondMoveId;
	}

	public Integer getFirstMoveId() {
		return firstMoveId;
	}

	public void setFirstMoveId(Integer firstMoveId) {
		this.firstMoveId = firstMoveId;
	}

	public Integer getSecondMoveId() {
		return secondMoveId;
	}

	public void setSecondMoveId(Integer secondMoveId) {
		this.secondMoveId = secondMoveId;
	}

	@Override
	public String toString() {
		return "SuperContestCombo [firstMoveId=" + firstMoveId + ", secondMoveId=" + secondMoveId + "]";
	}
}