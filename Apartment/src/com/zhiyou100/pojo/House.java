package com.zhiyou100.pojo;

import java.util.Date;

public class House {
private int h_id;
private String h_dq;
private String h_xq;
private	String h_dy;
private int h_lc;
private String h_fj;
private double h_mj;
private String h_cx;
private String h_zx;
private String h_sq;
private int h_xz;
private String h_pz;
private double h_jg;
private String h_zt;
private String h_dz;
private Date h_tjsj;
private Date h_xgsj;
private byte hd_ljsc;
public House() {
	super();
}
public House(int h_id, String h_dq, String h_xq, String h_dy, int h_lc, String h_fj, double h_mj, String h_cx,
		String h_zx, String h_sq, int h_xz, String h_pz, double h_jg, String h_zt, String h_dz, Date h_tjsj,
		Date h_xgsj, byte hd_ljsc) {
	super();
	this.h_id = h_id;
	this.h_dq = h_dq;
	this.h_xq = h_xq;
	this.h_dy = h_dy;
	this.h_lc = h_lc;
	this.h_fj = h_fj;
	this.h_mj = h_mj;
	this.h_cx = h_cx;
	this.h_zx = h_zx;
	this.h_sq = h_sq;
	this.h_xz = h_xz;
	this.h_pz = h_pz;
	this.h_jg = h_jg;
	this.h_zt = h_zt;
	this.h_dz = h_dz;
	this.h_tjsj = h_tjsj;
	this.h_xgsj = h_xgsj;
	this.hd_ljsc = hd_ljsc;
}
public House(String h_dq, String h_xq, String h_dy, int h_lc, String h_fj, double h_mj, String h_cx, String h_zx,
		String h_sq, int h_xz, String h_pz, double h_jg, String h_zt, String h_dz, Date h_tjsj, Date h_xgsj,
		byte hd_ljsc) {
	super();
	this.h_dq = h_dq;
	this.h_xq = h_xq;
	this.h_dy = h_dy;
	this.h_lc = h_lc;
	this.h_fj = h_fj;
	this.h_mj = h_mj;
	this.h_cx = h_cx;
	this.h_zx = h_zx;
	this.h_sq = h_sq;
	this.h_xz = h_xz;
	this.h_pz = h_pz;
	this.h_jg = h_jg;
	this.h_zt = h_zt;
	this.h_dz = h_dz;
	this.h_tjsj = h_tjsj;
	this.h_xgsj = h_xgsj;
	this.hd_ljsc = hd_ljsc;
}
public int getH_id() {
	return h_id;
}
public void setH_id(int h_id) {
	this.h_id = h_id;
}
public String getH_dq() {
	return h_dq;
}
public void setH_dq(String h_dq) {
	this.h_dq = h_dq;
}
public String getH_xq() {
	return h_xq;
}
public void setH_xq(String h_xq) {
	this.h_xq = h_xq;
}
public String getH_dy() {
	return h_dy;
}
public void setH_dy(String h_dy) {
	this.h_dy = h_dy;
}
public int getH_lc() {
	return h_lc;
}
public void setH_lc(int h_lc) {
	this.h_lc = h_lc;
}
public String getH_fj() {
	return h_fj;
}
public void setH_fj(String h_fj) {
	this.h_fj = h_fj;
}
public double getH_mj() {
	return h_mj;
}
public void setH_mj(double h_mj) {
	this.h_mj = h_mj;
}
public String getH_cx() {
	return h_cx;
}
public void setH_cx(String h_cx) {
	this.h_cx = h_cx;
}
public String getH_zx() {
	return h_zx;
}
public void setH_zx(String h_zx) {
	this.h_zx = h_zx;
}
public String getH_sq() {
	return h_sq;
}
public void setH_sq(String h_sq) {
	this.h_sq = h_sq;
}
public int getH_xz() {
	return h_xz;
}
public void setH_xz(int h_xz) {
	this.h_xz = h_xz;
}
public String getH_pz() {
	return h_pz;
}
public void setH_pz(String h_pz) {
	this.h_pz = h_pz;
}
public double getH_jg() {
	return h_jg;
}
public void setH_jg(double h_jg) {
	this.h_jg = h_jg;
}
public String getH_zt() {
	return h_zt;
}
public void setH_zt(String h_zt) {
	this.h_zt = h_zt;
}
public String getH_dz() {
	return h_dz;
}
public void setH_dz(String h_dz) {
	this.h_dz = h_dz;
}
public Date getH_tjsj() {
	return h_tjsj;
}
public void setH_tjsj(Date h_tjsj) {
	this.h_tjsj = h_tjsj;
}
public Date getH_xgsj() {
	return h_xgsj;
}
public void setH_xgsj(Date h_xgsj) {
	this.h_xgsj = h_xgsj;
}
public byte getHd_ljsc() {
	return hd_ljsc;
}
public void setHd_ljsc(byte hd_ljsc) {
	this.hd_ljsc = hd_ljsc;
}
@Override
public String toString() {
	return "House [h_id=" + h_id + ", h_dq=" + h_dq + ", h_xq=" + h_xq + ", h_dy=" + h_dy + ", h_lc=" + h_lc + ", h_fj="
			+ h_fj + ", h_mj=" + h_mj + ", h_cx=" + h_cx + ", h_zx=" + h_zx + ", h_sq=" + h_sq + ", h_xz=" + h_xz
			+ ", h_pz=" + h_pz + ", h_jg=" + h_jg + ", h_zt=" + h_zt + ", h_dz=" + h_dz + ", h_tjsj=" + h_tjsj
			+ ", h_xgsj=" + h_xgsj + ", hd_ljsc=" + hd_ljsc + "]";
}

}
