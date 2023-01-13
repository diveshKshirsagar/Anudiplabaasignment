package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Groceries;

public interface GroceriesRepository extends JpaRepository<Groceries,Integer> {
	
	//Custom Method
	//Groceries Find By Name
	
     public List<Groceries>findGroceriesByname(String name);
	
	
	
	

}
