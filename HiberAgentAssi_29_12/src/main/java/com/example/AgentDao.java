package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao {
	JdbcTemplate jdbcTemplate;
	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) //JdbcTemplate method/connection
	{
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	public int saveAgent(Agent a) // save/Insert  method
	{
		String query="insert into Agent values('"+a.getId()+"','"+a.getName()+"','"+a.getSalary()+"')";
		return jdbcTemplate.update(query);
		
	}
	
	public int updateAgent(Agent a) // update method
	{
		String query="update Agent set salary='"+a.getSalary()+"'where id='"+a.getId()+"'";
		return jdbcTemplate.update(query);
	}
	public int deleteAgent(Agent a)  // delete method
	{
		String query="delete from Agent where id='"+a.getId()+"'";
		return jdbcTemplate.update(query);
		
		
		
	}

}
