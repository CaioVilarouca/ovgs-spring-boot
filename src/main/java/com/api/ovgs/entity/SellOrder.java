package com.api.ovgs.entity;

import com.api.ovgs.domain.SellOrderStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="tb_ordemVenda")
public class SellOrder { // Ordem de venda

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dayCreate;

    @Column(nullable = false)
    private LocalDateTime dayUpdate;

    @Column(nullable = false)
    private SellOrderStatus sellOrderStatus;

    // --------------------------------
    @ManyToOne // Muitos para um
    @JoinColumn(name = "cliente_id") // coluna que será usada para realizar a associação entre as tabelas
    private Client client;

    @ManyToMany // Muitos para muitos
    private List<Item> item;

    @OneToOne // Um para um
    private Scheduling scheduling;

    @OneToOne
    private TypeTransport typeTransport;

    public SellOrder() {}

    public SellOrder(TypeTransport typeTransport, Scheduling scheduling, List<Item> item, Client client, SellOrderStatus sellOrderStatus, LocalDateTime dayUpdate, LocalDateTime dayCreate, Integer id) {
        this.typeTransport = typeTransport;
        this.scheduling = scheduling;
        this.item = item;
        this.client = client;
        this.sellOrderStatus = sellOrderStatus;
        this.dayUpdate = dayUpdate;
        this.dayCreate = dayCreate;
        this.id = id;
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

    public SellOrderStatus getSellOrderStatus() {
        return sellOrderStatus;
    }

    public void setSellOrderStatus(SellOrderStatus sellOrderStatus) {
        this.sellOrderStatus = sellOrderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Scheduling getScheduling() {
        return scheduling;
    }

    public void setScheduling(Scheduling scheduling) {
        this.scheduling = scheduling;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }
}
