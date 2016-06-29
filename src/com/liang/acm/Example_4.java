package com.liang.acm;

/**
 * 编译运行已通过
 * 概述：
 * 输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符；
 * 第一行输入一个数N,表示有N组测试数据。后面的N行输入多组数据，每组输入数据都是占一行。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_4 {
	// 按各字符的ASCII码从小到大排序
	public static void sort(List<String> strList) {
		int num = strList.size();
		System.out.println("结果分别为：");
		for (int i = 0; i < num; i++) {
			char[] ch = strList.get(i).toCharArray();
			for (int j = 0; j < ch.length; j++) {
				for (int k = j + 1; k < ch.length; k++) {
					if (ch[j] > ch[k]) {
						char temp = ch[j];
						ch[j] = ch[k];
						ch[k] = temp;
					}
				}
			}
			for (int m = 0; m < ch.length; m++) {
				System.out.print(ch[m] + " ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("输入测试组数N:");
		int N = in.nextInt();

		String[] str = new String[N];
		System.out.println("输入每组的数据：");
		List<String> strList = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			str[i] = in.next();
			strList.add(str[i]);
		}
		sort(strList);
	}
}
