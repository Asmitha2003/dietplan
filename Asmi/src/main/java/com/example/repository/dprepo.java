package com.example.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.dp;

@Repository
public interface dprepo extends JpaRepository<dp,Integer> 
{
	


	}

