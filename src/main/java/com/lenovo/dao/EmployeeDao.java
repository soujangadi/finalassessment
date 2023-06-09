package com.lenovo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.lenovo.beans.Employee;

public class EmployeeDao {
	JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public int saveEmployee(Employee emp) {
     String insertQuery="Insert into Employee(empname,salary,designation)values('"
	+emp.getEmpname()
+"',"+emp.getSalary()+",'"
	+emp.getDesignation()+"')";
	return template.update(insertQuery);
	}
		
	public int updateEmployee(Employee emp) {
		String updateQuery ="Update Employee set empname='"+emp.getEmpname()+"',salary="
+emp.getSalary()+",designation='"+emp.getDesignation()+"'"
+"where id="+emp.getId()+"";
		return template.update(updateQuery);
		
	}
	
	public int deleteEmployee(int id) {
		String deleteQuery ="Delete from Empkoyee where id="+id;
		return template.update(deleteQuery);
	}
	
    public Employee getEmployeeById(int id) {
	String fetchsingleRecord ="Select * from Employee where id=?";
	return template.queryForObject(fetchsingleRecord,
			new Object[] {id},
			new BeanPropertyRowMapper<Employee>(Employee.class));
}
  public List<Employee> getAllEmployees(){
	  return template.query("Select * from Employee",new RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e= new Employee();
		e.setId(rs.getInt(1));
		e.setEmpname(rs.getString(2));
		e.setSalary(rs.getDouble(3));
		e.setDesignation(rs.getString(4));
			return e;
		}
		  
		 
	  });	  
	  
  }
}
