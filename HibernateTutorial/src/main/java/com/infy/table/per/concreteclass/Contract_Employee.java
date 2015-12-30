package com.infy.table.per.concreteclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="concretecontract")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class Contract_Employee extends Employee {
	
	private float pay_per_year;
	
	private String contact_duration;

	public float getPay_per_year() {
		return pay_per_year;
	}

	public void setPay_per_year(float pay_per_year) {
		this.pay_per_year = pay_per_year;
	}

	public String getContact_duration() {
		return contact_duration;
	}

	public void setContact_duration(String contact_duration) {
		this.contact_duration = contact_duration;
	}
}
