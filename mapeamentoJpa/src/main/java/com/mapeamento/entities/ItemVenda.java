package com.mapeamento.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "itemVenda")
public class ItemVenda {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "quantidade", nullable = false, length = 255)
	private int quantidade;
	
	@Column(name = "valorUnitario", nullable = false, precision = 10, scale = 2)
	private double valorUnitario;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_produto", nullable = false)
	private Produto produto;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "id_venda", nullable = false)
	private Venda venda;
	
	
}
