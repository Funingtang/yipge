package com.oracle.entity;

public class shop_category {
	private int cid; //����id
	private String cname; //��������
	private int parentid; //�ϼ�����
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public shop_category(int cid, String cname, int parentid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.parentid = parentid;
	}
	public shop_category() {
		super();
	}
	@Override
	public String toString() {
		return "shop_category [cid=" + cid + ", cname=" + cname + ", parentid=" + parentid + "]";
	}
	
}
