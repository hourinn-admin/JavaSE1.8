package cn.oracle.tutorials.interfacesAndinheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeClient myTimeClient = new SimpleTimeClient();
		System.out.println(myTimeClient.toString());
		
		System.out.println(myTimeClient.getZonedDateTime("Asia/Shanghai").toString());
		
	}
}

