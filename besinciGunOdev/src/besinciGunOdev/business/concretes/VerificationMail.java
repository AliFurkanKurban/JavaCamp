package besinciGunOdev.business.concretes;

import besinciGunOdev.business.abstracts.VerificationMailService;
import besinciGunOdev.entities.concretes.User;

public class VerificationMail implements VerificationMailService{

	@Override
	public void verify(User user) {
		System.out.println("Doðrulama "+ user.getMail() +" e-postasýna gönderildi.");
	}
	
}
