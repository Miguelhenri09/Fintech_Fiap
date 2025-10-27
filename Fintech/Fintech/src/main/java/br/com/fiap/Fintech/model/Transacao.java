package br.com.fiap.Fintech.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_transacao")
public class Transacao {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_TRANSACAO"
    )
    @SequenceGenerator(
            name = "SEQ_TRANSACAO",
            sequenceName = "SEQ_TRANSACAO",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "titulo_transacao", length = 50, nullable = false)
    private String tituloTransacao;
    private double valor;

    @Column(name = "data_transacao")
    private LocalDate dataTransacao;

    @Column(name = "tipo_transacao")
    private String tipoTransacao;

    public String getTituloTransacao() {
        return tituloTransacao;
    }

    public void setTituloTransacao(String tituloTransacao) {
        this.tituloTransacao = tituloTransacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
}
