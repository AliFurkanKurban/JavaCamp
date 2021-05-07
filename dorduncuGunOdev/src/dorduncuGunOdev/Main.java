package dorduncuGunOdev;

import dorduncuGunOdev.Abstract.BaseCustomerManager;
import dorduncuGunOdev.Concrete.CustomerCheckManager;
import dorduncuGunOdev.Concrete.NeroCustomerManager;
import dorduncuGunOdev.Concrete.StarbucksCustomerManager;
import dorduncuGunOdev.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Ali Furkan","Kurban","12345678910");
		Customer customer2 = new Customer(2,"Engin","Demiroð","98765432100");
		
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
		System.out.println("**** Starbucks'a kayýt ****");
		baseCustomerManager1.save(customer1);
		baseCustomerManager1.save(customer2);
		System.out.println("************************************************");
		System.out.println("************************************************"); 
		
		System.out.println("**** Nero'ya kayýt ****");
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(customer1);
		baseCustomerManager2.save(customer2);

		
		
		
	}

}
