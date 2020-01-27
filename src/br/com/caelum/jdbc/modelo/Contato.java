package br.com.caelum.jdbc.modelo;

// import java.sql.Connection;

// import java.sql.PreparedStatement;

import java.util.Calendar;

// import br.com.caelum.jdbc.ConnectionFactory;

// import java.sql.SQLException;

public class Contato {

	private Long id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
    private String email;
    
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    private String endereco;
    
    public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    
    private Calendar dataNascimento;
    
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
