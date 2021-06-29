package com.example.leetcode;

public class LeetCode7 {
    public static int getResult1(int x){
        int temp = x>0?1:-1;
        x = x*temp;
        int flag = 10;
        int other;
        StringBuilder stringBuilder = new StringBuilder("");
        while (true){
            if(x/flag < 1){
                stringBuilder.append(x/(flag/10));
                break;
            }
            other = x%flag/(flag/10);

            stringBuilder.append(other);
            flag = flag*10;
        }
        return  Integer.valueOf(stringBuilder.toString())*temp;
    }
    public static void main(String[] args){
        int x = -135555;
        System.out.println(getResult1(x));
    }
}
