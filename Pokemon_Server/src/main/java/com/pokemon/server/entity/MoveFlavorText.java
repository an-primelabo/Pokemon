package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_move_flavor_text")
public class MoveFlavorText implements Serializable {
	private static final long serialVersionUID = 1114182153141303222L;

	@Column(name = "move_id")
	private Integer moveId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "flavor_text")
	private String flavorText;

	public MoveFlavorText() {
	}

	public MoveFlavorText(Integer moveId, Integer versionGroupId, String flavorText) {
		this.moveId = moveId;
		this.versionGroupId = versionGroupId;
		this.flavorText = flavorText;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	@Override
	public String toString() {
		return "MoveFlavorText [moveId=" + moveId + ", versionGroupId=" + versionGroupId + ", flavorText=" + flavorText
				+ "]";
	}
}