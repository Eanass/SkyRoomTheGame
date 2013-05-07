package npc;

/**
 * Permet de g�rer la r�cup�ration du dialogue
 * 
 * @author R�my
 *
 */

public class NPCDialogData {
	
	/** ID du dialogue */
	public int ID;
	/** Dialog du NPC */
	public String dialog;
	
	/**
	 * Permet de donn�e les param�tres
	 * 
	 * @param ID Num�ro du dialogue
	 * @param dialog Dialogue
	 */
	public NPCDialogData(int ID, String dialog){
		this.ID = ID;
		this.dialog = dialog;
	}
	
	/**
	 * @return dialog Dialogue
	 */
	public String getDialog(){
		return dialog;
	}
	
	/**
	 * @return ID  Num�ro du dialogue
	 */
	public int getID(){
		return ID;
	}
	
	/**
	 * Red�finition de la m�thode toString afin de debugger
	 */
	public String toString()
	{
		return "ID : " +Integer.toString(ID)+ " Dialog : " + dialog + "\n";
	}
}

