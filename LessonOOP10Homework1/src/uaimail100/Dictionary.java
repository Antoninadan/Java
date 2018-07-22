package uaimail100;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Dictionary implements Serializable {

	private Map<String, String> map = new HashMap<>();
	private static final long serialVersionUID = 1L; // for serialization
	

	public Dictionary(File fileDictionary) {
		super();
		
		// filling dictionary
		addDictionary();
		
		// serializing dictionary
		try {
			SerService.saveObject(fileDictionary, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public Map<String, String> getMap() {
		return map;
	}


	public void addDictionary() {
	
		map.put("tree", "дерево");
		map.put("hole", "дірка");
		map.put("apple", "яблуко");
		map.put("phone", "телефон");
		map.put("stop", "стоп");
	
	}
}
