package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.login;
import com.example.service.loginimp;

@RestController
public class logincon {
@Autowired
private loginimp li;

@GetMapping("/getdata")
public List<login> getlogin()
{
return li.getlogin();
}
@GetMapping("/find")
public List<login> findByIdAndName(int id,String name)
{
return li.findByIdAndName(id,name);
}
@PostMapping("/save")
public void savedata(@RequestBody login l)
{
li.savedata(l);
}
@PutMapping("/update")
public void updatedata(@RequestBody login l)
{
li.updatedata(l);
}
@DeleteMapping("/del")
public void deletedata(int id) {
li.deletedata(id);
}
}
