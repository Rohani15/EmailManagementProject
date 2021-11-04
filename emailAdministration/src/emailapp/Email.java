package emailapp;

import java.util.*;
import java.io.*;

public class Email
{
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    private int mailCapacity = 500; //500 by default
    private String alter_email;

    Scanner s = new Scanner(System.in);

    //Constructor to receive last and first name
    public Email(String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
        System.out.println("New Employee: " + this.fname +" " + this.lname);
        
        //Calling methods
        this.dept = this.setDept(); //Department 
        this.password = this.generatePassword(8);  //password
        this.email = this.generateEmail(); 
    }

    //our methods---------------------------------------------------------------------
    //Generating email method
    private String generateEmail()
    {
        return this.fname.toLowerCase() + "." + this.lname.toLowerCase() + "@" + this.dept.toLowerCase() + ".company.com";
    }

    //asking for dept---------------------------------------------------------------------
    private String setDept()
    {
        //going to add user interaction
        System.out.println("Department Codes: \n1 for Sales \n2 for Development \n3 for accounting \n0 for null");
        boolean flag = false;

        //using DO WHILE LOOP because you want it to execute at least one times
        do
        {
            System.out.println("Enter Department code");
            int choice = s.nextInt();
            switch(choice) {
                case 1: return "Sales";
                case 2: return "Development";
                case 3: return "Accounting";
                case 0: return "Null";
                default: System.out.println("Invalid choice. Please choose it again.");
            }
        }
        while(!flag); return null;
    }
    
    //Generate random password method---------------------------------------------------------------------
    private String generatePassword(int length)
    {
    	Random r = new Random(); 
    	String Capital_chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    	String Small_chars ="abcdefghijklmnopqrstuvwxyz"; 
    	String numbers ="0123456789"; 
    	String symbols="!@#$%&?";
    	String values= Capital_chars + Small_chars + numbers + symbols; 
    	String password=""; 
    	
    	for(int i=0; i<length; i++)
    	{
    		password += values.charAt(r.nextInt(values.length())); 
    	}
    	return password; 
    	
    }
    
    //Change password method---------------------------------------------------------------------
    public void setPassword()
    {
    	boolean flag = false; 
    	
    	do
    	{
    		System.out.println("Do you want to change your password? (Y?N)"); 
    		char choice = s.next().charAt(0); //to avoid the error, have it choose the first character. 
    		
    		if(choice == 'Y' || choice == 'y')
    		{
    			flag = true; 
    			System.out.println("Enter current password: "); 
    			String temp = s.next(); 
    			
    			if(temp.equals(this.password))
    			{
    				System.out.println("Enter new Password: ");
    				this.password=s.next(); 
    				System.out.println("Password changed successfully: ");

    			}
        		else System.out.println("Innocrrect Password"); 
    		}
    		else if(choice == 'N' || choice == 'n')
    		{
    			flag = true; 
				System.out.println("Password changed option canceled: ");

    		}
    		else
    		{
    			System.out.println("Enter a valid choice");
    		}
    	} while(!flag); 
    }
    
    //Set mailbox capacity method---------------------------------------------------------------------
    public void set_mailCap()
    {
    	System.out.println("Current capacity = " + this.mailCapacity + " mb");
    	System.out.println("Enter new capacity");
    	this.mailCapacity = s.nextInt(); 
    	System.out.println("Mailbox capacity is successfully changed: ");
    }
    
    //set alternate email---------------------------------------------------------------------
    public void alternativeEmail()
    {
    	System.out.println("Enter new alternative email."); 
    	this.alter_email = s.next(); 
    	System.out.println("Alternate email is set"); 
    }
    
    //Display user information---------------------------------------------------------------------
    public void getInfo()
    {
    	System.out.println("New " + this.fname + "" + this.lname);
    	System.out.println("Department: " + this.dept);
    	System.out.println("Email: " + this.email);
    	System.out.println("Password: " + this.password);
    	System.out.println("Mailbox capacity: " + this.mailCapacity+ "mb");
    	System.out.println("Alternate Email: " + this.alter_email);
    } 
    
}


























