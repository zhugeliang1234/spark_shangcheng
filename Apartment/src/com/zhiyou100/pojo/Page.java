package com.zhiyou100.pojo;

import java.util.List;

public class Page<E> {
private int currentPage;//当前页码
private int pageSize;//一共显示几条数据
private int totalCount;//总条目数量
private int pageCount;//分了几页
private List<E> list;//存放数据的集合
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalCount() {
	return totalCount;
}
public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
}
public int getPageCount() {
	
	
	return (int) Math.ceil((double)totalCount/pageSize);
}
public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}
public List<E> getList() {
	return list;
}
public void setList(List<E> list) {
	this.list = list;
}
@Override
public String toString() {
	return "Page [currentPage=" + currentPage + ", pageSize=" + pageSize + ", totalCount=" + totalCount + ", pageCount="
			+ pageCount + ", list=" + list + "]";
}

}
