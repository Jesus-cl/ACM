/**
 * 现在给你N个数（0<N<1000），现在要求你写出一个程序，找出这N个数中的所有素数，并求和。
 * 
 */
package com.liang.acm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cl529581493
 *
 */
public class Example_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please input m:");
		int m = in.nextInt();
		ArrayList<int[]> arrlist = new ArrayList<int[]>();
		while (m != 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			if (in.hasNext()) {
				for (int i = 0; i < n; i++) {
					arr[i] = in.nextInt();
				}
			}
			--m;
			arrlist.add(arr);
		}
		Sum_Prime(arrlist);
	}

	public static void Sum_Prime(ArrayList<int[]> arrlist) {
		int Size=arrlist.size();
		int sum=0;
		for(int i=0;i<Size;i++){
			int[] a1=arrlist.get(i);
			for(int j=0;j<a1.length;j++){
				if(a1[j]<=1){
					continue;
				}
				else{
					for(int k=2;k<=Math.sqrt(a1[j]);k++){
						if(k%a1[j]==0)
							break;
						else
							sum+=a1[j];
					}
				}
			}
			System.out.println(sum);
		}
	}
}
