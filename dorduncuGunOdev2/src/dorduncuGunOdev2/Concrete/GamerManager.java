package dorduncuGunOdev2.Concrete;

import dorduncuGunOdev2.Abstract.GamerCheckService;
import dorduncuGunOdev2.Abstract.GamerService;
import dorduncuGunOdev2.Entities.Gamer;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+ " eklendi.");
		}
		else {
			System.out.println(gamer.getFirstName()+ " eklenemedi. ! Kimlik bilgilerini kontrol ediniz !");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " silindi.");
		
	}
}
