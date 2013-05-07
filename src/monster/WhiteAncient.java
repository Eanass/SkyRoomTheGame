package monster;

import items.Item;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import event.Event;

import player.Player;

/**
 * Classe cr�ant les monstre WhiteAncient
 * Ces monstres ralentissent le joueur
 * 
 * @author R�my
 *
 */

public class WhiteAncient extends Monster {
	
	/** SpriteSheet de l'animation */
	private SpriteSheet sprite;
	/** Animation du ralentissement */
	private Animation anim;
	/** Delay entre un peu initule.. */
	private int delay=1;
	/** True si on affiche l'animation  � l'�cran */
	private boolean isRender,increaseNB;
	
	public WhiteAncient() {
		super(0.05f,30);
	}
	
	public void init() throws SlickException{
		super.init();
		this.MonsterAnim("whiteAncient", 32, 32);
		sprite = new SpriteSheet("res/monster/clockEffect.png", 64, 64);
		anim = new Animation(sprite,0,0,4,4,true,100,true);
		if(Event.specialItemBonus){
			item = new Item("specialBonus");
			Event.specialItemBonus = false;
		}
	}
	
	public void render(Graphics g) throws SlickException{
		super.renderBot(g);
	}
	
	public void update(GameContainer gc, int delta) throws SlickException{
		super.update(gc, delta);
		if(alive){
			if(delay<40) delay++;
			else delay = 0;	
			if(delay == 0)
				isRender = true;
			if(!alive && !increaseNB){
				increaseNB = true;
				Event.special_item_bonus++;
			}
		}
	}
	
	public void renderUp(Graphics g ){
		if(isRender && alive){
			Event.slowAncient = true;
			anim.start();
			anim.draw(Player.getX()-16, Player.getY()-16);
		}
		else{
			anim.stop();
			Event.slowAncient = false;
		}
	}
	
}
