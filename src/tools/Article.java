package tools;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField; 


public class Article {

	private int ID;
	private static String Name;
	private static String DateFormat;
	private static String Type;
	private static String Fournisseur;

	
	public Article(int iD, String name, String dateFormat, String type, String fournisseur) {
		ID = iD;
		Name = name;
		DateFormat= dateFormat;
		Type = type;
		Fournisseur = fournisseur;
	}
	public Article() {
		super();
	
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public static String getName() {
		return Name;
	}
	public void setName(String txtName) {
		Name = txtName;
	}
	
	public static String getDateCreation() {
		return DateFormat;
	}

	public void setDateCreation(String dateFormat2) {
		DateFormat = dateFormat2;
	}

	public static String getType() {
		return Type;
	}
	public void setType(String txtType) {
		Type = txtType;
	}
	public static String getFournisseur() {
		return Fournisseur;
	}
	public void setFournisseur(String txtFourn) {
		Type = txtFourn;
	}
	
}

