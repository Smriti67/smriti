package com.cg.payroll.services;

import java.util.List;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;

public class PayrollServicesImpl implements PayrollServices
{
	private AssociateDAO associateDao=new AssociateDAOImpl();

	@Override
	public boolean update(Associate associate) {
		// TODO Auto-generated method stub
		return false;
	}

	public Associate save(Associate associate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Associate findOne(int associateId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Associate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int acceptAssociateDetails(String firstName, String lastName, String emailId, String department,
			String designation, String pancard, int yearlyInvestmentUnder8oC, int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode) {

		/**/
		Associate associate=new Associate(yearlyInvestmentUnder8oC, firstName, lastName, department, designation, pancard, emailId,new Salary(basicSalary,epf,companyPf),new BankDetails(accountNumber,bankName,ifscCode));
		associate =associateDao.save(associate);
		return associate.getAssociateId();
	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException {
		Associate  associate=getAssociateDetails(associateId);
		associate.salary.setHra((associate.salary.getBasicSalary()*30)/100);	
		associate.salary.setConveyenceAllowance((associate.salary.getBasicSalary()*30)/100);
		associate.salary.setPersonalAllowance((associate.salary.getBasicSalary()*20)/100);
		associate.salary.setOtherAllowance((associate.salary.getBasicSalary()*30)/100);

		associate.salary.setNetSalary(((associate.salary.getBasicSalary()+associate.salary.getHra()+associate.salary.getConveyenceAllowance()+associate.salary.getOtherAllowance()
		+associate.salary.getPersonalAllowance())-(associate.salary.getCompanyPf()+associate.salary.getEpf()))*12);

		return associate.salary.getNetSalary();
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws AssociateDetailNotFoundException {
		Associate associates=associateDao.findOne(associateId);
		if(associates==null)
			throw new AssociateDetailNotFoundException("Associate Details not found for id"+associateId);
		return associates;
	}

	@Override
	public List<Associate> getAllAssociatesDetails() {
		return associateDao.findAll();
	}

	@Override
	public Object getAssociateDetails(Associate associateId) {
		// TODO Auto-generated method stub
		return null;
	}

}