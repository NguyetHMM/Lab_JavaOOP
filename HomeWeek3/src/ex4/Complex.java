package ex4;

import javax.swing.JOptionPane;

public class Complex {
	private double phanThuc, phanAo;

	public Complex() {
		phanThuc = phanAo = 0.0;
	}

	public Complex(double phanThuc, double phanAo) {
		this.phanThuc = phanThuc;
		this.phanAo = phanAo;
	}

	public double getPhanThuc() {
		return phanThuc;
	}

	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}

	public double getPhanAo() {
		return phanAo;
	}

	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}

	public void nhapSoPhuc(Complex cmp) {
		String strPhanThuc, strPhanAo;
		double iPhanThuc, iPhanAo;
		strPhanThuc = JOptionPane.showInputDialog(null, "Nhap phan thuc: ", JOptionPane.INFORMATION_MESSAGE);
		iPhanThuc = Double.parseDouble(strPhanThuc);
		setPhanThuc(iPhanThuc);
		strPhanAo = JOptionPane.showInputDialog(null, "Nhap phan thuc: ", JOptionPane.INFORMATION_MESSAGE);
		iPhanAo = Double.parseDouble(strPhanAo);
		setPhanAo(iPhanAo);
	}

	public Complex congHaiSoPhuc(Complex cmp1, Complex cmp2) {
		Complex tong = new Complex();
		tong.phanThuc = cmp1.phanThuc + cmp2.phanThuc;
		setPhanThuc(tong.phanThuc);
		tong.phanAo = cmp1.phanAo + cmp2.phanAo;
		setPhanAo(tong.phanAo);
		return tong;
	}

	public Complex truHaiSoPhuc(Complex cmp1, Complex cmp2) {
		Complex hieu = new Complex();
		hieu.phanThuc = cmp1.phanThuc - cmp2.phanThuc;
		setPhanThuc(hieu.phanThuc);
		hieu.phanAo = cmp1.phanAo - cmp2.phanAo;
		setPhanAo(hieu.phanAo);
		return hieu;
	}

	public Complex nhanHaiSoPhuc(Complex cmp1, Complex cmp2) {
		Complex tich = new Complex();
		tich.phanThuc = cmp1.phanThuc * cmp2.phanThuc - cmp1.phanAo * cmp2.phanAo;
		setPhanThuc(tich.phanThuc);
		tich.phanAo = cmp1.phanAo * cmp2.phanThuc + cmp1.phanThuc * cmp2.phanAo;
		setPhanAo(tich.phanAo);
		return tich;
	}

	public Complex chiaHaiSoPhuc(Complex cmp1, Complex cmp2) {
		double modul;
		Complex thuong = new Complex();
		if (cmp2.phanThuc == 0 && cmp2.phanAo == 0) {
			JOptionPane.showMessageDialog(null, "Khong ton tai thuong! ");
			return null;
		} else {
			modul = cmp2.phanAo * cmp2.phanAo + cmp2.phanThuc * cmp2.phanThuc;
			thuong.phanThuc = (cmp1.phanThuc * cmp2.phanThuc + cmp1.phanAo * cmp2.phanAo) / modul;
			setPhanThuc(thuong.phanThuc);
			thuong.phanAo = (cmp1.phanAo * cmp2.phanThuc - cmp1.phanThuc * cmp2.phanAo) / modul;
			setPhanThuc(thuong.phanAo);
			return thuong;
		}
	}

	public void inSoPhuc(Complex cmp) {
		JOptionPane.showMessageDialog(null, "So Phuc: " + getPhanThuc() + "+" + getPhanAo() + "i");
	}
}
