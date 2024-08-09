package geeks.array;

import java.util.*;
class sliding_window_technique{
    static int sliding(int arr[], int k ,int n){
        int max_sum = Integer.MIN_VALUE;
        for (int i =0;n>i+k-1;i++){
            int sum = 0;
            for(int j=0;j<k;j++){
                sum += arr[i+j];
            }
            max_sum = Math.max(max_sum,sum);
        }
            return max_sum;
        }
        public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements :");
        int n = sc.nextInt();
        System.out.println("enter the size of sliding :");
        int k = sc.nextInt();
        System.out.println("enter the array :");
        int arr [] = new int[n];
        
        for (int i =0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("maximum sum of subarray "+k+" is :"+sliding(arr, k, n));
        }
    }
