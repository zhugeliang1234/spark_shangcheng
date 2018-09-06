package com.zhiyou100.pojo;

import java.io.Serializable;
import java.util.Date;

public class Lessee  implements Serializable{
private int l_id;
private String l_name;
private String l_tel;
private String l_sex;
private String l_home;
private String l_card;
private Date l_addtime;
private byte l_ljsc;
public Lessee() {
	super();
}
public Lessee(int l_id, String l_name, String l_tel, String l_sex, String l_home, String l_card, Date l_addtime,
		byte l_ljsc) {
	super();
	this.l_id = l_id;
	this.l_name = l_name;
	this.l_tel = l_tel;
	this.l_sex = l_sex;
	this.l_home = l_home;
	this.l_card = l_card;
	this.l_addtime = l_addtime;
	this.l_ljsc = l_ljsc;
}
public Lessee(String l_name, String l_tel, String l_sex, String l_home, String l_card, Date l_addtime, byte l_ljsc) {
	super();
	this.l_name = l_name;
	this.l_tel = l_tel;
	this.l_sex = l_sex;
	this.l_home = l_home;
	this.l_card = l_card;
	this.l_addtime = l_addtime;
	this.l_ljsc = l_ljsc;
}
public int getL_id() {
	return l_id;
}
public void setL_id(int l_id) {
	this.l_id = l_id;
}
public String getL_name() {
	return l_name;
}
public void setL_name(String l_name) {
	this.l_name = l_name;
}
public String getL_tel() {
	return l_tel;
}
public void setL_tel(String l_tel) {
	this.l_tel = l_tel;
}
public String getL_sex() {
	return l_sex;
}
public void setL_sex(String l_sex) {
	this.l_sex = l_sex;
}
public String getL_home() {
	return l_home;
}
public void setL_home(String l_home) {
	this.l_home = l_home;
}
public String getL_card() {
	return l_card;
}
public void setL_card(String l_card) {
	this.l_card = l_card;
}
public Date getL_addtime() {
	return l_addtime;
}
public void setL_addtime(Date l_addtime) {
	this.l_addtime = l_addtime;
}
public byte getL_ljsc() {
	return l_ljsc;
}
public void setL_ljsc(byte l_ljsc) {
	this.l_ljsc = l_ljsc;
}

}
