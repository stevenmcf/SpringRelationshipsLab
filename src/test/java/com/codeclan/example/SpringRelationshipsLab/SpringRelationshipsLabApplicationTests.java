package com.codeclan.example.SpringRelationshipsLab;

import com.codeclan.example.SpringRelationshipsLab.models.Department;
import com.codeclan.example.SpringRelationshipsLab.models.Employee;
import com.codeclan.example.SpringRelationshipsLab.models.Project;
import com.codeclan.example.SpringRelationshipsLab.repositories.DepartmentRepository;
import com.codeclan.example.SpringRelationshipsLab.repositories.EmployeeRepository;
import com.codeclan.example.SpringRelationshipsLab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department dept1 = new Department("RnD");
		departmentRepository.save(dept1);
		Employee employee = new Employee("Json", "Jsonson","125421", dept1);
		Employee employee1 = new Employee("Graham", "Grahamson","123456", dept1);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		Project project = new Project("The Craig David", 7);
		projectRepository.save(project);

	}

}
