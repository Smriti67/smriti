package com.cg.payroll.beans;
public class Salary {
	@Override
	public String toString() {
		return "Salary [basicSalary=" + basicSalary + ", hra=" + hra + ", conveyenceAllowance=" + conveyenceAllowance
				+ ", otherAllowance=" + otherAllowance + ", personalAllowance=" + personalAllowance + ", monthlyTax="
				+ monthlyTax + ", epf=" + epf + ", companyPf=" + companyPf + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}
	private int basicSalary,hra,conveyenceAllowance;
	private int otherAllowance,personalAllowance,monthlyTax,epf ;
	private int companyPf,grossSalary,netSalary;
	public Salary() {
		super();
	}
	public Salary(int basicSalary, int epf, int companyPf) {
		super();
		this.basicSalary = basicSalary;
		this.epf = epf;
		this.companyPf = companyPf;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}
	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getPersonalAllowance() {
		return personalAllowance;
	}
	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}
	public int getMonthlyTax() {
		return monthlyTax;
	}
	public void setMonthlyTax(int monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	public int getEpf() {
		return epf;
	}
	public void setEpf(int epf) {
		this.epf = epf;
	}
	public int getCompanyPf() {
		return companyPf;
	}
	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}


}