/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

import java.io.*;
import java.util.*;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static long getSumOfPrimes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {          //Sum of Primes time complexity is O(nloglogn), it's space complexity is O(n)
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int n = 21;             //2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 = 77
        System.out.print(getSumOfPrimes(n));
    }
}
