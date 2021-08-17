package isolation;

import java.util.ResourceBundle;

public class Resourse_bundle {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("isolation.app");
		
		System.out.println(rb.getString("driver"));
	}
	

}
