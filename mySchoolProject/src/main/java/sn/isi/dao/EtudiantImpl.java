package sn.isi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sn.isi.entities.Etudiant;

public class EtudiantImpl implements IEtudiant {
	Connection con = Db.getConnection();

	@Override
	public Etudiant save(Etudiant etudiant) {
		String sql = "INSERT INTO etudiant VALUES(NULL, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, etudiant.getNom());
			ps.setString(2, etudiant.getPrenom());
			ps.setString(3, etudiant.getAdresse());
			ps.setString(4, etudiant.getMatricule());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiant;
	}

	@Override
	public List<Etudiant> lister() {
		String sql = "SELECT * FROM etudiant";
		List<Etudiant> liste = new ArrayList<Etudiant>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Etudiant e = new Etudiant();
				e.setIdEtudiant(rs.getInt(1));
				e.setNom(rs.getString(2));
				e.setPrenom(rs.getString(3));
				e.setAdresse(rs.getString(4));
				e.setMatricule(rs.getString(5));
				liste.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return liste;
	}

	@Override
	public Etudiant modifier(Etudiant etudiant) {
		String sql = "UPDATE etudiant SET nom = ?, prenom = ?, adresse = ?, matricule = ? WHERE matricule = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, etudiant.getNom());
			ps.setString(2, etudiant.getPrenom());
			ps.setString(3, etudiant.getAdresse());
			ps.setString(4, etudiant.getMatricule());
			ps.setString(5, etudiant.getMatricule());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiant;
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM etudiant WHERE idEtudiant = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
