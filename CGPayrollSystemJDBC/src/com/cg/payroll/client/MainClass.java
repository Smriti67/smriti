package com.cg.payroll.client;

import com.cg.payroll.exceptions.AssociateDetailsNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {

	public static void main(String[] args) {
		PayrollServices services = new PayrollServicesImpl();
		
		int associateId = services.acceptAssociateDetails("Akshay", "Kataria", "aktariail.com", "fsbu", "Intern", "7985vsgg0", 6780, 700000, 75280, 2800, 769456957, "CITI", "citi001");
		System.out.println("Associate Id:-" + associateId);
		
		
		try {
			System.out.println(services.getAssociateDetails(associateId));
		} catch (AssociateDetailsNotfoundException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
