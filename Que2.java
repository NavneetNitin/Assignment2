package Assinment2;
import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter size of array");
		int n = scan.nextInt();	
		
		int[] arr =new int[n];
		
//		taking input in array
		System.out.println("Please enter elements");
		for(int i=0; i<=arr.length-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Please enter the element to search in the array");
		int key= scan.nextInt();
		int index=0;
		
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]==key)
			{
				index=i+1;
			}
		}
		if(index !=0)
		{
			System.out.println("Element found at: " + index + "th Element");
		}
		else 
			System.out.println("not found : -1");
		}
		
		
		

	

}
