package cn.cigar.springbootcrud.mapper;

import cn.cigar.springbootcrud.entity.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee getEmployeeById(Integer id);

    @Select("select * from employee")
    public List<Employee> getEmployeeAll();

    @Insert("insert into employee (last_name, email, gender, department_id, birth) values (#{lastName}, #{email}, #{gender}, #{departmentId}, #{birth})")
    public Integer addEmployee(Employee employee);

    @Delete("delete from employee where id = #{id}")
    public Integer deleteEmployee(Integer id);
}
