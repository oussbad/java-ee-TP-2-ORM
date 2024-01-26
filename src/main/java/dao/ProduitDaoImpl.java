package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import metier.entities.Produit;

public class ProduitDaoImpl implements IProduitDao{

	@Override
	public Produit save(Produit p) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO PRODUIT (DESIGNATION,PRIX,QUANTITE) VALUES (?,?,?)");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
            ps.executeUpdate();
			ps.close();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID) AS MAXID FROM PRODUITS");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				p.setId(rs.getLong("MAX_ID"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return p;
	}

	@Override
	public List<Produit> produitsParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit update(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

}
