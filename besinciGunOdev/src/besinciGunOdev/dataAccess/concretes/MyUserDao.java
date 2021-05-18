package besinciGunOdev.dataAccess.concretes;

import besinciGunOdev.dataAccess.abstracts.UserDao;

public class MyUserDao implements UserDao {

	@Override
	public void add(int id, String firstName, String lastName, String mail, String password) {
		System.out.println(firstName + "  MyUserDao ile veritabanýna kaydedildi");
	}

	@Override
	public void update(int id, String firstName, String lastName, String mail, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		
	}


}
