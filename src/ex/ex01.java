package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = 1;
		for(int i = 0;a>0;a--){
		b = a*b;
		}
		System.out.print(b);

	}

}
