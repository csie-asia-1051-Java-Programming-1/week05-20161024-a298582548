package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		double v2 = 1;
		double v3 = 1;
		double v4 = 0;
		double v5 = 0;
		int v6 =0;
		for (int i = 0;v3<2*(v1);i++){
			 v6++;
			 v2 = 2*v6-1;
			 v3 = 2*v6;
			 v4 = 1/(v2*v3);
			 v5 = v4+v5;
		}
		System.out.print(v5);

	}

}
		
