package buoi7.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class I18NDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle rs = ResourceBundle.getBundle("buoi7.i18n.dangonngu");
		String datve_label_val = rs.getString("datve_label");
		System.out.println("datve_label_val="+ datve_label_val);
		System.out.println("hello value="+ rs.getString("xinchao"));
		System.out.println("Hien thi tat ca key - value trong properties:");
		Set<String> setKey = rs.keySet();
		for(String key : setKey) {
			System.out.println(key + ": "+ rs.getString(key));
		}
		System.out.println("Hien thi tat ca key - value trong properties Viet nam:");
		Locale vn = new Locale("vi", "VN");
		ResourceBundle rsvn = ResourceBundle.getBundle("buoi7.i18n.dangonngu", vn);
		Set<String> setKeyvn = rsvn.keySet();
		for(String key : setKeyvn) {
			System.out.println(key + ": "+ rsvn.getString(key));
		}
		System.out.println("Hien thi tat ca key - value trong properties English:");
		Locale en = new Locale("en", "EN");
		rsvn = ResourceBundle.getBundle("buoi7.i18n.dangonngu", en);
		setKeyvn = rsvn.keySet();
		for(String key : setKeyvn) {
			System.out.println(key + ": "+ rsvn.getString(key));
		}
		
	}

}
