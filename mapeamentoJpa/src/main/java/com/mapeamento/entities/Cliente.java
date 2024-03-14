package com.mapeamento.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "telefone", nullable = false, length = 255)
	private String telefone;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_venda", nullable = false)
	private Venda venda;
	
	
}
