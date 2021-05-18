package besinciGunOdev.core.concretes;

import besinciGunOdev.business.abstracts.AuthService;
import besinciGunOdev.business.abstracts.VerificationMailService;
import besinciGunOdev.core.abstracts.GoogleRegisterService;
import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class GoogleRegisterManager implements GoogleRegisterService{
	GoogleRegister googleRegister;
	AuthService authService;
	UserDao userDao;
	VerificationMailService verificationMailService;

	public GoogleRegisterManager(GoogleRegister googleRegister, AuthService authService, UserDao userDao, VerificationMailService verificationMailService ) {
		super();
		this.googleRegister = googleRegister;
	}

	@Override
	public void register(User user) {
		if(authService.validateName(user) && authService.validateMail(user) && authService.validatePassword(user)) {
			userDao.add(user.getId(),user.getFirstName(),user.getLastName(),user.getMail(),user.getPassword());
			System.out.println("Kaydedildi.");
			verificationMailService.verify(user);
			googleRegister.register(user);
		}
		else {
			System.out.println("Kaydedilemedi lütfen bilgilerinizi kontrol ediniz !");
		}
		
	}
	
	
	
}
