package dorduncuGunOdev.Concrete;

import dorduncuGunOdev.Abstract.BaseCustomerManager;
import dorduncuGunOdev.Abstract.CheckManager;
import dorduncuGunOdev.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CheckManager checkManager;
	
	public StarbucksCustomerManager(CheckManager checkManager) {
		this.checkManager = checkManager;
	}

	@Override
	public void save(Customer customer) {
		if (checkManager.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " veritabanýna eklendi.");
		}
		else {
			System.out.println("TCKN geçersiz !");
		}
		
	}

	
		
	
}
