package com.sapient.dao;

public class DummyEmployeeDAO implements IEmployeeDAO{

	@Override
	public int getEmployeesCount() {
		return 0;
	}

	public void init() {
		System.out.println("------------ DummyEmployeeDAO.init()----------");
	}
	
	public void destroy() {
		System.out.println("------------ DummyEmployeeDAO.destroy()----------");
	}
}
