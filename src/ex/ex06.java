package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。
                        請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nuMber = {105021010,105042012,105051020,105052041,105041236};
		
		
		for(int i = 0; i < nuMber.length-1; i++){
			for(int j = 0;j<nuMber.length-i-1;j++){
				if(nuMber[j+1]>nuMber[j]){
					int v1 = nuMber[j+1];
					nuMber[j+1] = nuMber[j];
					nuMber[j] = v1;
				}
			}
		}
			for(int i = 0;i<nuMber.length;i++)
			System.out.print(nuMber[i] + " ");
		System.out.println();
	}
}

	







