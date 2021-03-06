package game;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class JoystickControl extends BasicGameState {

	private Image bg;
	
	public JoystickControl(int ID ){
		
	}
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		bg = new Image("res/option/controls-manette.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		bg.draw();
		Option.back.render(gc, g);
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame sbg, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		int posX = Mouse.getX();    // attrape la position de la souris
		int posY = Math.abs((Mouse.getY())-600);
		if(pos(Option.back,posX,posY)){
			if (Mouse.isButtonDown(0)) {
				sbg.enterState(4);
				sbg.enterState(4, new FadeOutTransition (),new FadeInTransition(Color.black));
			}
		}
		
	}
	
	/**
	 * Retourne true si la souris est sur le bouton 
	 *
	 * @param a
	 * @param posX
	 * @param posY
	 * @return boolean
	 */
	private boolean pos(MouseOverArea a, int posX, int posY){
		if ((posX > a.getX() && posX < (a.getX()+a.getWidth()) && (posY < a.getY()+a.getHeight() && posY > a.getY()))) {
			return true;
		}
		return false;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 9;
	}

}
