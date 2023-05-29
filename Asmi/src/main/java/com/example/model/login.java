package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Asmitha")
public class login {
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Id
@Column(name="id")
private int id;
public login() {
super();
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}

private String name;
private String password;
@Override
public String toString() {
return "login [id=" + id + ", name=" + name + ", password=" + password + "]";
}
}


