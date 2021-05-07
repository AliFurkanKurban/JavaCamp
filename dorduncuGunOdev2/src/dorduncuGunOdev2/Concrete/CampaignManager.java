package dorduncuGunOdev2.Concrete;

import dorduncuGunOdev2.Abstract.CampaignService;
import dorduncuGunOdev2.Entities.Campaign;
import dorduncuGunOdev2.Entities.Game;

public class CampaignManager implements CampaignService {
	
	@Override
	public void add(Campaign campaign, Game game ) {
		System.out.println(campaign.getName() +" uygulandý yeni fiyat =  " + (game.getPrice()-campaign.getAmount()));
	}
	
	@Override
	public void update(Campaign campaign, Game game ) {
		System.out.println(campaign.getName() +" güncellendi yeni fiyat =  " + (game.getPrice()-campaign.getAmount()));
	}
	
	@Override
	public void delete(Campaign campaign, Game game ) {
		System.out.println(campaign.getName() +" silindi yeni fiyat =  " + game.getPrice());
	}
	
}
