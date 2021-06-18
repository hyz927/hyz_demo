package com.example.leetcode;

public class LeetCode4 {
    public static void getResult1(int[] array1,int[] array2){
       
        boolean flag = false;
        if(array1[array1.length-1]<=array2[0]){
            flag = true;
        }
        
        if(array1[0]>=array2[array2.length-1]){
            flag = true;
            int[] temp = array2;
            array2 = array1;
            array1 = temp;
        }
        
        if(flag){
            int array1Length = array1.length;
            int array2Length = array2.length;
            int allLength = array1Length + array2Length;
            int betweenLength = allLength/2;
            if((allLength)%2==0){
                float result = 0f;
                if(betweenLength == array1Length){
                    result = (float) (array1[array1Length-1]+array2[0])/2;
                }

                if(betweenLength < array1Length){
                    result = (float)(array1[betweenLength-1]+array1[betweenLength])/2;
                }
                
                if(betweenLength > array1Length){
                    result = (float)(array2[betweenLength-array1Length-1]+array2[betweenLength-array1Length])/2;
                }
                System.out.println(result);
            }else {
                betweenLength = (allLength+1)/2;
                int result = array1Length >= betweenLength ? array1[betweenLength-1]:array2[betweenLength-array1Length-1];
                System.out.println(result);
            }
        }

        if(!flag){
            int[] allArray = new int[array1.length+array2.length];
            for(int i =0;i<array1.length;i++){
                allArray[i] = array1[i];
            }
            for(int i=0; i<array2.length;i++){
                allArray[array1.length+i] = array2[i];
            }

            for(int i=0;i<allArray.length;i++){
                for(int j = 0;j<allArray.length-1-i;j++){
                    if(allArray[j]>allArray[j+1]){
                        int temp = allArray[j];
                        allArray[j] = allArray[j+1];
                        allArray[j+1] = temp;
                    }
                }
            }

            if(allArray.length%2==0){
                float result = 0f;
                result = (float) (allArray[allArray.length/2]+allArray[allArray.length/2-1])/2;
                System.out.println(result);
            }else {
                int result = allArray[(allArray.length+1)/2 -1];
                System.out.println(result);
            }
        }
    }
    public static void getResult2(int[] array1,int[] array2){
       
    }
    public static void main(String[] args){
        int[] array1 = {1,4,9,12,29};//4
        int[] array2 = {5,6,7,15,20,30};//3.5
        //{1,4,5,6,7,7,12,15,20,29}
        getResult1(array1,array2);
    }
}
