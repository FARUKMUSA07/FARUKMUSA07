package CLASS;

import java.util.Scanner;

public class faruk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input the value of R1");
		double R1 = input.nextDouble();
		System.out.println("Input the value of R2");
		double R2 = input.nextDouble();
		double seriesResult = R1 + R2;
		input.close();
		double parallelResult = 1/R1 + 1/R2;
		parallelResult = 1/parallelResult;
		System.out.println("Total resistance for series circuit is " + seriesResult);
		System.out.println("Total resistance for parallel circuit is " + parallelResult);

	}

}
