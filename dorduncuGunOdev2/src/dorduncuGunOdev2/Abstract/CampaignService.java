package dorduncuGunOdev2.Abstract;

import dorduncuGunOdev2.Entities.Campaign;
import dorduncuGunOdev2.Entities.Game;

public interface CampaignService {
	 void add(Campaign campaign, Game game );
	 void update(Campaign campaign, Game game );
	 void delete(Campaign campaign, Game game );
}
