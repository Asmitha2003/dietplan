package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.dp;
import com.example.repository.dprepo;

public class dpimp implements dpinter {
	@Autowired 
	private dprepo dr;

	@Override
	public List<dp> getdp() {
		return dr.findAll();
	}
	@Override
	public void savedp(dp d) {
		dr.save(d);
	}
	@Override
	public void updatedp(dp d) {
		dr.save(d);
	}
	@Override
	public void deldp(int id) {
		dr.deleteById(id);
	}
	


}
