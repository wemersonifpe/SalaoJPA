/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.controller;

import br.com.ifpe.salaojpa.model.entidades.Agenda;
import br.com.ifpe.salaojpa.model.negocio.NegocioAgenda;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wemerson
 */
@ManagedBean
@SessionScoped
public class AgendaController {
    
    private NegocioAgenda agendaNegocio;
    private Agenda agena;
    
    public AgendaController(){
        this.agendaNegocio = new NegocioAgenda();
        this.agena = new Agenda();
    }
    
    public void cadastrar(){
        this.agendaNegocio.inserir(agena);
        this.agena = new Agenda();
    }
    
    public Agenda recuperar(Integer codigo){
        return this.agendaNegocio.recuperar(codigo);
    }
    
    public String alterar(Agenda agenda){
        this.agendaNegocio.alterar(agenda);
        return "";
    }
    
    public void deletar(Agenda agenda){
        this.agendaNegocio.deletar(agenda);
    }
    
    public List<Agenda> recuperarTodos(){
        return this.agendaNegocio.recuperarTodos();
    }

    public NegocioAgenda getAgendaNegocio() {
        return agendaNegocio;
    }

    public void setAgendaNegocio(NegocioAgenda agendaNegocio) {
        this.agendaNegocio = agendaNegocio;
    }

    public Agenda getAgena() {
        return agena;
    }

    public void setAgena(Agenda agena) {
        this.agena = agena;
    }
    
}
