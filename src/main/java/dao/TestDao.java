package dao;

import metier.entities.Produit;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProduitDaoImpl dao=new ProduitDaoImpl();
		Produit p1=dao.save(new Produit("hp 6580",900,45));
		Produit p2=dao.save(new Produit("hp 6580",900,45));
		Produit p3=dao.save(new Produit("hp 6580",900,45));


		

	}

}
