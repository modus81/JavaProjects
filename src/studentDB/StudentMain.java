package studentDB;

import java.util.Date;
import java.util.Random;

/*- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)*/
public class StudentMain {
	String name;
	String userID;
	String email;
	//using Encapsulation to protect variable info
	private String phnNumber;
	private String city;
	private String state;
	
	//allow user to define them using setters and getters
	public void setCity(String city){
		/* "this" sets the city instance variable to the main class variable to allow usage
		 throughout the program*/
		this.city = city;
		
	}

     public String getCity(){
    	return city;
		 
	 }     
    
	public String getPhnNumber() {
		return phnNumber;
	}

	public void setPhnNumber(String phnNumber) {
		this.phnNumber = phnNumber;
	}

    
	
	 public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

	public String NewStudent (String Name, int ssn){
		 //email is created with the name and concat with @SDET.edu	
	   email = (Name +"@Sdet.edu");
	   System.out.println(email); 
	   return email = (Name +"@Sdet.edu");   
	   		 
		 
	 }
	 
	 //Private ID ; unsure of what this is supposed to be
	 private static void ID (){
		 Random rand = new Random();
		 int value = rand.nextInt(2000) + 1000;
		
	 }
	 
	 public String userID(int privateID,int ssn){
		 Random rand = new Random();
		 int value = rand.nextInt(9000) + 1000;
		 privateID= 2;
		 String rando = Integer.toString(value);
		 String priv = Integer.toString(privateID);
		 String social = Integer.toString(ssn).substring(5, 9);
		 String UserID =  rando + priv + social;	
		 userID = UserID;
		 System.out.println(UserID);
		 return UserID;
		 
	 }
	 
	 public String enroll(){
		  Date date = new Date();
		  System.out.println(date.toString());
		  return date.toString() ;
	 }
	 public int checkBalance(int amountPaid){
		 int tuition = 3500;
		 int balance = tuition - amountPaid  ;	
		 System.out.println("The remaining balance: " + balance);
		 return balance;
	 }
	 public void showCourse(){
		 System.out.println("Your courses are: " + "English "+" Science "+ " Math");
		 
	 }
	 
	 @Override // an annotation that overrides to use this and not another toString metho
     // toString turns an object into a string
      public String toString() {
     return "[ City: " + city + "  Email: " + email + "User ID is: " + userID + "]";	}
		 
	 

}
