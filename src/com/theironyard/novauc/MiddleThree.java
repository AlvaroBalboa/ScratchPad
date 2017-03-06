package com.theironyard.novauc;

/**
 Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

 midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 midThree([1, 2, 3]) → [1, 2, 3]
 */
public class MiddleThree {
    public int[] midThree(int[] nums) {
        int whatMiddle = (nums.length)/2;
        int firstNumber=nums[whatMiddle-1];
        int secondNumber=nums[whatMiddle];
        int thrirdNumber=nums[whatMiddle+1];
        return new int[] {firstNumber,secondNumber,thrirdNumber};
    }
}
