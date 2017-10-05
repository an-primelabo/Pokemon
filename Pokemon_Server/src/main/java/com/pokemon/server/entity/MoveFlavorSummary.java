package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_flavor_summaries")
public class MoveFlavorSummary implements Serializable {
	private static final long serialVersionUID = -7214938779614526584L;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "flavor_summary")
	private String flavorSummary;

	public MoveFlavorSummary() {
	}

	public MoveFlavorSummary(Integer moveId, String flavorSummary) {
		this.moveId = moveId;
		this.flavorSummary = flavorSummary;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public String getFlavorSummary() {
		return flavorSummary;
	}

	public void setFlavorSummary(String flavorSummary) {
		this.flavorSummary = flavorSummary;
	}

	@Override
	public String toString() {
		return "MoveFlavorSummary [moveId=" + moveId + ", flavorSummary=" + flavorSummary + "]";
	}
}