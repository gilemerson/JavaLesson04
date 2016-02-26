import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
			
		//Instantiate Person Class
		Person person = new Person();

		
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
     
	


