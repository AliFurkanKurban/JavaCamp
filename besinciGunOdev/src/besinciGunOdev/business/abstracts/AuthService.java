package besinciGunOdev.business.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface AuthService {
	
	boolean validateName(User user);
	boolean validateMail(User user);
	boolean validatePassword(User user);
	boolean validateIsThereUser(User user);
	
	
}
