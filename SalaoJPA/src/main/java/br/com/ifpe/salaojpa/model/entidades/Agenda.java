/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author wemerson
 */
@Entity
public class Agenda implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_agenda;
    @ManyToOne
    @JoinColumn(name = "cod_usuario", referencedColumnName = "id_usuario", nullable = false)
    private Usuario usuarios;
    @ManyToOne
    @JoinColumn(name = "cod_servico", referencedColumnName = "id_servico", nullable = false)
    private Servico servico;
    @Column(name = "data_marcada")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @Column(name = "horario")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horario;

    public Agenda() {
    }

    public Agenda(Usuario usuarios, Servico servico, Date data, Date horario) {
        this.usuarios = usuarios;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id_agenda;
        hash = 47 * hash + Objects.hashCode(this.usuarios);
        hash = 47 * hash + Objects.hashCode(this.servico);
        hash = 47 * hash + Objects.hashCode(this.data);
        hash = 47 * hash + Objects.hashCode(this.horario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        if (this.id_agenda != other.id_agenda) {
            return false;
        }
        if (!Objects.equals(this.usuarios, other.usuarios)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id_agenda=" + id_agenda + ", usuarios=" + usuarios + ", servico=" + servico + ", data=" + data + ", horario=" + horario + '}';
    }
    
    
}
