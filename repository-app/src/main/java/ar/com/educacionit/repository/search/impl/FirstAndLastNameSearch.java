package ar.com.educacionit.repository.search.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.entities.AddressBook;
import ar.com.educacionit.repository.search.Search;

public class FirstAndLastNameSearch implements Search {

	
	private String firstName;
	private String lastName;
	
	


	@Override
	public List<AddressBook> execute(List<AddressBook> sourceList) {
		
		List<AddressBook> filteredList = new ArrayList<>();
		
		for (AddressBook addressBook : sourceList) {
			if(addressBook.getName().contains(this.firstName.toLowerCase()) && addressBook.getName().contains(this.lastName.toLowerCase())) {
				filteredList.add(addressBook);
			}
		}
		return filteredList;
	}
	
	
	public FirstAndLastNameSearch(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	

	public void setFirstName(String firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException("First Name is null");
		}
		this.firstName = firstName;
	}




	public void setLastName(String lastName) {
		if(lastName == null) {
			throw new IllegalArgumentException("First Name is null");
		}
		this.lastName = lastName;
	}




}
