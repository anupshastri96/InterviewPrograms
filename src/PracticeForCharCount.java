
import java.util.HashMap;

public class PracticeForCharCount {
	
	public static void main(String[] args) {
		
	      String stringArray[] = {"Hello ","Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
//	      ArrayList<String> s = new ArrayList<>();
//	      s.size();
		  HashMap<String,Integer> countOfWords= new HashMap<String,Integer>(); 
		  
		  for(String word: stringArray) {
			  if(countOfWords.containsKey(word)) {
				  countOfWords.replace(word, countOfWords.get(word)+1);
			  } else {
				  countOfWords.put(word,1);
			  }
		  }
		  
		  System.out.println(countOfWords);
	}

}
