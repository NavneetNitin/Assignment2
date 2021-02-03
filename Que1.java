package Assinment2;
import java.util.Scanner;


//1)Write a program to find the largest 2 numbers and the smallest 2 numbersin the given array.


public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter size of array");
		int n = scan.nextInt();	
		
		int[] arr =new int[n];
		
		
//		taking input in array
		System.out.println("Please enter elements");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		int largest= arr[0];
		int smallest= arr[0];
		
		for (int i=0; i<=arr.length-1;i++) {
			
			if(arr[i]>largest) {
				largest= arr[i];
			}
			else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Largest no is : " +largest);
		System.out.println("smallest no is : "+ smallest);
		
		int secondLargest=arr[0];
		int secondSmallest=arr[0];
for (int i=0; i<=arr.length-1;i++) {
			
			if(arr[i]>secondLargest) {
				
				if (arr[i]==largest) {
					continue;
				}
				else {
					secondLargest= arr[i];
				}
			}
			else if(arr[i]<secondSmallest) {
				
				if(arr[i]==smallest) {
					continue;
				}
				else {
					secondSmallest=arr[i];
				}
			}
		}
System.out.println("2nd Largest no is : " +secondLargest);
System.out.println("2nd smallest no is : "+ secondSmallest);

		
		
		
		
		
	}
	}

