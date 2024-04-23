/**
 * 
 */

/** @author Dayani Carmenate 
 * 
 */
public class Student 
{
	private String firstName;
	private String lastName;
	private String currentAddress;
	private String homeAddress;
	private double gpa;
	private String phoneNumber;

	
public Student(String firstName, String lastName, String currentAddress, String
		homeAddress, double gpa, String phoneNumber) 
{

this.firstName = firstName;
this.lastName = lastName;
this.currentAddress = currentAddress;
this.homeAddress = homeAddress;
this.gpa = gpa;	
this.phoneNumber = phoneNumber;
}

public Student(String name, String lastName2) {
}

//getter and setters of the variables 
 public String getFirstName(){
	 
	 return firstName;
 }

public void setFirstName(String firstName) {
		
 this.firstName = firstName;
		
	}
	
 public String getLastName() {
	 
	 return lastName;
 }
	
public void setLastName (String lastName) {
		
	this.lastName = lastName;
	
}
	
public 	String getCurrentAddress() {
	
	return currentAddress;
}

public void setCurrentAddress(String currentAddress) {
	 
	this.currentAddress = currentAddress;
	 
 }

public String getHomeAddress() {
	
	return homeAddress;
	
}
	
public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
		
	}

public double getGpa() {
	 
	return gpa;
	
}

public void setGpa(double gpa) {
	 
	 this.gpa = gpa;
	 
 }

public String setPhoneNumber() {
	
	return phoneNumber;
	
}

public void getPhoneNumber(String phoneNumber) 
{
 
	this.phoneNumber = phoneNumber;
}

// toString at the end gets  all variables despite their data type and 
//and turns them into a string

public String toString () 
{
	return "Name: " + firstName + " " + lastName + "\n" + "Current Address: " + 
currentAddress + "\n" + " Home Address: " + homeAddress + "\n" + "GPA: " + gpa + "\n" +
			" Phone Number: " + phoneNumber; 

}

}
