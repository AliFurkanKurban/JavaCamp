package dorduncuGunOdev2;

import dorduncuGunOdev2.Concrete.CampaignManager;
import dorduncuGunOdev2.Concrete.GameManager;
import dorduncuGunOdev2.Concrete.GamerCheckManager;
import dorduncuGunOdev2.Concrete.GamerManager;
import dorduncuGunOdev2.Entities.Campaign;
import dorduncuGunOdev2.Entities.Game;
import dorduncuGunOdev2.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"Ali Furkan","Kurban","12345678910");
		Gamer gamer2 = new Gamer(2,"Engin","Demiroð","00000000000");
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.save(gamer1);
		gamerManager.save(gamer2);
		gamerManager.delete(gamer1);
		gamerManager.update(gamer1);
		
		
		System.out.println("*******************************************");
		
		Game csgo = new Game(1,"CS-GO",70);
		
		GameManager gameManager = new GameManager();
		gameManager.buy(csgo , gamer1 );
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1,"Yaz Kampanyasý",35), csgo);
		campaignManager.update(new Campaign(2, "Yýlbaþý Kampanyasý", 40), csgo);
		campaignManager.delete(new Campaign(2, "Yýlbaþý Kampanyasý", 40), csgo);
		
		
		
		
		
	}

}
