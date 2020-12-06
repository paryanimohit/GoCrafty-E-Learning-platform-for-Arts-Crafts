package com.GoCrafty.service;

import java.util.HashMap;

public class Utilities {

	public static HashMap<String, String> getVideoLinks(String videoLink) {
		HashMap<String, String> videos=new HashMap<String, String>();
		try {
		String[] videoLinks=videoLink.split(",");  //split videos by , 
		for(String video:videoLinks)
		{
			String[] nameAndLink=video.split("@");//split link by : to get name and link
			videos.put(nameAndLink[0], nameAndLink[1]);
		}
		}
		catch (Exception e) {

			
				
				videos.put("null", null);
				return videos;
		}
		return videos;
	}
	
	public static HashMap<String, String> getQuizLinks(String quizLink) {
		HashMap<String, String> quiz=new HashMap<String, String>();
		try {
		String[] quizLinks=quizLink.split(",");  //split videos by , 
		for(String video:quizLinks)
		{
			String[] nameAndLink=video.split("@");//split link by : to get name and link
			quiz.put(nameAndLink[0], nameAndLink[1]);
		}
		}
		catch (Exception e) {

				quiz.put("null", null);
				return quiz;
		}
		return quiz;
	}

	public static String getEmbededLink(String videoURL) {
		String embededLink;
		try {
		String[] temp=videoURL.split("\\?v=");
		String[] temp2=temp[1].split("&");
		embededLink=temp2[0];
		}
		catch (Exception e) {
			return null;
		}
		
		return embededLink;
	}
	
	

}
