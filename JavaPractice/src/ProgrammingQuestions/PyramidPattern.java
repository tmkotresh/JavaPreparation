package ProgrammingQuestions;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How Many Rows You Want In Your Pyramid?");
		Scanner sc = new Scanner(System.in);
		
		int noOfRows = sc.nextInt();
		
		int rowCnt = 1;
		
		for(int i=noOfRows;i>0;i--){
			
			for (int j=1;j<=i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowCnt;j++){
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
			
			rowCnt++;
			
			
		}
		
		
		

	}

}
