package Test;

import java.util.List;

import sn.isi.dao.EtudiantImpl;
import sn.isi.entities.Etudiant;

public class Test {

	public static void main(String[] args) {
		//test for save method 
		EtudiantImpl dao = new EtudiantImpl();
		/*String nom = "Kebe";
		String prenom = "Mortalla";
		String adresse = "Belingara";
		String matricule = "et06";
		Etudiant etudiant = new Etudiant(nom, prenom, adresse, matricule);
		try {
			dao.save(etudiant);
			System.out.println("Enregistrement effectuer");
		} catch (Exception e) {
			System.out.println("Enregistrement non effectuer");
		}*/
		//dao.save(etudiant);
		
		//test for list method 
		
		/*List<Etudiant> le = dao.lister();
		try {
			for(Etudiant etudiant : le) {
				System.out.println(etudiant.getIdEtudiant()+" "+etudiant.getNom()+" "+etudiant.getPrenom()+" "+etudiant.getAdresse()+" "+etudiant.getMatricule()); 
			}
		} catch (Exception e) {
			System.out.println("Liste non chargee");
		}*/
		
		//test for delete method 
		
		/*try {
			dao.delete(4);
			System.out.println("Enregistrement supprimer");
		} catch (Exception e) {
			System.out.println("Enregistrement non supprimer");
		}*/
		
		//test for update method 
		
		/*String nom = "Seck";
		String prenom = "Ngor";
		String adresse = "Djourbel";
		String matricule = "et02";
		Etudiant etudiant = new Etudiant(nom, prenom, adresse, matricule);
		try {
			dao.modifier(etudiant);
			System.out.println("Modification effectuer");
		} catch (Exception e) {
			System.out.println("Modification non effectuer");
		}*/
		
	}

}
