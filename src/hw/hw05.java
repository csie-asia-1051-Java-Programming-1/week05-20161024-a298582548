package hw;
/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時:
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		int v1 = scn.nextInt();
		int v2 = 0;
		int v3 = 0;
		int v4 = 1;
		int v5 = 0;
		int[][]data = new int[v1][v1];
		if(1<v1 && v1<21){
		for(int i = 0;i <= v1;i++){
			for(int j = 0;j <= i;j++){
				
				data[v2][v3] = v4++;
		for(int k = 0;k <= i;k++){
			for(int l = 0;l <=v1-j;l++){
				data[v2-v1][v3] = v4++;
				System.out.print(data[v2][v3]);
			}
		}
			  
				
				
				
			}
			System.out.println("");
		}
			
		}

	}

}
