/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.negocio;

import br.com.ifpe.salaojpa.model.entidades.Agenda;
import br.com.ifpe.salaojpa.model.implementacoes.RepositorioAgendaImpIDB;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceGenerico;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class NegocioAgenda implements InterfaceGenerico<Agenda>{
    
    private RepositorioAgendaImpIDB repAgenda;
    private Agenda age;

    public NegocioAgenda(){
        repAgenda = new RepositorioAgendaImpIDB();
    }
    
    @Override
    public void inserir(Agenda agenda) {
        if(((RepositorioAgendaImpIDB)repAgenda).recuperar(agenda.getId_agenda())==null){
            this.repAgenda.inserir(agenda);
        }
    }

    @Override
    public void alterar(Agenda agenda) {
        if(((RepositorioAgendaImpIDB)repAgenda).recuperar(agenda.getId_agenda())!=null){
            this.repAgenda.alterar(agenda);
        }
    }

    @Override
    public Agenda recuperar(Integer codigo) {
        if(codigo == null){
            return null;
        }else{
            age = repAgenda.recuperar(codigo);
            if(age == null){
                return null;
            }else{
                return age;
            }
        }
    }

    @Override
    public void deletar(Agenda agenda) {
        if(((RepositorioAgendaImpIDB)repAgenda).recuperar(agenda.getId_agenda())!=null){
            this.repAgenda.deletar(agenda);
        }
    }

    @Override
    public List<Agenda> recuperarTodos() {
        return ((RepositorioAgendaImpIDB)repAgenda).recuperarTodos();
    }
    
}
