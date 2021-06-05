
public class InternalWordFrequencyCount {
	
	       static final int MAX_CHAR = 256;	
	
		   public static void main(String args[]) {
		      String stringArray[] = {"Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
		      StringBuffer sb = new StringBuffer();
		      for(int i = 0; i < stringArray.length; i++) {
		         sb.append(stringArray[i]);
		      }
		      String str = sb.toString();
		      getOccuringChar(str);
		      System.out.println(str);
		   }
		   
		   
		   
		   static void getOccuringChar(String str)
		    {
		         
		        // Create an array of size 256
		        // i.e. ASCII_SIZE
		        int count[] = new int[MAX_CHAR];
		 
		        //then we get length of the provided string
		        int len = str.length();
		 
		        // Initialize count array index
		        for (int i = 0; i < len; i++)
		            count[str.charAt(i)]++;
		 
		        // Create an array of given String size
		        char ch[] = new char[str.length()];
		        for (int i = 0; i < len; i++) {
		            ch[i] = str.charAt(i);
		            int find = 0;
		            for (int j = 0; j <= i; j++) {
		 
		                // If any matches found
		                if (str.charAt(i) == ch[j])
		                    find++;
		            }
		 
		            if (find == 1)
		                System.out.println(
		                    "Number of Occurrence of "
		                    + str.charAt(i)
		                    + " is:" + count[str.charAt(i)]);
		        }
		    }
		   
		   static void getOccuringCharPractice(String listOfWords) {
			   //max words occuring array
			   int count[] = new int[MAX_CHAR];
			   
			   //length of the given string
			   int len = listOfWords.length();
			   
			   //for loop to traverse for incrementing each word occurence
			   for(int i=0; i<len; i++) {
				   count[listOfWords.charAt(i)]++;
			   }
			   //creating a char array
			   char ch[] = new char[listOfWords.length()];
			   
			   for(int i=0; i<len; i++) {
				   ch[i] = listOfWords.charAt(i);
				   
				   //int find to print at the first occurrence
				   int find=0;
				   for(int j=0; j<=i; j++) {
					   
					   if(ch[j] == listOfWords.charAt(i)) {
						   find++;
					   }
					   
					   if(find == 1) {
						   System.out.println("Number of Occurrence of "+listOfWords.charAt(i)+ " is" +count[listOfWords.charAt(i)]);
					   }
					   
				   }
			   }
		   }
		

}
