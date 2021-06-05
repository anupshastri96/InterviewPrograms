
public class PracticeForInternalCount {

	public static final int MAX_SIZE=256;
	
	public static void main(String[] args) {
		String stringArray[] = {"Hello ","Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<stringArray.length; i++) {
			sb.append(stringArray[i]);
		}
		String allWords = sb.toString();
		
//		int i = 0;
//		if(i == 4961) {
//			
//		} else {
//			access denied
//		}
//		
		//getOccurrence(allWords);
		
		getOccurrence(convertArrayToString(stringArray));

	}
	
	
	public static void getOccurrence(String sow) {
		
		int count[] = new int[MAX_SIZE];
		
		int len = sow.length();
		
		for(int i=0; i<len; i++) {
			count[sow.charAt(i)]++;
		}
		
		char[] ch = new char[len];
		
		for (int i=0; i<len; i++) {
			ch[i] = sow.charAt(i);
			int find = 0;
			
			for(int j=0; j<=i; j++) {
				if(sow.charAt(i) == ch[j]) {
					find++;
				}
			}
			
			if(find ==1) {
				System.out.println("The letter "+sow.charAt(i)+" occurred"+ count[sow.charAt(i)]+" time");
			}
		}
	}
	
	
	
	public static String convertArrayToString(String stringArray[]) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<stringArray.length; i++) {
			sb.append(stringArray[i]);
		}
		
		String allWords = sb.toString();
		
		
		return allWords;
	}
	
	public static void getOccurrencePractice(String sow) {
		
		int[] count = new int[MAX_SIZE];
		
		int len = sow.length();
		
		for(int i=0; i<len; i++) {
			count[sow.charAt(i)]++;
		}
		
		char[] ch = new char[len];
		
		for(int i=0 ; i<len; i++) {
			ch[i] = sow.charAt(i);
			int find = 0;
			
			for(int j=0; j<=i; j++) {
				if(sow.charAt(i) == ch[j]) {
					find++;
				}
			}
			if(find ==1) {
				if(sow.charAt(i) != ' ') {
				System.out.println("The letter "+sow.charAt(i)+" occurred "+count[sow.charAt(i)]);			}
		}
	}

	}
}
