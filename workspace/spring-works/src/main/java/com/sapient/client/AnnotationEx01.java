package com.sapient.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.sapient.config.AppConfig;
import com.sapient.dao.IEmployeeDAO;
import com.sapient.dao.JDBCEmployeeDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnnotationEx01 {
	public static void main(String[] args) {
		ApplicationContext context = 
			new AnnotationConfigApplicationContext(AppConfig.class);
		
		IEmployeeDAO empDao = (IEmployeeDAO) context.getBean("my-funny-dummy"); 
		log.info("Number of Employees- DummyDao {}", empDao.getEmployeesCount());
		log.info("Hash Code of empDao {}", empDao.hashCode());
		
		IEmployeeDAO empDao1 = (IEmployeeDAO) context.getBean("my-funny-dummy"); 
		log.info("Number of Employees- DummyDao {}", empDao1.getEmployeesCount());
		log.info("Hash Code of empDao1 {}", empDao1.hashCode());
		
		empDao = context.getBean("jdbcDao", JDBCEmployeeDAO.class); 
		log.info("Number of Employees- JdbcDao {}", empDao.getEmployeesCount());
		
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}
