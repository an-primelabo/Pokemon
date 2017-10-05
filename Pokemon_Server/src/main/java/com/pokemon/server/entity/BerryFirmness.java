package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_berry_firmness")
public class BerryFirmness implements Serializable {
	private static final long serialVersionUID = -1822153201102109696L;

	@Id
	@Column(name = "berry_firmness_id", unique = true, nullable = false)
	private Integer berryFirmnessId;

	@Column(name = "name", length = 16)
	private String name;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public BerryFirmness() {
	}

	public BerryFirmness(Integer berryFirmnessId, String name, String nameAlias) {
		this.berryFirmnessId = berryFirmnessId;
		this.name = name;
		this.nameAlias = nameAlias;
	}

	public Integer getBerryFirmnessId() {
		return berryFirmnessId;
	}

	public void setBerryFirmnessId(Integer berryFirmnessId) {
		this.berryFirmnessId = berryFirmnessId;
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
		return "BerryFirmness [berryFirmnessId=" + berryFirmnessId + ", name=" + name + ", nameAlias=" + nameAlias
				+ "]";
	}
}