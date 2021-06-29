package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    /**
     * 时间复杂度 O(n^2+n)
     * @param str
     * @param row
     * @return
     */
    public static String getResult1(String str,int row){
        char[] array = str.toCharArray();
        List<String> list = new ArrayList<>();
        int index = row;
        int num = row;
        boolean flag = true;
        for(int i=0;i<array.length;i++){
              if(i==index){
                  list.add("");
                  index =flag?index + row - 2 : index + row;
                  flag = !flag;
              }
              list.add(String.valueOf(array[i]));


        }
        char[] result = new char[list.size()];
        int length = list.size()/row;
        int num2 = list.size()%row;
        for(int i =0;i<list.size();i++){

        }
        return  null;
    }
    public static  String  getResult2(String str, int row){
        char[] array = str.toCharArray();
        List<String> list = new ArrayList<>();
        int index = row;
        int num = row;
        boolean flag = true;
        for(int i=0;i<array.length;i++){
            if(i==index){
                list.add("");
                index =flag?index + row - 2 : index + row;
                flag = !flag;
            }
            list.add(String.valueOf(array[i]));


        }
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i =0; i<row;i++){
            int listIndex = i;
            for(int j=0;j<list.size();j++){
                if(listIndex==j) {
                    stringBuilder.append(list.get(j));
                    System.out.print(list.get(j)+" ");
                    listIndex += row;
                }
            }
            System.out.println();
        }
        return  stringBuilder.toString();
    }
    public static void main(String[] args){
         String str ="abcdefghi";
        /**
         *   a  0  e    i
         *   b  d  f  h
         *   c     g
         */
        int row = 3;
         System.out.println(getResult1(str,row));
    }
}
