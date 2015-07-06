package com.hibernateoneonebidirectionalforeinkey.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PASSPORT", schema="mydb")
public class Passport implements Serializable {

	private static final long serialVersionUID = -4319317279818737860L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PID")
	private Integer pId;

	@Column(name = "PNO", insertable = true, updatable = true, nullable = true, unique = true)
	private Integer pNo;

	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Person person;

	public Passport() {
	}

	public Passport(Integer pNo) {
		super();
		this.pNo = pNo;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public Integer getpNo() {
		return pNo;
	}

	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [pId=" + pId + ", pNo=" + pNo + ", person=" + person
				+ "]";
	}

}
