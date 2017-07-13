package com.Big4Questions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EmptyString {

	public static void main(String[] args) throws Exception {
		String thisLine = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int counter = 0;
		while((thisLine = br.readLine()) != null) {
			
			if (counter == 0) {
				int frequency = Integer.parseInt(thisLine);
				counter++;
				continue;
			}
			
			System.out.println(thisLine);
			if (thisLine.length() == 0) {
				return;
			}
			
			int one = 0;
			int zero = 0;
			
			String[] array = thisLine.split("");
			
			for (String x : array) {
				if (x.equals("1")) {
					one++;
				} else if (x.equals("0")) {
					zero++;
				}
			}
			
			if ((2*one) == zero) {
				System.out.println("yes");
			} else System.out.println("No");
		}
		

	}

}
