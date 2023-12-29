package ar.com.educacionit.entities;

import java.util.Objects;

public class AddressBook {

	private String id;
	private String name;
	private String emailAdress;
	
	
	
	public AddressBook(String id, String name, String emailAdress) {
		super();
		this.id = id;
		this.name = name;
		this.emailAdress = emailAdress;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmailAdress() {
		return emailAdress;
	}



	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}



	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", name=" + name + ", emailAdress=" + emailAdress + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(emailAdress, id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressBook other = (AddressBook) obj;
		return Objects.equals(emailAdress, other.emailAdress) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
	
	
	
}
