package event;

import map.Map;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Circle;

import player.Player;

/**
 * Classe permettant de cr�er des interrupteur relatifs aux tuyaux 
 * de la classe Pipe
 * Changement d'image lors de l'activation de l'interrupteur
 * 
 * @author R�my
 */

public class Switch {
	/**  Coordonn�es de l'interrupteur */
	private int x,y;
	/** Activ� ou non */
	private boolean actived = false;
	/** Image correspondant aux diff�rents �tats de l'interrupteur */
	private Image active, noActive;
	/** Cercle permettant la collision avec le personnage */
	private Circle circle;
	/**  Num�ro relatif au tuyau */
	private int ID;
	
	/**
	 * On initialise l'interrupteur
	 * @param x Abscisse
	 * @param y Ordonn�es
	 * @param ID Num�ro correspondant aux tuyaux
	 * @throws SlickException
	 */
	public Switch(int x, int y,int ID) throws SlickException{
		this.x = x;
		this.y = y;
		this.ID = ID;
		this.actived = false;
		noActive = new Image("res/event/noActiveSwitch.png");
		active = new Image("res/event/activeSwitch.png");
		circle = new Circle(x+16, y+16, 10);
	}
	
	/**
	 * Classe permettant le rendu des int�rrupteur
	 */
	public void render(int IDX, int IDY){
		
		if(Map.isMap(IDX, IDY)){
			if(!actived){
				noActive.draw(x, y);
			}
			else active.draw(x, y);
		
			circle.setLocation(x, y);
			
			if(Player.getRect().intersects(this.circle)){
				actived=true;
				if(ID==1)
					Map.setOne(true);
				if(ID==2)
					Map.setTwo(true);
				if(ID==3)
					Map.setThree(true);
				if(ID==4)
					Map.setFour(true);
				if(ID==5)
					Map.setFive(true);
			}
		}
	}
}
