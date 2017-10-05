package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_flag_map")
public class MoveFlagMap implements Serializable {
	private static final long serialVersionUID = -7041906996459127004L;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "move_flag_id")
	private Integer moveFlagId;

	public MoveFlagMap() {
	}

	public MoveFlagMap(Integer moveId, Integer moveFlagId) {
		this.moveId = moveId;
		this.moveFlagId = moveFlagId;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public Integer getMoveFlagId() {
		return moveFlagId;
	}

	public void setMoveFlagId(Integer moveFlagId) {
		this.moveFlagId = moveFlagId;
	}

	@Override
	public String toString() {
		return "MoveFlagMap [moveId=" + moveId + ", moveFlagId=" + moveFlagId + "]";
	}
}