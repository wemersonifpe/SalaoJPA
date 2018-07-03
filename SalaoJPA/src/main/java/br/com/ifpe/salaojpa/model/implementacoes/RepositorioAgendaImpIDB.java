/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.dao.PersistenciaDao;
import br.com.ifpe.salaojpa.model.entidades.Agenda;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceGenerico;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class RepositorioAgendaImpIDB implements InterfaceGenerico<Agenda>{
    
    @Override
    public void inserir(Agenda e) {
        PersistenciaDao.getInstance().persist(e);
    }

    @Override
    public void alterar(Agenda e) {
        PersistenciaDao.getInstance().update(e);
    }

    @Override
    public Agenda recuperar(Integer codigo) {
        List lista = PersistenciaDao.getInstance().read("SELECT a FROM Agenda a WHERE a.id_agenda=" + codigo);
        if(!lista.isEmpty()){
            return (Agenda) lista.get(0);
        }
            return null;
    }
    @Override
    public void deletar(Agenda e) {
        PersistenciaDao.getInstance().delete(e);
    }

    @Override
    public List<Agenda> recuperarTodos() {
        return PersistenciaDao.getInstance().read("SELECT a FROM Agenda a");
    }
    
}
