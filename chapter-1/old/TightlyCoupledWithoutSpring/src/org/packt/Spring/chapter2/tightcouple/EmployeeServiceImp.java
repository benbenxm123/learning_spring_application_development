package org.packt.Spring.chapter2.tightcouple;

/**
 * 
 * @author RaviKantSoni
 * 
 */
public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Long generateEployeeID() {

		return System.currentTimeMillis();

	}

}
