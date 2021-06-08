package com.example.leetcode;

import java.util.HashMap;

public class LeetCode1 {
    public static void getResult(int[] array,int target){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<array.length;i++){
            int temp = target - array[i];
            boolean isBreak = false;
            for(int j=i+1;j<array.length;j++){
                if(array[j]==temp){
                    System.out.println(i+","+j);
                    isBreak = true;
                    break;
                }
            }
            if(isBreak){
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    public static void getResult1(int[] array,int target){
        long startTime = System.currentTimeMillis();

        HashMap temp = new HashMap(array.length);
        for(int i=0;i<array.length;i++){
               temp.put(array[i],i);

       }
       for(int i=0;i<array.length;i++){
           int num = target -array[i];

           if(temp.get(num)!=null){
               int index = (int) temp.get(num);
               System.out.println(i+","+index);
               break;
           }

       }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    public static void main(String[] args){
        int[] array = {1,3,8,5,6,7,11,55,3,88};
        getResult(array,8);
        getResult1(array,8);
    }

}
