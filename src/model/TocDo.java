package model;

import java.time.LocalDate;

public abstract class TocDo extends HoaDonMang{
	protected HoaDonMang hoaDonMang;

	public TocDo(LocalDate ngayGuiHD, LocalDate ngayHetHan, String maKH, HoaDonMang hoaDonMang) {
		super(ngayGuiHD, ngayHetHan, maKH);
		this.hoaDonMang = hoaDonMang;
	}

	public HoaDonMang getHoaDonMang() {
		return hoaDonMang;
	}

	public void setHoaDonMang(HoaDonMang hoaDonMang) {
		this.hoaDonMang = hoaDonMang;
	}

	@Override
	public abstract int tinhTienHoaDon() ;
	public String inHoaDon() {
		return super.inHoaDon();
	}
}
