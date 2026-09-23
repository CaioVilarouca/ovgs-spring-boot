package com.api.ovgs.entity;

import com.api.ovgs.domain.OrdemVendaStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="tb_ordemVenda")
public class OrdemVenda { // Ordem de venda

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime diaCreate;

    @Column(nullable = false)
    private LocalDateTime diaUpdate;

    @Column(nullable = false)
    private OrdemVendaStatus ordemVendaStatus;

    // --------------------------------
    @ManyToOne // Muitos para um
    @JoinColumn(name = "cliente_id") // coluna que será usada para realizar a associação entre as tabelas
    private Client client;

    @ManyToMany // Muitos para muitos
    private List<Item> item;

    @OneToOne // Um para um
    private Agendamento agendamento;

    @OneToOne
    private TipoTransporte tipoTransporte;

    public OrdemVenda() {}

    public OrdemVenda(Integer id, LocalDateTime diaCreate, LocalDateTime diaUpdate, OrdemVendaStatus ordemVendaStatus, Client client, List<Item> item, Agendamento agendamento, TipoTransporte tipoTransporte) {
        this.id = id;
        this.diaCreate = diaCreate;
        this.diaUpdate = diaUpdate;
        this.ordemVendaStatus = ordemVendaStatus;
        this.client = client;
        this.item = item;
        this.agendamento = agendamento;
        this.tipoTransporte = tipoTransporte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDiaCreate() {
        return diaCreate;
    }

    public void setDiaCreate(LocalDateTime diaCreate) {
        this.diaCreate = diaCreate;
    }

    public LocalDateTime getDiaUpdate() {
        return diaUpdate;
    }

    public void setDiaUpdate(LocalDateTime diaUpdate) {
        this.diaUpdate = diaUpdate;
    }

    public OrdemVendaStatus getOrdemVendaStatus() {
        return ordemVendaStatus;
    }

    public void setOrdemVendaStatus(OrdemVendaStatus ordemVendaStatus) {
        this.ordemVendaStatus = ordemVendaStatus;
    }

    public Client getCliente() {
        return client;
    }

    public void setCliente(Client client) {
        this.client = client;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
}
