package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.login;
import com.example.repository.loginrepo;

@Service
public class loginimp implements logininter {
@Autowired
private loginrepo lr;

@Override
public List<login> getlogin() {
return lr.findAll();
}
@Override
public void savedata(login l) {
lr.save(l);
}
@Override
public void updatedata(login l) {
lr.save(l);
}
@Override
public void deletedata(int id) {
lr.deleteById(id);
}
@Override
public List<login> findByIdAndName(int id, String name) {
return lr.findByIdAndName(id, name);
}
}
