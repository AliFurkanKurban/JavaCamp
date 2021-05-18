package besinciGunOdev.business.concretes;

import besinciGunOdev.business.abstracts.AuthService;
import besinciGunOdev.business.abstracts.UserService;
import besinciGunOdev.business.abstracts.VerificationMailService;
import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class UserManager implements UserService{

	AuthService authService;
	UserDao userDao;
	VerificationMailService verificationMailService;
	
	public UserManager(AuthService authService,UserDao userDao,VerificationMailService verificationMailService) {
		super();
		this.authService = authService;
		this.userDao = userDao;
		this.verificationMailService = verificationMailService;
	}

	@Override
	public void register(User user) {
 		if(authService.validateName(user) && authService.validateMail(user) && authService.validatePassword(user)) {
			userDao.add(user.getId(),user.getFirstName(),user.getLastName(),user.getMail(),user.getPassword());
			System.out.println("Kaydedildi.");
			verificationMailService.verify(user);
		}
		else {
			System.out.println("Kaydedilemedi l�tfen bilgilerinizi kontrol ediniz !");
		}
		
	}

	@Override
	public void login(User user) {
		if(authService.validateIsThereUser(user)) {
			System.out.println("Giri� yap�l�yor.");
		}
		else {
			System.out.println("Giri� yap�lamad� l�tfen bilgilerinizi kontrol ediniz !");
		}
	}


	@Override
	public User getUser(int id, User user) {
		if(authService.validateIsThereUser(user)) {
			System.out.println();
		}
		else {
			System.out.println("Kaydedilemedi l�tfen bilgilerinizi kontrol ediniz !");
		}
		return null;
	}
	
}
