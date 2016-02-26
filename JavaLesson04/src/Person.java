
public class Person {
//Private Instance Variables 
	private int _age;
	private boolean _isValid = false;//if user inputs a error for age - less then one. Says it "Invalid"
	

	//Age Getter Access Method for age 
	public int getAge() {
		return _age;
	}
	
	//Get Access Method for "IsValid" 
	public boolean getIsValid() {
		return this._isValid;//read if its valid or not. 
	}

	//Age Setter Mutator/Method for age 
	public void setAge(String ageString) {
		//Check to make sure age is positive, a number etc...
		//Try/Catch Block - Ask me again if the user enters the wrong input
		try {
			int age = Integer.parseInt(ageString);//converting string into a integer
		if(age<0){
			System.out.println("Please Enter A Number");
		}
		
		else {
			
		this._age = age;
		this._isValid = true;
		
	} 
		} catch (Exception exception){
			System.out.println("Please Enter An Interger Value");
		}
	}
	
	//Empty Constructor
	Person(){
		
	}
	
	//toString Method   //Overriding the toString Method
	public String toString(){
		return "\nYour Entered: "+ this._age;
		
	}
}
	