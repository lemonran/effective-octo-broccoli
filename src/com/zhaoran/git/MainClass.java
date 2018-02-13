package com.zhaoran.git;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Solution solution = new Solution();
      /*  int digitInt = 0;
        Scanner sca = new Scanner(System.in);
        digitInt = sca.nextInt();
        if (solution.isPalindrome(digitInt)) {
            System.out.println(digitInt + " 是回文数字");
        } else {
            System.out.println(digitInt + " 不是回文数字");
        }*/
        int[] intNumb = {1, 8, 9, 10, 23, 5};
        int target = 7;
        int [] indexSum = new int[2];
        try {
            indexSum  = solution.twoSum(intNumb, target);
        } catch(Exception  e) {
            System.out.println("e " + e.getMessage());
            
        }
     
        for (int i = 0; i < indexSum.length; i++) {
            System.out.println("index "  + indexSum[i] + "  ");
        }
        
    }

}
