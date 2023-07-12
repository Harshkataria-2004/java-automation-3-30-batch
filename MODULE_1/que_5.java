package MODULE_1;
import java.util.Scanner;
//que-5.Write a program in Java to input 5 numbers from keyboard and find their sum
//and average using for loop. 

public class que_5 {
	  public static void main(String[] args)
	{       
	    int i,num=0;
	    float sum=0,avg=0;
		for (i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();    
	  		sum +=num;
		}
		avg=sum/5;
		System.out.println("Sum : " +sum+", Average :" +avg);
	 
	}
}
