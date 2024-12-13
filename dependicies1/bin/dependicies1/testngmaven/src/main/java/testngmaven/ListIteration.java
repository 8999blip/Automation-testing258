package testngmaven;

import java.util.ArrayList;

public class ListIteration {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		for (String txt: al) {
			if (txt.equals("ccc")) {
				System.out.println("pass");
			}else {
				System.out.println("fail");
			}
		}
	}

}
