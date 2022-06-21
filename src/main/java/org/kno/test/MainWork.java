package org.kno.test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

/**
 * @author liangjing
 *
 */
public class MainWork {
	public static final Gson GSON = new GsonBuilder().create();
	public static void main(String[] args) {
		System.out.println("works how it may happy 中文");
		
		System.out.println(GSON.toJson(new JsonArray(3)));
	}

}
