package modelo.DAO;

import db.DB;
import modelo.DAO.impl.VendedorDaoJDBC;

public class DaoFactory {

	public static VendedorDAO criarVendedorDAO() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
}
