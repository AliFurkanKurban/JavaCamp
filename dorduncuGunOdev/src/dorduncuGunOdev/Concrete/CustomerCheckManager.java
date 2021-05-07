package dorduncuGunOdev.Concrete;

import dorduncuGunOdev.Abstract.CheckManager;
import dorduncuGunOdev.Entities.Customer;

public class CustomerCheckManager implements CheckManager{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
	
		boolean check;
		if(customer.getNationaltyId() == "12345678910") {check = true;}
		else {check = false;}
		return check ;
	}

}
