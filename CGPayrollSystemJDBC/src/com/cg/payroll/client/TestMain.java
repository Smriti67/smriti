package com.cg.payroll.client;

import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class TestMain {

	public static void main(String[] args) {
		PayrollServices services = new PayrollServicesImpl();

		int associateId = services.acceptAssociateDetails("tamanna", "gupta", "tamanna2104@gmail.com", "JEE", "Intern", "PIDGH6754G", 74121, 500000, 75208, 28000, 769456957, "ICICI", "ICICI1234");
		System.out.println("Associate Id:-" + associateId);
		
		try {
			System.out.println("Net Salary"+services.calculateNetSalary(associateId));
		} catch (AssociateDetailsNotfoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(services.getAssociateDetails(1));
		} catch (AssociateDetailsNotfoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
