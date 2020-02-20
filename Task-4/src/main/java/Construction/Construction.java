package Construction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	public Construction()
	{
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
		print.println("Enter your choice of materials\n1.Standard materials\n2.Above Standard materials\n3.High Standard material");
		int choice =scan.nextInt();
		print.println("Enter total area of house(in sq_feets)");
		int square_feet=scan.nextInt();
		if(choice==1)
		{
			print.println("Cost of the house is Rs."+(1200*square_feet));
		}
		else if(choice==2)
		{
			print.println("Cost of the house is Rs."+(1500*square_feet));

		}
		else if (choice==3)
		{
			print.println("Do you want fully automated house?Yes/No:");
			String ch=scan.next();
			if (ch.equals("Yes"))
				print.println("Cost of the house is Rs."+(2500*square_feet));
			else if (ch.contentEquals("No"))
				print.println("Cost of the house is Rs."+(1800*square_feet));
		}
	}

}
