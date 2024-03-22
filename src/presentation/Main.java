package presentation;

import dao.DB;
import dao.EtudiantImpl;
import dao.IEtudiant;
import entity.Etudiant;

import java.util.Date;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEtudiant iEtudiant = new EtudiantImpl();
        Etudiant e = new Etudiant();
        e.setNom("Fall");
        e.setPrenom("Souleymane");
        e.setMatricule(e.generateMatricule());
        e.setDateNaissance(new Date());
        e.setMoyenne(18.2);
        int ok = iEtudiant.create(e);

        if(ok == 1) {
            System.out.println("Etudiant cree avec succes");
        }else {
            System.out.println("Insertion echoue");

        }
    }
}