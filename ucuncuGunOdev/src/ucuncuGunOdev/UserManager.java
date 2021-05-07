package ucuncuGunOdev;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" eklendi" );
	}
	
	public void del(User user) {
		System.out.println(user.getFirstName()+" silindi" );
	}
}
