package game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

/**
 * Classe permettant de g�rer les inputs clavier
 * 
 * @author R�my
 *
 */

public class InputControl {
	
	/** Input du clavier */
	public static Input input;
	/** GameContainer */
	public static GameContainer gc;
	
	
	public InputControl(){
		input = gc.getInput();
	}
	/**
	 * Touche Pr�s�e
	 * @param key ID de la touche
	 * @return True si l'a touche est pr�ss�e
	 */
	public static boolean inputPressed(int key){
		input = gc.getInput();
		if(input.isKeyPressed(key)){
			input.clearControlPressedRecord();
			return true;
		}
		return false;
	}
	
	/**
	 * Touche Enfonc�e
	 * @param key ID de la touche
	 * @return True si l'a touche est enfonc�e
	 */
	public static boolean inputDown(int key){
		input = gc.getInput();
		if(input.isKeyDown(key)){
			return true;
		}
		return false;
	}
	
	public static void update(){
		input = gc.getInput();
		input.clearKeyPressedRecord();
	}
}
