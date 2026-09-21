package com.api.ovgs.entity;

import com.api.ovgs.domain.StatusSellOrder;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="tb_sellOrder")
public class SellOrder { // Ordem de venda

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dayCreate;

    @Column(nullable = false)
    private LocalDateTime dayUpdate;

    @Column(nullable = false)
    private StatusSellOrder statusSellOrder;

    // --------------------------------
    @ManyToOne // Muitos para um
    @JoinColumn(name = "cliente_id") // coluna que será usada para realizar a associação entre as tabelas
    private Cliente cliente;

    @ManyToMany // Muitos para muitos
    private List<Item> item;

    @OneToOne // Um para um
    private Agendamento scheduling;

    @OneToOne
    private  TypeTransport typeTransport;

    public SellOrder() {}

    public SellOrder(Integer id, LocalDateTime dayCreate, LocalDateTime dayUpdate, StatusSellOrder statusSellOrder, Cliente cliente, List<Item> item, Agendamento scheduling, TypeTransport typeTransport) {
        this.id = id;
        this.dayCreate = dayCreate;
        this.dayUpdate = dayUpdate;
        this.statusSellOrder = statusSellOrder;
        this.cliente = cliente;
        this.item = item;
        this.scheduling = scheduling;
        this.typeTransport = typeTransport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDayCreate() {
        return dayCreate;
    }

    public void setDayCreate(LocalDateTime dayCreate) {
        this.dayCreate = dayCreate;
    }

    public LocalDateTime getDayUpdate() {
        return dayUpdate;
    }

    public void setDayUpdate(LocalDateTime dayUpdate) {
        this.dayUpdate = dayUpdate;
    }

    public StatusSellOrder getStatusSellOrder() {
        return statusSellOrder;
    }

    public void setStatusSellOrder(StatusSellOrder statusSellOrder) {
        this.statusSellOrder = statusSellOrder;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Agendamento getScheduling() {
        return scheduling;
    }

    public void setScheduling(Agendamento scheduling) {
        this.scheduling = scheduling;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }
}
