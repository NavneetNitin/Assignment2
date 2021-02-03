package Assinment2;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={2,5,8,9};
		int [] b={15,3,7,12};
		
		int []merge= new int[a.length+b.length];
		int index=0;
		for(int i=0;i<=a.length-1;i++) {
			merge[i]=a[i];
			index++;
		}
		for(int j=0;j<=b.length-1;j++) {
			merge[index++]=b[j];
		}
		
		for(int k=0; k<=merge.length-1;k++) {
			System.out.print(merge[k]+ " ");
		}

	}

}
