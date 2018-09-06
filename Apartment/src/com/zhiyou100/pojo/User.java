package com.zhiyou100.pojo;

public class User {
private int u_id;
private String u_username;
private String u_password;
private String u_name;
private String u_tel;
private String u_sex;
public User(int u_id, String u_username, String u_password, String u_name, String u_tel, String u_sex) {
	super();
	this.u_id = u_id;
	this.u_username = u_username;
	this.u_password = u_password;
	this.u_name = u_name;
	this.u_tel = u_tel;
	this.u_sex = u_sex;
}
public User() {
	super();
}
public User(String u_username, String u_password, String u_name, String u_tel, String u_sex) {
	super();
	this.u_username = u_username;
	this.u_password = u_password;
	this.u_name = u_name;
	this.u_tel = u_tel;
	this.u_sex = u_sex;
}
public int getU_id() {
	return u_id;
}
public void setU_id(int u_id) {
	this.u_id = u_id;
}
public String getU_username() {
	return u_username;
}
public void setU_username(String u_username) {
	this.u_username = u_username;
}
public String getU_password() {
	return u_password;
}
public void setU_password(String u_password) {
	this.u_password = u_password;
}
public String getU_name() {
	return u_name;
}
public void setU_name(String u_name) {
	this.u_name = u_name;
}
public String getU_tel() {
	return u_tel;
}
public void setU_tel(String u_tel) {
	this.u_tel = u_tel;
}
public String getU_sex() {
	return u_sex;
}
public void setU_sex(String u_sex) {
	this.u_sex = u_sex;
}
@Override
public String toString() {
	return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_name=" + u_name
			+ ", u_tel=" + u_tel + ", u_sex=" + u_sex + "]";
}

}
