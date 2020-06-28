package cn.cigar.springbootcrud;

import cn.cigar.springbootcrud.entity.Department;
import cn.cigar.springbootcrud.entity.Employee;
import cn.cigar.springbootcrud.mapper.DepartmentMapper;
import cn.cigar.springbootcrud.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SpringbootcrudApplicationTests {

	@Autowired
	public EmployeeMapper employeeMapper;

	@Autowired
	public DepartmentMapper departmentMapper;

	@Test
	void testAddEmployee() {
		Employee employee = new Employee();
		employee.setLastName("Cigar");
		employee.setDepartmentId(1);
		employee.setEmail("1505329414@qq.com");
		employee.setBirth(new Date());

		Integer integer = employeeMapper.addEmployee(employee);
		System.out.println("integer = " + integer);
	}


	@Test
	void testAddDepartment() {
		Department dept = new Department();
		dept.setDepartmentName("外交部");

		Integer integer = departmentMapper.addDepartment(dept);
		System.out.println("integer = " + integer);
	}

}
