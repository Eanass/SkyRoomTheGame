package monster;

import map.Map;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import player.Player;

/**
 * Classe cr�ant le BOSS Mickael Jackson
 * 
 * @author R�my
 *
 */

public class MJ extends Monster {

	/** Lumi�re autour du perssonnage */
	private Image light;
	/** Permet de faire revenir MJ � la vie */
	private boolean restartMJ;
	/** D�lai entre 2 morts cons�cutives */
	private int cptDead;
	
	/**
	 * Constructeur par d�faut 
	 * on lui donne une vitesse de 0.07
	 */
	public MJ(){
		super(0.07f,200);
	}
	
	/**
	 * Initialisation du monstre et de la lumi�re
	 */
	public void init() throws SlickException{
		super.init();
		super.MonsterAnim("MJ",32,32);
		light = new Image("res/all/light2.png");
	}
	
	/**
	 * On affiche le monstre et on affiche la lumi�re
	 * 
	 * @param g Sortie de l'�cran
	 */
	public void renderBot(Graphics g) throws SlickException{
		super.renderBot(g);
		light.draw(-795 + Player.getX(), -955 + Player.getY());

	}
	
	public void update(GameContainer gc, int delta) throws SlickException{
		super.update(gc, delta);
		
		if(!alive){
			cptDead++;
			if(cptDead>80){
				restartMJ = true;
				cptDead = 0;
			}
		}
		
		if(restartMJ){
			do{
				xM = (float) (Math.random()*480 +160);
				yM = (float) (Math.random()*280 +160);
			} 
			while(Map.isBlocked(xM, yM)||(Map.isBlocked(xM+31, yM+31)) 
					|| (Map.isBlocked(xM, yM+31))||(Map.isBlocked(xM+31, yM)));
			restartMJ =false;
			alive = true;
			this.life = 200;
		}
		
	}
}
