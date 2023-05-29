package com.example.service;

import java.util.List;
import com.example.model.login;

public interface logininter {
public List<login> getlogin();
public void savedata(login l);
public void updatedata(login l);
public void deletedata(int id);
public List<login> findByIdAndName(int id,String name);
}
