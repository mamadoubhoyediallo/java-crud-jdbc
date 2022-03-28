package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Etudiant;


public interface IEtudiant {
	public Etudiant save(Etudiant etudiant);
	public List<Etudiant> lister();
	public Etudiant modifier(Etudiant etudiant);
	public void delete(int id);
}
