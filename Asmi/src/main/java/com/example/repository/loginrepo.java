package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.login;

	@Repository
	public interface loginrepo extends JpaRepository<login,Integer>{
	public List<login> findByIdAndName(int id,String name);
	}


