package model;

import java.time.LocalDate;

public abstract class HoaDonMang extends HoaDon{

	public HoaDonMang(LocalDate ngayGuiHD, LocalDate ngayHetHan, String maKH) {
		super(ngayGuiHD, ngayHetHan, maKH);
		// TODO Auto-generated constructor stub
		this.soTien = 150000;
	}
	
	@Override
	public abstract int tinhTienHoaDon();

	@Override
	public String inHoaDon() {
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append("----- Hóa Đơn Mạng -----\n");
	    stringBuilder.append("Ngày gửi hóa đơn: ").append(getNgayGuiHD()).append("\n");
	    stringBuilder.append("Ngày hết hạn thanh toán: ").append(getNgayHetHan()).append("\n");
	    stringBuilder.append("Mã khách hàng: ").append(getMaKH()).append("\n");
	    stringBuilder.append("Số tiền phí mạng: ").append(soTien).append(" VNĐ\n");
	    
	    return stringBuilder.toString();
	}

}
