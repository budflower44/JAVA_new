package new02;

import java.util.Calendar;

class Counter{
	//教臂沛 按眉肺 积己
	private static Counter instance;
	private int count;
	
	private Counter() {}
	
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		
		return instance;
	}
	
	public int countMethod() {
		count++;
		return count;
	}
}

public class SingletonCount {

	public static void main(String[] args) {
		// counter 按眉 2俺 积己
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		System.out.println(c1.countMethod()); //1
		System.out.println(c2.countMethod()); //2
		System.out.println(c1.countMethod()); //3
		System.out.println(c1.countMethod()); //4
		System.out.println(c2.countMethod()); //5
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year); //2023
	}

}
