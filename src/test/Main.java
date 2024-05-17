package test;

import java.time.LocalDate;

import model.Account;
import model.KhachHang;
import model.NganHang;
import model.ObserverKH;

public class Main {
	public static void main(String[] args) {
		NganHang nganHang = NganHang.getInstance();
		int[] maPin1= {1,6,0,3,0,4};
		ObserverKH khachHang1 = new KhachHang("111", "Hoài", LocalDate.of(2004, 3, 15), "Bình Định", "052204001778","0377314202", "hoai1603ot@gmail.com", new Account("1223123123","linhhoai11", maPin1));
		nganHang.themKhachHang(khachHang1);
		nganHang.guiThongBao();
		nganHang.setThongBao("ahihi");
		
		System.out.println(khachHang1.xemThongBao());
	}
}
