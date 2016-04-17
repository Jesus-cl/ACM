package com.liang.acm;

/**
 * 编译运行已通过
 * 输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example_4 {
	public static void sort(List<String> strList) {
		int num = strList.size();
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
		System.out.println("输入数字N:");
		// final int length = 3;
		int N = in.nextInt();
		String[] str = new String[N];

		List<String> strList = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			str[i] = in.next();
			strList.add(str[i]);
		}
		sort(strList);
	}
}
