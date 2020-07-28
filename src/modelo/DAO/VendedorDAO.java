package modelo.DAO;

import java.util.List;

import modelo.entidades.Vendedor;

public interface VendedorDAO {
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Integer id);
	Vendedor findById(Integer id);
	List<Vendedor> findAll();

}
