package aplicacoes;

import java.util.List;
import java.util.Scanner;

import modelo.DAO.DaoFactory;
import modelo.DAO.DepartamentoDAO;
import modelo.entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartamentoDAO departamentoDao = DaoFactory.criarDepartamentoDao();

		System.out.println("=== TESTE 1: findById =======");
		Departamento dep = departamentoDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TESTE 2: findAll =======");
		List<Departamento> list = departamentoDao.findAll();
		for (Departamento d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TESTE 3: insert =======");
		Departamento newDepartamento = new Departamento(null, "Music");
		departamentoDao.insert(newDepartamento);
		System.out.println("Inserted! New id: " + newDepartamento.getId());

		System.out.println("\n=== TESTE 4: update =======");
		Departamento dep2 = departamentoDao.findById(1);
		dep2.setNome("Food");
		departamentoDao.update(dep2);
		System.out.println("Update completed");

		System.out.println("\n=== TESTE 5: delete =======");
		System.out.print("Digite um id para ser deletado: ");
		int id = sc.nextInt();
		departamentoDao.deleteById(id);
		System.out.println("Deleção completada");

		sc.close();

	}

}
