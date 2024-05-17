package model;

import java.time.LocalDate;

public abstract class DichVu extends HoaDonMang {
	protected HoaDonMang hoaDonMang;

	public DichVu(LocalDate ngayGuiHD, LocalDate ngayHetHan, String maKH, HoaDonMang hoaDonMang) {
		super(ngayGuiHD, ngayHetHan, maKH);
		// TODO Auto-generated constructor stub
		this.hoaDonMang = hoaDonMang;
	}

	@Override
	public abstract int tinhTienHoaDon();

	@Override
	public  String inHoaDon() {
		return super.inHoaDon();
	};

}
