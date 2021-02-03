package Assinment2;
import java.util.Scanner;
import java.util.Arrays;


public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		int[] arr =new int[10];
		
		System.out.println("Please enterm 10 elements");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted array: " );
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
