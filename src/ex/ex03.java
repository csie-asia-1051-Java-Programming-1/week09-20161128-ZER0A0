package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = 0;
		
		for(int x = 1 ; x <= n ; x ++){
			if(n % x == 0){
			System.out.print(x + " ") ; m = m + x;}}
		System.out.println();
		if(m == n + 1 || n == 1){System.out.print("是質數");}
		else System.out.print("不是質數");

	}

}
