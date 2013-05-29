package event;

import game.DifficultySelector;

/**
 * Classe contenant les �v�nements permettant de g�rer les diff�rentes classes
 * du jeu
 * 
 * @author R�my
 * 
 */

public class Event {

	/** Event relatif au Menu-Jeu */
	public static boolean STARTED;
	/** Event relatif aux NPCFollower */
	public static int EVENT = 0;
	/** Event pour le spartiate dans la pr�histoire */
	public static int NPC_event;
	/** Portail du monde futur */
	public static boolean futur_gate;
	/** Event relatif au spartiate du futur */
	public static boolean spartiateFuturEvent;
	/** True si le joueur a �t� touch� */
	public static boolean colision;
	/** True si le joueur a l'�p�e */
	public static boolean SWORD;
	/** True si le joueur a le pistolet � eau */
	public static boolean WaterGun;
	/** True si le joueur a le blaster *ind�finie* */
	public static boolean blaster;
	/** Blaster de stormtrooper */
	public static boolean blasterStorm;
	public static boolean bo;
	/** True si un cin�matique est en cours */
	public static boolean cinematic;
	/** True si on a choisie le h�ro fille */
	public static boolean girl_cine;
	/** Costume de stormtrooper complet */
	public static boolean costume;
	/** Bikini en cotte de maille */
	public static boolean bikini;
	/** Costume de stormtrooper partiel */
	public static boolean costume_partiel;
	/** Permet de savoir si le joueur est ralenti par le WhiteAncient */
	public static boolean slowAncient;
	/** True si le spartiate nous suit */
	public static boolean spartanSpace;
	/** True on est dans le vaisseau */
	public static boolean spaceShip;
	/** True si on peut aller prendre le vaisseau spatial */
	public static boolean spaceKey;
	/** True si on r�cup�r� la torche du monde UHA */
	public static boolean torch;
	/** Volume du jeu */
	public static float volume = 1f;
	/** Permet de savoir si on a la colombe ou non */
	public static boolean isDove;
	/** Event du perso de halo dans le monde futur */
	public static int halo;
	/** Explosion de la porte du boss du futur */
	public static boolean boss_futur_explosion;
	/** True si on a r�cup�r� le verre d'eau du punk */
	public static boolean water;
	/** Nombre maximum de vie */
	public static int maxHeart = 5;
	/** Permet de savoir si on est pass� dans la cave de MJ */
	public static boolean MJ;
	/** True si on affiche la lettre de la blonde de l'enscmu */
	public static boolean renderLetter;
	/** True si l'enscmu girl peut nous suivre */
	public static boolean enscmuReady;
	/** True si on peut se rendre dans l'enscmu */
	public static boolean yesRU;
	/** True si on peut se rendre dans Werner */
	public static boolean notRU;
	/** True si on peut quitter le niveau par le tram */
	public static boolean tram;
	/** True si on a parler aux eleves de Werner */
	public static boolean wernerGirlOrBoy;
	/** True si on a r�cup�r� la cape et la capuche dans le coffre de Werner */
	public static boolean wood;
	/** True si on a pas encore l'�p�e et qu'il faut aller la chercher */
	public static boolean notSword;
	/** True si on peut se rendre pret de la fontaine *Rennaissance* */
	public static boolean fontaine;
	/** True si on peut commencer la quete de l'eau */
	public static boolean waterQuete;
	/** True si on a r�cup�r� de l'eau du lac */
	public static boolean waterRennaissance;
	/** True si on a purifi� l'eau */
	public static boolean purification;
	/** True si on peut commencer la quete des champignon */
	public static boolean champiQuete;
	/** True si on a r�cup�r� le premier champi */
	public static boolean champi1;
	/** True si on a r�cup�r� le second champi */
	public static boolean champi2;
	/** True si on a r�cup�r� le troisi�me champi */
	public static boolean champi3;
	/** True si on peut commencer la qu�te des amoureux */
	public static boolean loveQuete;
	/** True si on a la lettre pour la fille */
	public static boolean loverQuete;
	/** True si on a fini la quete des amoureux */
	public static boolean finish_loveQuete;
	/** Cinematique de spartaland */
	public static boolean spartaland_cine;
	/** Cinematique du monde bonus */
	public static boolean bonus_cine;
	/** True si on peux sauvegarder */
	public static boolean save;
	/** True lorsque qu'on veut recharger le jeu completement */
	public static boolean fin;
	/** True si on veut refaire la save */
	public static boolean makeReload;
	/** Credit du jeu */
	public static boolean credit;
	public static boolean remy, stan, alex, loic, amael;
	public static boolean boss_chinois;
	public static int special_item_bonus;
	public static boolean specialItemBonus;
	public static boolean haveSpecialBonus;
	public static boolean goSkyRoom;

	public static boolean fadeTransition;

	public static int time;
	public static boolean haveNoSave;
	public static boolean bossRennaissance;

	public static boolean cine_dark;
	public static boolean cine_prehistoire;
	public static boolean cine_stormtrooper;
	public static boolean cine_bonus;
	public static boolean cine_futur;
	public static boolean cine_chinois;
	public static boolean cine_renaissance;
	public static boolean cine_skyroom;
	public static boolean cine_spartaland;
	
	public static boolean dialog_dove;
	public static boolean doveOnPlayer;
	
	public static boolean notMove;
	public static boolean helpScreen;

	/**
	 * Initialisation de tout les boolean
	 */
	public static void initialize() {
		NPC_event = 0;
		EVENT = 0;
		colision = false;
		SWORD = false;
		WaterGun = false;
		futur_gate = false;
		cinematic = false;
		girl_cine = false;
		costume = false;
		fin = false;
		futur_gate = false;
		spartiateFuturEvent = false;
		blaster = false;
		blasterStorm = false;
		bikini = false;
		costume_partiel = false;
		spartanSpace = false;
		spaceShip = false;
		torch = false;
		isDove = false;
		boss_futur_explosion = false;
		water = false;
		MJ = false;
		renderLetter = false;
		enscmuReady = false;
		yesRU = false;
		notRU = false;
		tram = false;
		wernerGirlOrBoy = false;
		wood = false;
		notSword = false;
		makeReload = false;
		spaceKey = false;
		spartaland_cine = false;
		bonus_cine = false;
		save = false;
		credit = false;
		bo = false;
		boss_chinois = false;
		remy = false;
		stan = false;
		alex = false;
		loic = false;
		amael = false;
		special_item_bonus = 0;
		specialItemBonus = false;
		slowAncient = false;
		if(DifficultySelector.EASY)
			maxHeart = 6;
		else if(DifficultySelector.MEDIUM)
			maxHeart = 5;
		else if(DifficultySelector.HARD)
			maxHeart = 4;
		else if(DifficultySelector.GOD)
			maxHeart = 5;
		fontaine = false;
		waterQuete = false;
		waterRennaissance = false;
		purification = false;
		champiQuete = false;
		champi1 = false;
		champi2 = false;
		champi3 = false;
		loveQuete = false;
		loverQuete = false;
		finish_loveQuete = false;
		spartaland_cine = false;
		bonus_cine = false;
		boss_chinois = false;
		haveSpecialBonus = false;
		goSkyRoom = false;
		halo = 0;
		haveNoSave = false;
		bossRennaissance = false;
		cine_dark = false;
		cine_prehistoire = false;
		cine_stormtrooper = false;
		cine_bonus = false;
		cine_futur = false;
		cine_chinois = false;
		cine_renaissance = false;
		cine_skyroom = false;
		cine_spartaland = false;
		dialog_dove = false;
		doveOnPlayer = false;
		helpScreen = false;
	}

}
