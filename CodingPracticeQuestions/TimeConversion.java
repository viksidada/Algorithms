package com.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        // Complete this function
    	String onlyTime = s.substring(0, s.length()-2);
    	String ampm = s.substring(s.length()-2, s.length());
    	String hr = s.substring(0, 2);
    	Integer hrt = Integer.parseInt(hr);
    	String result = null;
    		
    	
    	if (ampm.equals("AM")) {
    		String hou = (hrt == 12 ? "00" : hr);
    		result = String.valueOf(hou) + onlyTime.substring(2, onlyTime.length());
    		
    	} else if (ampm.equals("PM")) {
    		if (hrt == 12) {
    			result = onlyTime;
    		} else {
    			int h = 12 + hrt;
        		String hours = String.valueOf((h == 24 ? "00" : h));
        		result = (hours) + onlyTime.substring(2, onlyTime.length());
    		}
    		
    		
    	}
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
