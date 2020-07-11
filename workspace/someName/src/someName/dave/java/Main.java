package someName.dave.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		
		try {
			
		} catch (Exception e) {
			
		}
		
		try {
			
		} catch (NullPointerException e) {
			
		}
		String raw = "hello12345";
		try {
			int testraw = Integer.parseInt(raw);
			System.out.println("Success!!");
		} catch (NumberFormatException e) {
			System.out.println("Failed!!!!");
		}
		

		String 	test1 = "My string";
		int		test2 = 5000;
		double	test3 = 10.4;
		char	test4 = 'M';
		boolean	test5 = false;
		
		test2 = test2 + 5;
		
		switch(test2) {
		case 1:
			System.out.println("test2 is 1");
			break;
		case 5005:
			System.out.println("test2 is 5005");
			break;
		case 10000:
			System.out.println("test2 is 10000");
			break;
		//
		default:
			System.out.println("test2 is unknown");
				break;
		}
		
		
		if (test2 > test3) {
			System.out.println("test2 is gt 3");
		} else {
			System.out.println("test2 is lt 3");
		}
		
		if (test2 == test3) {
			System.out.println("Are equal");
		} else if (test2 != test3) {
			System.out.println("is not equal ");
		}
		
		if (test5) {
			System.out.println("Is True");
		} else {
			System.out.println("Is False");
		}
		
		System.out.println(getMessage() );
		
		//sendMessage("The code is running!!!", 25);
		
		SecondClass second = new SecondClass();
		second.sayHello();
		
		List<Double> list = new ArrayList<>();
		list.add(10.4);
		list.add(4.1);
		list.add(100.345);
		System.out.println(list.get(2) );
		System.out.println(list.size() );
		System.out.println(list.contains(2) );
		
		HashMap<Double, String> hmap = new HashMap<>();
		
		hmap.put(10.4, "ten point four");
		hmap.put(3264764.45, "Some big number");
		
		System.out.println(hmap.containsKey(10.4)); 
		System.out.println(hmap.get(10.4));
		
		
		// Orders are controlled.
		LinkedList<Double> llist = new LinkedList<>();
		LinkedHashMap<Double, String> linkedhmap = new LinkedHashMap<>();
		//
		
		for (int i = 0; i < 10; i++) {
			// for loop
		}
		
		List<String> liststr = new ArrayList<>();
		liststr.add("test1");
		liststr.add("test2");
		liststr.add("test3");
		liststr.add("test4");
		liststr.add("test5");
		
		for (String strvar : liststr) {
			System.out.println(strvar);
		}
		
		for (Double dblvar : hmap.keySet() ) {
			System.out.println(dblvar);
		}
		
		for (String strvar : hmap.values() ) {
			System.out.println(strvar);
		}
		
		
		// while loop
		
		int number100 = 100;
		
		while (number100 < 200) {
			number100 = number100 + 10;
			System.out.println(number100);
		}
		
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+2") );
		System.out.println("Day of month   : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour of day    : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute of hour : " + cal.get(Calendar.MINUTE));
		
		cal.set(Calendar.MINUTE, 40);
		
		System.out.println("Minute of hour : " + cal.get(Calendar.MINUTE));
		
		Random rand = new Random();
		
		List<String> greeting = new ArrayList<>();
		greeting.add("Hello");
		greeting.add("hi");
		greeting.add("Good day Sir");
		
		System.out.println(greeting.get(rand.nextInt(greeting.size())));
		
		//Pig pig = new Pig();
		//Cow cow = new Cow();
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Cow());
		
		
		
	}
	
	public static int number0 = 0; 
	
	public static String getMessage() {
		String message = "Banana";
		
		return message;
	}
	
	public static void sendMessage() {
		System.out.println("sendMessage!!");
	}
	
	
}
