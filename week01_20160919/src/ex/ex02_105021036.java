package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex02_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int KG = scn.nextInt();
        Double LB = KG * 0.45359;
        System.out.println("磅="+LB);
        
        
	}

}
