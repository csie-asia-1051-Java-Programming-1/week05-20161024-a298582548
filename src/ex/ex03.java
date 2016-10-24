package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long v1 = scn.nextLong();
		int v2 = 2;
		double v3 =0;
		while(v1>=1){
	    v3 = Math.pow(v2, v1)+v3;
		v1--;
		}
	   System.out.print(v3);
	}
       
}
