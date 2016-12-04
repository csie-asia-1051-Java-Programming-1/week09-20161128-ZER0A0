package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021041 楊建宸
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt() , m = 1 , x = 1;
		
		if(n == 1){System.out.println("1") ; System.out.println("1");}
		else{while(m <= n + x - 1){
			System.out.print(m + " ") ; m = m + x ; x = x + 1;}
		System.out.println();
		for(int y = 1 ; y <= n + 1 ; y ++){
			for(int yy = 1 ; yy <= y ; yy ++){
				System.out.print(y + " ");}}
		
		}

	}

}