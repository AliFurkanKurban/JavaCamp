package dorduncuGunOdev.Concrete;

import dorduncuGunOdev.Abstract.BaseCustomerManager;
import dorduncuGunOdev.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " veritabanýna eklendi.");
	}
}
