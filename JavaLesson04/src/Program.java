import java.util.Scanner;

public class Program {

	//Try Catch Blocks 
	
	public static void main(String[] args) {
			
		int myAge;
		boolean isValid = false;
		
		while (!isValid) {
			
			try {
				Scanner input = new Scanner(System.in);//Create Input Scanner
				System.out.print("Please Enter Your Age:");
			    myAge = input.nextInt();
			
			    System.out.println(" \nYour Age is: "+ myAge);
			    isValid = true;
			
			}   
			    catch (Exception exception) {
				System.out.println("'Please Enter A Positive Number'");
			}
		  }
		}
     }
	


