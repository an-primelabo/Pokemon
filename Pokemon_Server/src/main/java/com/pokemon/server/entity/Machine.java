package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_machines")
public class Machine implements Serializable {
	private static final long serialVersionUID = 3134915340126184582L;

	@Column(name = "machine_number")
	private Integer machineNumber;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "item_id")
	private Integer itemId;

	@Column(name = "move_id")
	private Integer moveId;

	public Machine() {
	}

	public Machine(Integer machineNumber, Integer versionGroupId, Integer itemId, Integer moveId) {
		this.machineNumber = machineNumber;
		this.versionGroupId = versionGroupId;
		this.itemId = itemId;
		this.moveId = moveId;
	}

	public Integer getMachineNumber() {
		return machineNumber;
	}

	public void setMachineNumber(Integer machineNumber) {
		this.machineNumber = machineNumber;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getMoveId() {
		return moveId;
	}

	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}

	@Override
	public String toString() {
		return "Machine [machineNumber=" + machineNumber + ", versionGroupId=" + versionGroupId + ", itemId=" + itemId
				+ ", moveId=" + moveId + "]";
	}
}