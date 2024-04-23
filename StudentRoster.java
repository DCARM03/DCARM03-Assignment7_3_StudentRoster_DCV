/**
 * 
 */

/**@author Dayani Carmenate 
 * 
 */
import java.io.*;
public class StudentRoster 
{
	 private Student [] roster;
	 private int count;
	 
	 public StudentRoster() 
	 {
		 roster = new Student [5];
		 count = 0;
	 }
	  public void addStudent(Student student)
	  {
		 if ( count < roster.length) 
		 {
			 roster[count]= student;
			 count ++;
			 System.out.print("Student was added successfully ");
			 
		 }
		 else
		 {
			 System.out.println("Student was not added successfully ");
	     }
	  }
	  public void printStudentInfo(String firstName1, String lastName1) 
	  {
		  for ( int i = 0; i < roster.length; i ++) {
		        System.out.println(roster[i]);
		    }
	  
	      }
	    public void printRoster() 
	    {
	    	for ( Student student : roster ) 
	    	{
	    		System.out.println(student);
	    	}
	    }
	  
	    public void saveRoster(String fileName) {
	        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            outputStream.writeObject(roster);
	            System.out.println("Roster saved successfully.");
	        } catch (IOException e) {
	            System.out.println("Error saving roster: " + e.getMessage());
	        }
	    }
	    
	    public void readRoster(String fileName) {
	        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
	            roster = (Student[]) inputStream.readObject();
	            System.out.println("Roster loaded successfully.");
	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Error loading roster: " + e.getMessage());
	        }
	    } 
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("StudentRoster: \n");
	        for (Student student : roster) {
	            sb.append(student).append("\n");
	        }
	        return sb.toString();
	    }

}
