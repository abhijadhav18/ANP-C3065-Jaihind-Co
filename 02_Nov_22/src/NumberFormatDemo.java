import java.util.Locale;
import java.text.NumberFormat;

public class NumberFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale=new Locale("EN", "IN");
		NumberFormat numberFormat=NumberFormat.getInstance(locale);
		System.out.println(numberFormat.format(1000000099));
		
		NumberFormat numberFormat2=NumberFormat.getCurrencyInstance(locale);
		System.out.println(numberFormat2.format(1000.99));
		

	}

}
