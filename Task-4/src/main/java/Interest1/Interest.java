package Interest1;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Interest
{
	public Interest()
	{
	    Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	    print.println("Enter your choice\n1.Simple interest\n2.Compound interest");
	    int choice =scan.nextInt();
	    print.println("Enter principal amount:");
		double principal_amount=scan.nextInt();
		print.println("Enter rate of interest:");
		double rate =scan.nextInt();
		print.println("Enter time (in years):");
		int time=scan.nextInt();
	    if(choice==1)
	    {
	    	print.println("Simple interest of the amount "+principal_amount+" is Rs."+(principal_amount*time*rate)/100);
	    }
	    else if(choice==2)
	    {
	    	print.println("Compound interest of the amount "+principal_amount+" is Rs."+(principal_amount*Math.pow((1+rate/100),time)));
	    }
	    else
	    {
	    	print.println("Enter valid choice");
	    }
	}
}
