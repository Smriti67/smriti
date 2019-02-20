package com.cg.payroll.services;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
import java.util.List;

public interface PayrollServices {
	int acceptAssociateDetails (String firstName, String lastName, String emailId, String department,String designation, String pancard,
			int yearlyInvestmentUnder80C,  int basicSalary, int epf, int companyPf,
			int accountNumber, String bankName, String ifscCode);
	double calculateNetSalary (int associateId) throws AssociateDetailsNotfoundException;
	Associate getAssociateDetails(int associateId) throws AssociateDetailsNotfoundException;
	List<Associate> getAllAssociatesDetails();
}
