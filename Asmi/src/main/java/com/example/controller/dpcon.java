package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.dp;
import com.example.service.dpimp;



@RestController
public class dpcon {
	@Autowired
	private dpimp di;
	
	@GetMapping("/getdata")
	public List<dp> getdpdata()
	{
		return di.getdp();
	}
    @PostMapping("/postdp")
	public void postdp(@RequestBody dp d)
	{
		di.savedp(d);
	}
	
	@PutMapping("/putdp")
	public void updp(@RequestBody dp d,@RequestParam int id)
	{
		d.setId(id);
		di.updatedp(d);
	}
	
	@DeleteMapping("/deldp")
	public void del(@RequestParam int id)
	{
		di.deldp(id);
	}
}
	
	

