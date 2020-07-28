package aplicacoes;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {

		
		VendedorDAO vendedorDao = DaoFactory.criarVendedorDAO();
		
		Vendedor vendedor = vendedorDao.findById(3);
		
		System.out.println(vendedor);
	}

}
