package model;

import java.time.LocalDate;

public class KPlus extends DichVu{

	public KPlus(LocalDate ngayGuiHD, LocalDate ngayHetHan, String maKH, HoaDonMang hoaDonMang) {
		super(ngayGuiHD, ngayHetHan, maKH, hoaDonMang);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int tinhTienHoaDon() {
		return hoaDonMang.soTien + 30000;
	}

	@Override
	public String inHoaDon() {
		String result = super.inHoaDon();
		result+= "Dịch vụ: KPlus\n"+ "Tổng số tiền: "+this.tinhTienHoaDon();
		return result;
	}
	
}
