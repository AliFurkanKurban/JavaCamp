package dorduncuGunOdev2.Concrete;


import dorduncuGunOdev2.Entities.Gamer;
import dorduncuGunOdev2.Abstract.GameService;
import dorduncuGunOdev2.Entities.Game;


public class GameManager implements GameService {
	@Override
	public void buy(Game game,Gamer gamer) {
		System.out.println(game.getName() +" " +gamer.getFirstName() + " tarafýndan satýn alýndý. Fiyat = "+	game.getPrice() );
		
	}
}
