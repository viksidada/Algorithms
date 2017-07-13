package com.Big4Questions;

public class SecondsToHours {

	public static void main(String[] args) {
		
		System.out.println(solution(86399));
	}
	
	public static String solution(int T) {
		
		int hours = T / 3600;
		int minutes = (T % 3600) / 60;
		int seconds = T % 60;

		String timeString = (hours + "h"+ minutes + "m"+ seconds + "s");
		
		return timeString;

	}

}
