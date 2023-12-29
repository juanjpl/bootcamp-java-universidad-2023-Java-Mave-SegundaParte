package ar.com.educacionit.console;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import ar.com.educacionit.entities.AddressBook;
import ar.com.educacionit.repository.parse.impl.AddressBookFileParser;
import ar.com.educacionit.repository.search.Search;
import ar.com.educacionit.repository.search.impl.FirstAndLastNameSearch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	//1.cargar el archivo csv
    	AddressBookFileParser parse = new AddressBookFileParser();
    	
    	List<AddressBook> listado = parse.parse();
    	
    	Scanner keyboard = new Scanner(System.in);
    	
    	//2.mostrar el menu al usuario
    	Integer op = null;
    	
    	do {
    		Menu.mostrarMenu();
    		op = Menu.getOp(keyboard);
    	}while(op<1 || op >4);
    	
    	
    	Search search = null;
    	
    	
    	switch (op) {
		case 1:
			System.out.println("First Name:");
			String name = keyboard.next();
			
			System.out.println("Last Name:");
			String lastName = keyboard.next();
			
			search = new FirstAndLastNameSearch(name, lastName);
			((FirstAndLastNameSearch)search).setFirstName(name);
			((FirstAndLastNameSearch)search).setFirstName(lastName);
			
			
			break;
case 2:
			
			break;
case 3:
	
	break;
case 4:
	
	break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
    	
    	List<AddressBook> filteredList= search.execute(listado);
    	//3.buscar en base a la opcion
    	
    	
    	
    	//4.mostrar recursivamente
    	
    	//5.preguntar si continua
    	
    	//6.fin
    	
    	
    	
    	
    	System.out.println(UUID.randomUUID());
    }
}
