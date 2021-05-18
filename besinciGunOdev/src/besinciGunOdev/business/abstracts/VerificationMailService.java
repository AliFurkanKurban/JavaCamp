package besinciGunOdev.business.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface VerificationMailService {
	void verify(User user);
}
