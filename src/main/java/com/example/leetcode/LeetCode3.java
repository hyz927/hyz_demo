package com.example.leetcode;

import java.util.HashSet;

public class LeetCode3 {
    public static void getResult1(String str){
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while(i<str.length()){
            int pos = str.indexOf(str.charAt(i),flag);
            if(pos < i){
                if(length>result){
                    result = length;
                }
                if(result>=str.length() - pos -1){
                    System.out.println(result);
                    return;
                }
                length = i - pos -1;
                flag = pos +1;
            }
            length++;
            i++;
        }
        System.out.println(length);
    }
    public void getResult2(String str){

    }
    public static void main(String[] args){
        String str ="abcdba";
        getResult1(str);
    }
}
