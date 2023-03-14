package com.gl.gradedproject1.application;
import java.util.Scanner;
import com.gl.gradedproject1.employee.Employee;
import com.gl.gradedproject1.credentialservices.CredentialServices;


public class MainApplication {

	public static void main(String[] args) {
		int choice;
		String dept="";
		Scanner sc1=new Scanner(System.in);
		
		while(true) {
			System.out.println("enter your first name:");
			String fName = sc1.next();
			System.out.println("enter your last name");
			String lName=sc1.next();
			System.out.println("Please select the department of your choice:");
			System.out.println("---------------------------");
			System.out.println("1.Technical Department");
			System.out.println("2.Admin Department");
			System.out.println("3.Human Resources");
			System.out.println("4.Legal Department");
			System.out.println("0.Exit");
			System.out.println("---------------------------");

			choice = sc1.nextInt();


			switch (choice)
			{
			case 0:	
				sc1.close();
				System.exit(1);
				break;
			case 1:		
				dept= "tech";
				break;

			case 2:

				dept= "admin";
				break;

			case 3:

				dept= "human";
				break;

			case 4:

				dept= "legal";
				break;

			default:
				System.out.println("Select proper Department");

			}
			if(choice>=1 && choice<=4)	{
				Employee employee1 = new Employee(fName, lName,dept);	
				CredentialServices cService = new CredentialServices();	
				System.out.println("Dear " +employee1.getFirstName()+" your generated credentials are as follows : ");
				System.out.println("Email: " +employee1.generateEmail());
				System.out.println("Password: "+cService.generatePassword());
			}
		}

		}
	}
	

