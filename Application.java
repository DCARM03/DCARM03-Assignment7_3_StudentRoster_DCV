import java.util.Scanner;
public class Application 
{
/**
 ** @author Dayani Carmenate
 */
public static void main(String[] args) 
	{
		
	Student s ;
	StudentRoster sR = new StudentRoster();
	Scanner scanner = new Scanner(System.in); 
 
	Boolean run = true;
		
	while (run) 
	{
	    System.out.println("\nStudent Management System\n");
		System.out.println("1. Enter Student Information");
	    System.out.println("2. Print Student Roster");
		System.out.println("3. Search for a Student");
		System.out.println("4. Save Student Roster to Disk");
	    System.out.println("5. Read Student Roster from Disk");
		System.out.println("6. Exit\n");
		System.out.println("Enter your choice:");
		  int choice = scanner.nextInt();
		scanner.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("\nEnter student information:");
				System.out.print("First name: ");
				String firstName = scanner.nextLine();

				System.out.print("Last name: ");
				String lastName = scanner.nextLine();

				System.out.print("Current address: ");
				String currentAddress = scanner.nextLine();

				System.out.print("Home address: ");
				String homeAddress = scanner.nextLine();

				System.out.println("Enter gpa");
				   double gpa = scanner.nextDouble();
				        
				  
				 System.out.print("Phone number: ");
				  String phoneNumber = scanner.next();
				   scanner.nextLine();
				   s = new Student( firstName,lastName, currentAddress, homeAddress,  gpa,  phoneNumber); 
				   sR.addStudent(s);
				   
		       break;
				case 2: 
					sR.printRoster();
					
					
					break;
				case 3:
					System.out.print("Enter student name: ");
					String firstName1 = scanner.next();
					System.out.print("Enter student last name: ");
					String lastName1 = scanner.next();
					 sR.printStudentInfo(firstName1 , lastName1);
					break;
				case 4: 
					 System.out.print("Enter file name you wish to save: ");
					 String saveFileName = scanner.nextLine();
					 sR.saveRoster(saveFileName);
					 
					break;
				case 5:
					System.out.print("Enter file name you wish to read: ");
					 String readFileName = scanner.nextLine();
					 sR.readRoster(readFileName);
					 
					break;
		
				case 6: 
					run = false;
					System.out.print("Exiting now.. Have a Good Day!");
					break ;
				default:
                 System.out.println("Invalid choice. Please enter a number from 1 to 6.");		
			
		}
	 }	
  }
	public String toString() 
	{
	    StringBuilder sb = new StringBuilder();
	    sb.append("Student Management System Menu:\n");
	    sb.append("1. Enter Student Information\n");
	    sb.append("2. Print Student Roster\n");
	    sb.append("3. Search for a Student\n");
	    sb.append("4. Save Student Roster to Disk\n");
	    sb.append("5. Read Student Roster from Disk\n");
	    sb.append("6. Exit\n");
	    return sb.toString();
	}

}


