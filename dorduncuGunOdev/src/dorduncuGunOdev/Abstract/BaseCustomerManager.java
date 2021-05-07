package dorduncuGunOdev.Abstract;

import dorduncuGunOdev.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerDal {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " veritabanýna eklendi.");
	}

}
