package com.manhlee.array;


public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int [] nums = {1,0,1,1,0,1};
		int result=0;
		int count=0;
		
		//way 1
		/*
		 * for (int i = 0; i < nums.length; i++) { if(nums[i]==0) { if(count>result) {
		 * result=count; } count=0; }else if(i== nums.length-1 && nums[i]==1){ count++;
		 * if(count>result) { result=count; } }else { count++; } }
		 */
		//way 2
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				count=0;
			}
			else {
				count++;
				result= Math.max(result, count);
			}
		}
		System.out.println(result);
	}

}