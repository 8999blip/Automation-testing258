package basicSelJava;

public class User1 {
	public static void createFeatures(String carCompany) {
		if (carCompany.equals("maruti")) {
			Maruti maruti=new Maruti();
			maruti.m1();
			maruti.m2();
		}else {
			Hyundai hyundai= new Hyundai();
			hyundai.m1();
			hyundai.m3();
		}
	}
	public static void main(String[] args) {
		createFeatures("hyundai");
	}

}
