package com.api.ovgs.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Key primary
	@JoinColumn(name ="id")
	private Integer id;
	
	@Column(nullable = false, length = 150) // o campo é obrigatório; no banco, ele não pode ser NULL
	private String nome;
	
	@Column(nullable = false, unique = true, length = 20) // unique = true: não pode haver dois registros com o mesmo documento
	private String documento;
	
    @Column(length = 150) // a coluna terá o max 150 caracteres
	private String email;
    
    @Column(nullable = false) 
	private boolean ativo;
    
    public Cliente() {}

	public Cliente(Integer id, String nome, String documento, String email, boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.email = email;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
