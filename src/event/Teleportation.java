package event;

import player.Player;
import map.Map;

/**
 * Classe permettant la t�l�portation du personnage
 * Sur la Map , il suffit de remplir la map avec un "teleport" = "true"
 * avec le logiciel tileMap
 * 
 * @author R�my
 */

public class Teleportation {
	
	/**
	 * M�thode permettant la t�l�portation du personnage
	 * @param IDxD IDx de d�part
	 * @param IDyD IDy de d�part
	 * @param IDxA IDx d'arriv�e
	 * @param IDyA IDy d'arriv�e
	 * @param x Abscisse d'arriv�e
	 * @param y Ordonn�e d'arriv�e
	 */
	public void teleport(int IDxD , int IDyD , int IDxA, int IDyA, float x, float y){
		if(Map.isMap(IDxD, IDyD)){
			if(Map.isTeleport(Player.getX()+16,Player.getY()+16)){
				Map.setIDx(IDxA);
				Map.setIDy(IDyA);
				Map.setInitNPC(false);
				Map.setInit(false);
				Player.setX(x);
				Player.setY(y);
			}
		}
	}
}
