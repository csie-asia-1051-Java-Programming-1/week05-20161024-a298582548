package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		
		int v2 = 1;
		while(v1>=1){
		v2 = v1*v2;
		v1--;
		}
		System.out.print(v2);

	}

}
