
public class Loops {
	public static void main(String args[]) {
		
		String str= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In sodales magna sed sem maximus rhoncus. Maecenas tempor eget elit eget molestie. Aenean eget malesuada magna. Proin posuere, velit ultricies rutrum sagittis, urna diam porttitor nibh, nec aliquam urna quam vitae nisl. Aliquam convallis rutrum category: make-up sodales. Phasellus dapibus imperdiet eros, category: apperal non feugiat velit pretium sit amet. Sed category: Furniture at ligula nec purus ultrices sodales in a augue. ";
		category(str);
		even();
	
	}
	private static void category(String str) {
		int i = 0;
		
		while(true) {
		int found = str.indexOf("category", i);
		if (found == -1) break;
		
		int start = found+10;
		int end = str.indexOf(" ", start);
		
		System.out.println("category:"+str.substring(start, end));
		i= end + 1;
		
	}
}
	private static void even() {
		
		for(int i = 0; i<=100;i++) {
			if(i%2==0) System.out.println(i);
		}
	}
	}
