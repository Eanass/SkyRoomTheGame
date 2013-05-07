package npc;

import java.io.FileNotFoundException;

import org.newdawn.slick.util.ResourceLoader;

import player.Player;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/** 
 * R�cup�re un dialogue dans un fichier XML
 * 
 * @author R�my
 *
 */

public class NPCDialog {
	
	/** Dialogue r�cup�r� */
	private String dialog;

	/**=
	 * R�cup�re le dialogue associ� � l'ID
	 * 
	 * @param ID Num�ro du dialogue
	 * @throws FileNotFoundException
	 */
	public void NPCDialoge(int ID) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		@SuppressWarnings("unused")
		NPCDialogList list = new NPCDialogList();
		xstream.alias("NPC", NPCDialogData.class);
	    xstream.alias("NPCData", NPCDialogList.class);
	    xstream.addImplicitCollection(NPCDialogList.class, "list");
	
	    // A garder pour savoir comment cr�er le XML
	    /*File fichier = new File("c:/TEMP/NPCDialogTest2.xml");
		FileOutputStream fos = new FileOutputStream(fichier);
		 list.add(new NPCDialogData("ABC","DEF"));
	    list.add(new NPCDialogData("XYZ","DJDJ"));
	    xstream.toXML(list,fos);*/	        
        if(Player.getSex().equals("boy")){
        	NPCDialogList npclist = (NPCDialogList) xstream.fromXML(NPCDialog.class.getResourceAsStream("NPCDialogData.xml")); // Rajouter une / lors de l'export en JAR
			dialog = npclist.getDialogFromID(ID).getDialog();
        }
        else{
        	NPCDialogList npclist = (NPCDialogList) xstream.fromXML(NPCDialog.class.getResourceAsStream("NPCDialogDataGirl.xml")); // Rajouter une / lors de l'export en JAR
			dialog = npclist.getDialogFromID(ID).getDialog();
        }
	
	
	}
	
	/**
	 * @return dialog Le dialogue voulu
	 */
	public String getDialog(){
		return dialog;
	}
}



