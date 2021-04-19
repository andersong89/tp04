package View;

import Model.Cliente;
import Model.Gastos;
import Model.Usuario;
import Model.Pessoa;

public class Main {

	public static void main(String [] args) {
		String nome = "Anderson";
		System.out.println(nome);
		
		Gastos Gastos = new Gastos(1, "presente", 100);
		System.out.println(Gastos.getDescricao());
		System.out.println(Gastos.getValor());
		
		Cliente cliente = new Cliente("piter", "ju@gmail.com", "8484", "11000");
		System.out.println(cliente.getNome());
		
		Usuario usuario = new Usuario("joao", "joaop@gmail.com", "1234", "alto");
		System.out.println(usuario.getNome());
	}
}
