package com.jointableinheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeManager {
	
	public static void main(String[] args) {
		
		try {
			
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPASTinheritance");
		EntityManager entityManager = factory.createEntityManager();
		Employee employee1 = new Employee();
		employee1.setEmpId(301);
		employee1.setName("Ram");
		employee1.setSalary(98000);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee1);
		entityManager.getTransaction().commit();
		
		System.out.println("Employee Added Successfully...");
		
		Manager manager1 = new Manager();
		manager1.setEmpId(305);
		manager1.setName("Nandita");
		manager1.setSalary(48000);
		manager1.setDeptName("Computer Department");
		
		entityManager.getTransaction().begin();
		entityManager.persist(manager1);
		entityManager.getTransaction().commit();
		System.out.println("Manager Recorde added successfully");
		
		} catch (Exception e) {
			System.out.println("Error "+ e.getMessage());
		}
	}

}
