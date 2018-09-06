package com.zhiyou100.pojo;

import java.util.Date;

public class Rent {
private int r_id;
private double r_money;
private Date r_time;
private String r_remark;
private House house;
private Lessee lessee;
public Rent() {
	super();
}
public Rent(int r_id, double r_money, Date r_time, String r_remark, House house, Lessee lessee) {
	super();
	this.r_id = r_id;
	this.r_money = r_money;
	this.r_time = r_time;
	this.r_remark = r_remark;
	this.house = house;
	this.lessee = lessee;
}
public Rent(double r_money, Date r_time, String r_remark, House house, Lessee lessee) {
	super();
	this.r_money = r_money;
	this.r_time = r_time;
	this.r_remark = r_remark;
	this.house = house;
	this.lessee = lessee;
}
public int getR_id() {
	return r_id;
}
public void setR_id(int r_id) {
	this.r_id = r_id;
}
public double getR_money() {
	return r_money;
}
public void setR_money(double r_money) {
	this.r_money = r_money;
}
public Date getR_time() {
	return r_time;
}
public void setR_time(Date r_time) {
	this.r_time = r_time;
}
public String getR_remark() {
	return r_remark;
}
public void setR_remark(String r_remark) {
	this.r_remark = r_remark;
}
public House getHouse() {
	return house;
}
public void setHouse(House house) {
	this.house = house;
}
public Lessee getLessee() {
	return lessee;
}
public void setLessee(Lessee lessee) {
	this.lessee = lessee;
}
@Override
public String toString() {
	return "Rent [r_id=" + r_id + ", r_money=" + r_money + ", r_time=" + r_time + ", r_remark=" + r_remark + ", house="
			+ house + ", lessee=" + lessee + "]";
}


}
