package ar.com.educacionit.repository.parse.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ar.com.educacionit.entities.AddressBook;
import ar.com.educacionit.repository.parse.IParser;

public class AddressBookFileParser implements IParser<List<AddressBook>> {

	@Override
	public List<AddressBook> parse() {
		// Deberia leer el archiov linea por linea e ir creando cada AddressBook
		//Luego agregarlo a la lista 
		//ultimo... retornar la lista 
		
		List<AddressBook> list = new ArrayList<>();
		
	
		
		
		for (int i = 0; i < 50; i++) {
			UUID uuid = UUID.randomUUID();
			list.add(new AddressBook(uuid.toString(),"Nombre-"+ Math.random() + "-Name", Math.random() + "@email.com" ));
		}
		
		
		return list;
	}

}
