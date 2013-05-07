package event;

import map.Map;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import player.Player;

/**
 * Classe cr�ant une cin�matique � l'aide de plusieurs images
 * 
 * @author R�my
 *
 */

public class Cinematic {

	/** Image de la cin�matique */
	private Image img;
	/** Image entre deux image */
	private Image vide;
	/** Compteur permettant un d�lai entre deux images */
	private int cpt;
	/** Tableau contenant les diff�rents nom des images */
	private String[] name;
	/** Num�ro de la cin�matique en cours */
	private int current_nbr;
	/** Boolean permettant de savoir si l'image a �t� charg�. */
	private boolean isLoad;
	
	
	/**
	 * Constructeur permettant d'instancier la cin�matique
	 * 
	 * @param name tableau comportant le nom des diff�rentes images : cine-xxx.png
	 */
	public Cinematic(String[] name){
		this.name = name;
		this.current_nbr = 0;
		this.cpt = 0;
		try {
			vide = new Image("res/cinematic/vide.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Affiche la cin�matique en jeu
	 * 
	 * @param IDX IDx de la map
	 * @param IDY IDy de la map
	 * @param nbr Nombre d'images
	 * @param duration Dur�e entre deux images
	 */
	public void render(int IDX, int IDY, int nbr, int duration){
		if(Map.isMap(IDX, IDY)){
			if(current_nbr<=nbr){
				Event.cinematic = true;
				Player.setMoving(false);
				if(cpt<current_nbr*duration){
					cpt++;
					if(!isLoad){
						try {
							img = new Image("res/cinematic/cine-"+name[current_nbr-1]+".png");
						} catch (SlickException e) {
							e.printStackTrace();
						}
						isLoad = true;
					}
					if(img!=null)
						img.draw(0, 0);
				}
				else{
					current_nbr++;
					if(vide!=null)
						vide.draw(0, 0);
					isLoad = false;
				}
			}else{
				Event.cinematic = false;
				if(isLoad){
					try {
						if(img!=null)
							img.destroy();
						isLoad = false;
					} catch (SlickException e) {
						e.printStackTrace();
					}
				}
				Player.setMoving(true);
			}
		}
	}
	
}
