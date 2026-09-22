package com.api.ovgs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_itemOrdemVenda")
public class ItemOrdemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    public ItemOrdemVenda() {}

    public ItemOrdemVenda(Integer id, Integer quantidade, Double preco, Item item) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco = preco;
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /* Sub Total
    public double subTotal() {
        return preco * quantidade;
    }*/
}
