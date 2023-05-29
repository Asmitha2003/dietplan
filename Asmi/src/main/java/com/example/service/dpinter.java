package com.example.service;

import java.util.List;

import com.example.model.dp;

public interface dpinter {
	public List<dp> getdp();
	public void savedp(dp d);
	public void updatedp(dp d);
	public void deldp(int id);
	
	
}
