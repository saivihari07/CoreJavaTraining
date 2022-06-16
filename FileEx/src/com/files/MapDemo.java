package com.files;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String>m=new HashMap<String, String>();
		m.put("India", "Delhi");
		m.put("China", "Bejing");
		m.put("Nepal", "Khatmandu");
		m.put("USA", "Washington DC");
        for (Map.Entry<String,String> entry : m.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

}

