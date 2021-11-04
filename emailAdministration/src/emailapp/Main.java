package emailapp;

import java.util.*;

public class Main 
{

	public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    
	    //User info 
	    System.out.println("Enter first name: ");
	    String f_name = s.next(); 
	    
	    System.out.println("Enter last name: ");
	    String l_name = s.next(); 
	    
	    //Creating obj for email class
	    Email emp1 = new Email(f_name, l_name); 
	    int choice = -1; 
	    do
	    {
	    	System.out.println("\n------------------\nEnter your choice\n1.Show Infor \n2. Change password \n3.Change mailbox capicity \n4. Set alternative email \n5. Exit");
	    	choice = s.nextInt(); 
	    	
	    	switch(choice)
	    	{
	    	case 1: emp1.getInfo(); break;
	    	case 2: emp1.setPassword(); break;
	    	case 3: emp1.set_mailCap(); break; 
	    	case 4: emp1.alternativeEmail(); break;
	    	case 5: System.out.println("Thank you for using the application."); break;
	    	default: System.out.println("Invalid choice! \nEnter proper choice again.");
	    	}
	    }while(choice != 5); 
	    
	    

	    
	}

}
