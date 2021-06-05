import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StringManipulation {

	public static void main(String[] args) {
		System.out.print(reverse("Anup"));
		
		HashMap<Integer,String> studentData = new HashMap<>();
		studentData.put(1, "Anup");
		studentData.put(2, "Ashok");
		studentData.put(3, "Asmita");
		studentData.put(4, "Sunil");
		studentData.put(5, "Deelip");
		
		ArrayList<String> student = new ArrayList<>();
		student.add("a");
		student.add("b");
		student.add("c");
		student.add("d");
		
		for(String s:student) {
			System.out.println("Letters:"+s);
		}
		
		Iterator<String> its = student.iterator();
		
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		HashMap<String,String> studentData2 = new HashMap<>();
		studentData2.put("GJ", "Anup");
		studentData2.put("MH", "Ashok");
		studentData2.put("RJ", "Asmita");
		studentData2.put("KA", "Sunil");
		studentData2.put("WB", "Deelip");
		
		Iterator<Integer> it = studentData.keySet().iterator();
		
		while(it.hasNext()) {
			int key = (int)it.next();
			System.out.println("Roll no: "+key+" Name:"+studentData.get(key));
		}
		
		for(String State:studentData2.keySet()) {
			System.out.println("State:"+State);
		}
		
		for(String State:studentData2.values()) {
			System.out.println("Names:"+State);
		}
		
		System.out.println(fibonacci(10));

	}
	
	public static String reverse(String n) {
		//check for null
		if(n == null)
			throw new IllegalArgumentException("The string can't be null");
		//use string builder for appending
		StringBuilder out = new StringBuilder();
		int counter = 0;
		//a char array
		char[] chars = n.toCharArray();
		//loop for that array
		for(int i=chars.length - 1; i>=0; i-- ) {
			out.append(chars[i]);
			counter++;
		}
		System.out.print(counter);
		return out.toString();
		
		
		
	}
	
	public static boolean vowelString(String n) {
		
		//if(n == )
		
		return false;
		
		
		
	}
	
	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
