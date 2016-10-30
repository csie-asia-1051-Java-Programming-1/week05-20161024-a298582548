package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = 1;
		double v3 = 0;
		
		for(int i = 0;v3<10000;i++){
			v3 = Math.pow(v1, v2);
			v2 ++;
		}
		System.out.print(v2);

	}

}
