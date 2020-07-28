package modelo.DAO;

import modelo.DAO.impl.VendedorDaoJDBC;

public class DaoFactory {

	public static VendedorDAO criarVendedorDAO() {
		return new VendedorDaoJDBC();
	}
}
