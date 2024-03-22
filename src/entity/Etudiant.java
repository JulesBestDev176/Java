package entity;

import java.util.Date;

public class Etudiant {
    private int id;
    private String matricule, nom, prenom;
    private Date dateNaissance;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(int id, String matricule, String nom, String prenom, Date dateNaissance, double moyenne) {
        this.id = id;
        this.matricule = generateMatricule();
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.moyenne = moyenne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public String generateMatricule() {
        String mat;
        int size = nom.length() + prenom.length();
        char n = nom.charAt(0);
        char p = prenom.charAt(0);
        mat = "ET@" + n + p + size;
        return mat;
    }
}
