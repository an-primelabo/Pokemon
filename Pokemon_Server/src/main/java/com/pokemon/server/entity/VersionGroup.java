package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_version_groups")
public class VersionGroup implements Serializable {
	private static final long serialVersionUID = -895337055054474164L;

	@Id
	@Column(name = "version_group_id", unique = true, nullable = false)
	private Integer versionGroupId;

	@Column(name = "name_alias", length = 32)
	private String nameAlias;

	@Column(name = "generation_id")
	private Integer generationId;

	@Column(name = "order_no")
	private Integer orderNo;

	public VersionGroup() {
	}

	public VersionGroup(Integer versionGroupId, String nameAlias, Integer generationId, Integer orderNo) {
		this.versionGroupId = versionGroupId;
		this.nameAlias = nameAlias;
		this.generationId = generationId;
		this.orderNo = orderNo;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public Integer getGenerationId() {
		return generationId;
	}

	public void setGenerationId(Integer generationId) {
		this.generationId = generationId;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "VersionGroup [versionGroupId=" + versionGroupId + ", nameAlias=" + nameAlias + ", generationId="
				+ generationId + ", orderNo=" + orderNo + "]";
	}
}