import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		
	    String[] myPhrase = {"Hello ","Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
	    HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();
	    for (String s : myPhrase){
	        if (myWordsCount.containsKey(s)) myWordsCount.replace(s, myWordsCount.get(s) + 1);
	        else myWordsCount.put(s, 1);
	    }
	    System.out.println(myWordsCount);
	    System.out.println(countFrequency(myPhrase));

	}
	
	public static String countFrequency(String[] listOfWords) {
		HashMap<String, Integer> myWordCount = new HashMap<String,Integer>();
		
		for(String word: listOfWords) {
			if(myWordCount.containsKey(word)) myWordCount.replace(word, myWordCount.get(word)+1);
			else myWordCount.put(word, 1);
			
		}
		
		return myWordCount.toString();
		
	}
	
	public static String countFrequenctyPractice(String[] listOfWords) {
		
		HashMap<String, Integer> countListOfWords = new HashMap<String,Integer>();
		
		for(String word: listOfWords) {
			if(countListOfWords.containsKey(word)) {
				countListOfWords.replace(word, countListOfWords.get(word)+1);
			} else {
				
			    countListOfWords.put(word, 1);  
			}
				
		}
		
		return countListOfWords.toString();
		
	}

}
