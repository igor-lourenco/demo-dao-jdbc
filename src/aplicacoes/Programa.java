package aplicacoes;

import java.util.List;

import modelo.DAO.DaoFactory;
import modelo.DAO.VendedorDAO;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDAO vendedorDao = DaoFactory.criarVendedorDAO();

		System.out.println("=== TESTE 1: Vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);

		System.out.println("\n=== TESTE 2: Vendedor findByDepartment ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> lista = vendedorDao.findByDepartamento(departamento);
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}

		System.out.println("\n=== TESTE 3: Vendedor findAll ===");

		lista = vendedorDao.findAll();
		for (Vendedor obj : lista) {
			System.out.println(obj);
		}
	}

}
