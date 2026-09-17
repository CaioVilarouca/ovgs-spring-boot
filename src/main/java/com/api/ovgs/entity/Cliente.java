package com.api.ovgs.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="tb_client")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Key primary
	@JoinColumn(name ="id")
	private Integer id;
	
	@Column(nullable = false, length = 150) // o campo é obrigatório; no banco, ele não pode ser NULL
	private String name;
	
	@Column(nullable = false, unique = true, length = 20) // unique = true: não pode haver dois registros com o mesmo documento
	private String document;
	
    @Column(length = 150) // a coluna terá o max 150 caracteres
	private String email;
    
    @Column(nullable = false) 
	private boolean active;
    
    public Cliente() {}

	public Cliente(Integer id, String name, String document, String email, boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.document = document;
		this.email = email;
		this.active = active;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
