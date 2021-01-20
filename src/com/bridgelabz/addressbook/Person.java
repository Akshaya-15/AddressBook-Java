package com.bridgelabz.addressbook;

public class Person {
	private String firstName;  
	 private String lastName;
	 private String phoneNumber;
	 private Address address;

	  //constructor
	  public Person(String firstName, String lastName, String phoneNumber, Address address) 
	  {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.phoneNumber = phoneNumber;
	    this.address=address;

	  }
	
	public Person(String firstName2, String lastName2, String phoneNum, String city, String state, String zipCode,
			String email) {
		// TODO Auto-generated constructor stub
	}


	public String toString() 
	{
		return "Person [firstname=" + firstName + ", lastname=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}


	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getphoneNumber() 
	{
		return lastName;
	}

	public void setphoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	
		
	}

	




