package com.cg.payroll.beans;
public class Associate {


	private int associateId;
	private int yearlyInvestmentUnder8oC;
	private String firstName,lastName,department,designation,pancard,emailId;
	public Salary salary;
	public BankDetails bankDetails;
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", yearlyInvestmentUnder8oC=" + yearlyInvestmentUnder8oC
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + ", pancard=" + pancard + ", emailId=" + emailId + ", salary="
				+ salary + ", bankDetails=" + bankDetails + "]";
	}

	public Associate() {
		super();
	}

	public Associate(int yearlyInvestmentUnder8oC, String firstName, String lastName, String department,
			String designation, String pancard, String emailId, Salary salary, BankDetails bankDetails) {
		super();
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.pancard = pancard;
		this.emailId = emailId;
		this.salary=salary;
		this.bankDetails=bankDetails;

	}

	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public int getYearlyInvestmentUnder8oC() {
		return yearlyInvestmentUnder8oC;
	}
	public void setYearlyInvestmentUnder8oC(int yearlyInvestmentUnder8oC) {
		this.yearlyInvestmentUnder8oC = yearlyInvestmentUnder8oC;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



}