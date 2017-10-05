package com.pokemon.server.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pkm_genders")
public class Gender implements Serializable {
	private static final long serialVersionUID = 675870323354958715L;

	@Id
	@Column(name = "gender_id", unique = true, nullable = false)
	private Integer genderId;

	@Column(name = "name_alias", length = 16)
	private String nameAlias;

	public Gender() {
	}

	public Gender(Integer genderId, String nameAlias) {
		this.genderId = genderId;
		this.nameAlias = nameAlias;
	}

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getNameAlias() {
		return nameAlias;
	}

	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	@Override
	public String toString() {
		return "Gender [genderId=" + genderId + ", nameAlias=" + nameAlias + "]";
	}
}