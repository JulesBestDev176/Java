package dao;

import entity.Etudiant;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

public class EtudiantImpl implements IEtudiant {
    private DB db = new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int create(Etudiant e) {
        String sql = "INSERT INTO etudiant VALUES(null, ?, ?, ?, ?, ?)";
        try{
            db.initPrepar(sql);
            //Passage de valeurs
            db.getPstm().setString(1, e.getNom());
            db.getPstm().setString(2, e.getPrenom());
            db.getPstm().setString(3, e.getMatricule());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            db.getPstm().setString(4, sdf.format(e.getDateNaissance()));
            db.getPstm().setDouble(5, e.getMoyenne());
            ok = db.executeMaj();
            db.closeConnection();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Etudiant> list() {
        return null;
    }

    @Override
    public Etudiant get(int id) {
        return null;
    }

    @Override
    public int update(Etudiant e) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
