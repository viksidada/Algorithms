package com.CodingPracticeQuestions;

import java.util.Arrays;

public class FindCommonElementInOlognTime {
            
      public static void main(String[] args) {
    	  int[] nums = {2, 7, 11, 15};
    	  int[] result = null;
    	  
    	  for(int i = 0; i < nums.length; i++) {
    		  for (int j = i+1; j < nums.length; j++) {
    			  if (nums[i] + nums[j] == 9) {
    				  result = new int[2];
    				  result[0] = nums[i];
    				  result[1] = nums[j];
    			  }
    		  }
    	  }
    	  
    	  System.out.println(Arrays.toString(result));
    	  
    	  
      }

}
