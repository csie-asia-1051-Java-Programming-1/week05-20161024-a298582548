package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = 1;
		int v3 = 2;
		int v4 = 0;
		for(int i = 1;v2<=v1;i++){
		v2 = v2+v3;
		v3++;
		v4++;
		}
		System.out.print(v4);
	}

}
