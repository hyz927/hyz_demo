package com.example.leetcode;

public class LeetCode2 {
    static LeetCode2 leetCode2 = new LeetCode2();
    class ListNode{
       int val;
       ListNode next;
       int length;
    }
    public   ListNode getListNode(int[] val){
        ListNode listNode = new ListNode();
        ListNode childNode = null;
        ListNode parentNode = null;
        for(int i =val.length - 1;i>-1;i--){

            if(i == val.length -1){
                childNode = new ListNode();
                childNode.next = null;
                childNode.val =val[i];
            }else {
                parentNode = new ListNode();
                parentNode.val = val[i];
                parentNode.next = childNode;
                childNode = parentNode;
            }

        }
        parentNode.length = val.length;
        return parentNode;
    }
    public  void getResult1(int[] array1,int[] array2){
         ListNode listNode1 = leetCode2.getListNode(array1);
         ListNode listNode2 = leetCode2.getListNode(array2);


         if(listNode1.length<listNode2.length){
             ListNode temp = listNode2;
             listNode2 = listNode1;
             listNode1 = temp;

         }
         int max = listNode1.length;
         int temp =0;
         ListNode result = new ListNode();
         ListNode child = null;
         while (listNode1!=null){
             int add =0;
             if(listNode2!=null){
                 add = listNode1.val + listNode2.val + temp;
             }else {
                 add = listNode1.val + temp;
             }
             if(add>9){
                 temp =1;
                 add = add - 10;
             }else {
                 temp =0;
             }
             System.out.print(add + ",");
             result.val = add;



             listNode1 = listNode1.next;
             if(listNode2!=null) {
                 listNode2 = listNode2.next;
             }

         }

    }
    public  void getResult2(int[] array1,int[] array2){
        ListNode listNode1 = leetCode2.getListNode(array1);
        ListNode listNode2 = leetCode2.getListNode(array2);


        if(listNode1.length<listNode2.length){
            ListNode temp = listNode2;
            listNode2 = listNode1;
            listNode1 = temp;

        }

        add(listNode1,listNode2,0);

    }
    private int add(ListNode listNode1,ListNode listNode2,int temp){
        int add = 0;
        if(listNode1==null){
            return -1;
        }
        if(listNode2==null){
            add = listNode1.val + temp;
        }else {
            add = listNode1.val + listNode2.val + temp;
        }
        if(add>9){
            temp = 1;
            add = add - 10;
        }else{
            temp = 0;
        }
        System.out.print(add + ",");
        ListNode child1 = listNode1.next;
        ListNode child2 = listNode2==null? null:listNode2.next;
        return add(child1,child2,temp);
    }

    public static void main(String[] args){
        int[] array1 = {1,4,3,6,8,9};
        int[] array2 = {5,2,6,7,8,5,3,2};
        leetCode2.getResult1(array1,array2);
        System.out.println();
        leetCode2.getResult2(array1,array2);

    }
}
