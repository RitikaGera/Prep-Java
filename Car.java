//car
import java.util.*;
public class Car{
	public static void main(String args[])
	{
		int i=0;
		
		System.out.print("Enter the number of cars in fleet");
		Scanner scanner= new Scanner(System.in);
		int ncars=scanner.nextInt();
		int type[]=new int[ncars];
		float eff[]=new float[ncars];
		float left[]=new float[ncars];


				
		//System.out.print(""+ncars);
		

		for(i=0;i<ncars;i++)
		{
			
			type[i]=scanner.nextInt();
			eff[i]=scanner.nextFloat();
			left[i]=scanner.nextFloat();
			
		}
	        for(i=0;i<ncars;i++)
		{
			float range=eff[i]*left[i];
			System.out.println("Car"+i+" range= "+range);
		}

	}
}
