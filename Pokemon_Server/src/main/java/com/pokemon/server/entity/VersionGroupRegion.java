package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_version_group_regions")
public class VersionGroupRegion implements Serializable {
	private static final long serialVersionUID = -7217419861691555330L;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "region_id")
	private Integer regionId;

	public VersionGroupRegion() {
	}

	public VersionGroupRegion(Integer versionGroupId, Integer regionId) {
		this.versionGroupId = versionGroupId;
		this.regionId = regionId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "VersionGroupRegion [versionGroupId=" + versionGroupId + ", regionId=" + regionId + "]";
	}
}