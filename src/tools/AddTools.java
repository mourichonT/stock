package tools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import bdd.ConnexionBdd;

public class AddTools {
	static Connection accessDataBase = null;
	static ResultSet rs = null;
	static PreparedStatement queryAdd = null;

	static boolean executeOk = false;

	public static boolean addNewTool(Article tool) throws SQLException {

		try {

			accessDataBase = ConnexionBdd.openConnection();

			String requestAdd = "INSERT INTO `article` (name, brand, creation_date, type) VALUES(?,?,?,?)";
			queryAdd = accessDataBase.prepareStatement(requestAdd);
			queryAdd.setString(1, tool.getName());
			queryAdd.setString(2, tool.getFournisseur());
			queryAdd.setString(3, tool.getDateCreation());
			queryAdd.setString(4, tool.getType());

			executeOk = queryAdd.execute();

		} catch (SQLException ex) {
			Logger.getLogger(ConnexionBdd.class.getName()).log(Level.SEVERE, null, ex.getMessage());
		}
		return executeOk;

	}

	public static  ArrayList<Article> showListTool(){


		accessDataBase = ConnexionBdd.openConnection();
		
	
			ArrayList<Article> result = new ArrayList<>();
			
			String query =  "SELECT * FROM article";
			
			rs = (ResultSet) accessDataBase;
			try {
				
			      Statement stm = accessDataBase.createStatement();
			      ResultSet rs = stm.executeQuery(query);
				
				//queryAdd= accessDataBase.prepareStatement(query);
				
				
				//rs = queryAdd.executeQuery();
				 while (rs.next()){
					Article article = new Article();
							article.setID(rs.getInt("id")); 
							article.setName(rs.getString("name"));
							article.setFournisseur(rs.getString("brand"));
							article.setDateCreation(rs.getString("creation_date"));
							article.setType(rs.getString("type"));
						
					result.add(article);
				 }
				
			} catch (Exception e) {
				System.err.println("erreur dans la recupération de la requete");
			}
			System.out.println(result);
			return result;
		
	}

}
