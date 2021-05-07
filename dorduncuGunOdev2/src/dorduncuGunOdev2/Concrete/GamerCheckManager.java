package dorduncuGunOdev2.Concrete;

import dorduncuGunOdev2.Abstract.GamerCheckService;
import dorduncuGunOdev2.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		boolean isTrue;
		if(gamer.getNationaltyId() == "12345678910") {
			isTrue = true;
		}
		else {
			isTrue = false;
		}
		
		return isTrue;
	}

}
