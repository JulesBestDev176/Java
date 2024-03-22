package dao;

import java.lang.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DB {
    //Pour la connexion
    private Connection conn;
    //Pour les resultats des requetes de type SELECT
    private ResultSet rs;
    //Pour les requetes prepares;
    private PreparedStatement pstm;
    //Pour les resultats des requetes de mise à jour (INSERT INTO, UPDATE, DELETE)
    private int ok;
    public void getConnection() {
        //Parametres de connection
        String url = "jdbc:mysql://localhost:3306/etudiant_db_2024";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }


}
