package com.springmvc.validation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ValidateDao 
{
	
    private JdbcTemplate jTemplate;
	
	public void setJTemplate(JdbcTemplate jTemplate) 
	{
		this.jTemplate = jTemplate;
	}
	
	public int save(Validate validate) 
	{
		String query = "insert into validation_details(username, password) values ('"+validate.getUsername()+"','"+validate.getPassword()+"')";
		return jTemplate.update(query);
	}
	
	public List<Validate> getEmployees()
	{
		return jTemplate.query("select * from validation_details", new RowMapper<Validate>() 
		{
		public Validate mapRow(ResultSet rs, int row)throws SQLException{
			Validate validate = new Validate();
			validate.setUsername(rs.getString(2));
			validate.setPassword(rs.getString(3));
			return validate;
		}
		});
	}

}
