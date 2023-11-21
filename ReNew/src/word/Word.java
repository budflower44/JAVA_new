package word;

import java.util.*;

public class Word {

	HashMap<String, String> map = new HashMap<String, String>();
	
	public HashMap<String, String> wordMap(String word, String mean) {

		map.put(word, mean);
		
		return map;
	}
	
	public HashMap<String, String> removeWord(String oldWord, String newWord, String newMean) {
		for(String key : map.keySet()) {
			if(key.equals(oldWord)) {
				map.remove(oldWord);
				map.put(newWord, newMean);							
			}
		}
		return map;
	}

}
