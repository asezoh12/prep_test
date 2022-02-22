package com.company;

import java.util.*;
import java.io.*;

class Main {

    public static boolean ArrayAddition(int[] arr) {
        Arrays.sort(arr);
        int lastNum = arr[arr.length-1];
        int sum;

        for(int i=0;i<arr.length-1;i++){
            sum=arr[i];
            System.out.println(sum);
            for(int j=i+1;j<arr.length-1;j++){
                sum=sum+arr[j];
                if(sum==lastNum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        int[] arr={8,8,8,8,8};

        System.out.println(ArrayAddition(arr));
        System.out.println("am facut a doua modificare");
    }

}