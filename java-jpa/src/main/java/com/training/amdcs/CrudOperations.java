package com.training.amdcs;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Query;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

public class CrudOperations {
	
	public void insertEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		/*Employee emp=new Employee("Joe", 1500);
		entity.persist(emp);*/
		
		/*Student student1 = new Student("Martin", "B+");
		Student student2 = new Student("Daniel", "D");
		Student student3 = new Student("Elsa", "A");
		Student student4 = new Student("Anna", "B+");*/
		
		Student student = new Student("JM", "B+");
		
		entity.persist(student);
		
		/*entity.persist(student1);
		entity.persist(student2);
		entity.persist(student3);
		entity.persist(student4);*/
		
		
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
	}
	
	public void updateEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		/*Employee emp = entity.find(Employee.class, 1);
		
		emp.setSalary(2300);*/
		
		Student student = entity.find(Student.class, 2);
		student.setGrade("C+");
		
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
	
	}
	
	public void findEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		
		Employee emp = entity.find(Employee.class, 1);
		System.out.println("Employee Name: "+emp.getEmpName());
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
		
	}
	
	public void findGrade(String grade) {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		List<Student> results = entity.createQuery("select c from Student c where c.grade LIKE :grade")
				.setParameter("grade", grade)
				.getResultStream()
				.toList();
		
		results.stream()
		.forEach(s -> System.out.println(s.getStudentId() + "-" + s.getStudName() + "-" + s.getGrade()));
		
	}
	
	public void removeEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Employee emp = entity.find(Employee.class, 1);
		
		
		
		entity.remove(emp);
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
		
	}
	
	public void removeStudentWithGrade(String grade) {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		int removed = entity.createQuery("delete Student where grade = :grade")
				.setParameter("grade", grade).executeUpdate();
		
		entity.getTransaction().commit();
		
		
	}

}