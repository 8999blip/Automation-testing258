package basicSelJava;

public class User2 {
	public static void createFeatures(String carCompany) {
		Car car= null;
		if(carCompany ("maruti")) {
			car = new Hyundai();
		}else {
			car = new Maruti();
		}
		car.m1();
	}
	
	private static boolean carCompany(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		createFeatures("hyundai");
		
	}

}
