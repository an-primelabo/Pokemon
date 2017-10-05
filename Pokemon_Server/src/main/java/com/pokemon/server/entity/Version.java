package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_versions")
public class Version implements Serializable {
	private static final long serialVersionUID = 8503993859851968165L;

	@Id
	@Column(name = "version_id", unique = true, nullable = false)
	private Integer versionId;

	@Column(name = "version_group_id")
	private Integer versionGroupId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public Version() {
	}

	public Version(Integer versionId, Integer versionGroupId, String name, String nameAlias) {
		this.versionId = versionId;
		this.versionGroupId = versionGroupId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Integer getVersionGroupId() {
		return versionGroupId;
	}

	public void setVersionGroupId(Integer versionGroupId) {
		this.versionGroupId = versionGroupId;
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
		return "Version [versionId=" + versionId + ", versionGroupId=" + versionGroupId + ", name=" + name
				+ ", nameAlias=" + nameAlias + "]";
	}
}