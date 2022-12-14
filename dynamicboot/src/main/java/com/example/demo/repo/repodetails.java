package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Mydata;

public interface repodetails extends JpaRepository<Mydata, Integer>
{
	Mydata findById(int id);

}
