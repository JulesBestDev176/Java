package dao;

import entity.Etudiant;

import java.util.List;

public interface IEtudiant {
    public int create(Etudiant e);
    public List<Etudiant> list();
    public Etudiant get(int id);
    public int update(Etudiant e);
    public int delete(int id);
}
