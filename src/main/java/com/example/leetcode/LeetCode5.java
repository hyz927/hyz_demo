package com.example.leetcode;

import java.util.HashMap;

public class LeetCode5 {
    public static String getResult1(String str){
       return null;
    }
    public static String getResult2(String str){
       int length;
       String result = "";
       char[] array = str.toCharArray();
       for(int i =0;i<array.length;i++){
          for(int j=array.length-1;j>=i;j--){
              if(array[i]==array[j]){
                  result = j-i+1>result.length()?str.substring(i,j+1):result;
                  continue;
              }
          }
       }
       return  result;
    }
    public static void main(String[] args){
        String str = "a";
        System.out.println(getResult2(str));
    }
}
