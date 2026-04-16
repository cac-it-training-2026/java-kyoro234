package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		
		System.out.println("数学の試験結果の点数を入力してください。");
		BufferedReader math = new BufferedReader(new InputStreamReader(System.in));
		
		String str = math.readLine();
		int num = Integer.parseInt(str);
		
		BufferedReader japanese = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("国語の試験結果の点数を入力してください。");
		String str1 = japanese.readLine();
		int num1 = Integer.parseInt(str1);
		
		if ((num>=60) && (num1>=60)) {
			System.out.println("数学と国語ともに合格です。");
			
		}else if ((num>=60)||(num1>=60)) {
				System.out.println("数学、国語どちらかが合格です。");
				
		}else {
					System.out.println("どちらの教科も不合格です。");
				}
		
			
		

	}
}
