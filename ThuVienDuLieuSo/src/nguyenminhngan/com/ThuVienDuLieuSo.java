package nguyenminhngan.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ThuVienDuLieuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1111111/3;
		int y=3/18;
		System.out.println(x);
		System.out.println(y);
		DecimalFormat dcf = new DecimalFormat("#,###");
		DecimalFormat sothapphan = new DecimalFormat("#.##");
		System.out.println(dcf.format(x));
		DecimalFormatSymbols dcsf= new DecimalFormatSymbols(Locale.getDefault());
		dcsf.setGroupingSeparator('.');
		dcf.setDecimalFormatSymbols(dcsf);
	}

}
