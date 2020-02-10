package br.com.caelum.jdbc.teste;

//import java.awt.List;
import java.util.ArrayList;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO(null);
		
		ArrayList<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos)
		{
			System.out.println("Nome: " + contato.getNome());
	        System.out.println("Email: " + contato.getEmail());
	        System.out.println("Endereço: " + contato.getEndereco());
	        System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}

}
