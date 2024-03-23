package entity;

public class Etudiant {
    public final int MAX_NOTE = 10;
    private String nom, prenom;
    private int anneeNaissance;
    private double[] notes;
    private int nbNotes;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.notes = new double[MAX_NOTE];
        this.nbNotes = 0;
    }

    public Etudiant(String nom, String prenom, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.notes = new double[MAX_NOTE];
        this.nbNotes = 0;
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

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }
    public double moyenne() {
        double somme = 0;
        for(int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }

        return somme / nbNotes;
    }

    public double max(){
        double max = notes[0];
        for(int i = 1; i < nbNotes; i++) {
            if(notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }

    public double min(){
        double min = notes[0];
        for(int i = 1; i < nbNotes; i++) {
            if(notes[i] < min) {
                min = notes[i];
            }
        }
        return min;
    }

    public void ajouterNote(double note) {
        if(nbNotes < MAX_NOTE) {
            notes[nbNotes] = note;
            nbNotes++;
        }else{
            System.out.println("Le tableau de note est plein !");
        }
    }
}
