/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {       //Linear Search time complexity is O(n), space complexity is O(1)
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {142, 14, 384, 127, 12, 53, 22, 45};
        int x = 127;

        int result = search(arr, x);
        if (result == -1) {
            System.out.print("Element is not present in array");
        } else {
            System.out.print("Element is present at index " + result);
        }
    }
}
