package cn.cigar.springbootcrud.mapper;

import cn.cigar.springbootcrud.entity.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDepartmentById(Integer id);

    @Select("select * from department")
    public List<Department> getDepartmentAll();

    @Insert("insert into department (department_name) values (#{departmentName})")
    public Integer addDepartment(Department department);

    @Delete("delete from department where id = #{id}")
    public Integer deleteDepartment(Integer id);
}
