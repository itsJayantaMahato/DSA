import java.util.*;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size :");
		int size = sc.nextInt();
		System.out.println("enter the numbers that you want to store :");
		int[] number = new int[size];
		
		
		
		//input
		for (int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		
		
		System.out.println("enter the number whom you want to search :");
		int x =sc.nextInt();
		
		//output
		for (int i=0 ;i<number.length;i++) {
			if(number[i]==x) {
				
				System.out.println("the number is found at :"+i);
			}
		}
		

	}

}
