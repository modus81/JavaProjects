package studentDB;

public class studentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StudentMain stud1 = new StudentMain();   
     stud1.setCity("Chicago");
     System.out.println("City:" +  stud1.getCity());
     
     stud1.setPhnNumber( "555-555-5555");
     System.out.println("Phone Number: " + stud1.getPhnNumber() );
     
     stud1.setState("IL");
     System.out.println("State: " + stud1.getState());
     
     stud1.userID(44566, 400522926);
	 stud1.NewStudent("MikeThomson", 324862926);
	 stud1.enroll();
	 stud1.checkBalance(3000);
	 stud1.showCourse();
	 
	
	 System.out.println(stud1.toString());
	 
	}

}
