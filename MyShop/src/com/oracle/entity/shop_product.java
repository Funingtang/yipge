package com.oracle.entity;

public class shop_product {
	private int pid; // ��Ʒid
	private String pname;// ��Ʒ����
	private String pdesc;// ��Ʒ����
	private double price;// ��Ʒ�۸�
	private int stock;// ��Ʒ���
	private int cid;// ��Ʒ����
	private int parentid;// ��Ʒ�ϼ�����
	private String imgname;// ͼƬ����
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public shop_product(int pid, String pname, String pdesc, double price, int stock, int cid, int parentid,
			String imgname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.price = price;
		this.stock = stock;
		this.cid = cid;
		this.parentid = parentid;
		this.imgname = imgname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	@Override
	public String toString() {
		return "shop_product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", price=" + price + ", stock="
				+ stock + ", cid=" + cid + ", parentid=" + parentid + ", imgname=" + imgname + "]";
	}
	public shop_product() {
		super();
	}
	
}
