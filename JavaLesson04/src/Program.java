import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
			
		//Instantiate Person Class
		Person person = new Person();
		String prompt = "";
		
		do {
			System.out.println("Please Make A Selection");
			System.out.println("----------------------");
			System.out.println("1. Enter Your Age");
			System.out.println("2. Exit");
			System.out.println("-----------------------");
			
			//Listen for choice
			Scanner input = new Scanner(System.in);
			prompt = input.nextLine();
			
			switch (prompt) {
			case "1":
				SetAge(person);	
				break;
			case "2":
				break;
			}		
			
		} while (!prompt.equals("2"));//if its not equal to 2, keep going				
	 }

	//Set Age 
	private static void SetAge(Person person) {
		while (!person.getIsValid()) {
			//make sure no none numerical values are enter by user
			
				Scanner input = new Scanner(System.in);//Create Input Scanner	
				
				System.out.print("Please Enter Your Age:");
			    person.setAge(input.nextLine());//Receive person age and make sure its valid then send to next line
			
			    if(person.getIsValid()){
			    	System.out.println(person.toString());//get the person age
			    }
			    else {
			    	System.out.println();
			    }    
			}		
	   }
  }
     



