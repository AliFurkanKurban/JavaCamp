package besinciGunOdev;


import besinciGunOdev.business.abstracts.UserService;
import besinciGunOdev.business.concretes.AuthManager;
import besinciGunOdev.business.concretes.UserManager;
import besinciGunOdev.business.concretes.VerificationMail;
import besinciGunOdev.dataAccess.concretes.MyUserDao;
import besinciGunOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Ali Furkan", "Kurban", "frkn_6898@hotmail.com", "123456");
		
		UserService userManager = new UserManager(new AuthManager(), new MyUserDao(),new VerificationMail());
		userManager.register(user1);

	}

}
