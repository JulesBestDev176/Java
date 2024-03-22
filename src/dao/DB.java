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
    private void getConnection() {
        //Parametres de connection
        String url = "jdbc:mysql://localhost:3306/etudiant_db_2024";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void initPrepar (String sql) {
        try{
            getConnection();
            pstm = conn.prepareStatement(sql);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeSelect() {
        rs = null;
        try{
            rs = pstm.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    public int executeMaj(){
        try {
            ok = pstm.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return ok;
    }

    public void closeConnection() {
        try{
            if(conn != null) {
                conn.close();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public PreparedStatement getPstm() {
        return pstm;
    }
}
