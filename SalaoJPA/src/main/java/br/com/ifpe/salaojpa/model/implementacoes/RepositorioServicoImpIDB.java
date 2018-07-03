/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.dao.PersistenciaDao;
import br.com.ifpe.salaojpa.model.entidades.Servico;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceGenerico;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class RepositorioServicoImpIDB implements InterfaceGenerico<Servico>{
    
    @Override
    public void inserir(Servico e) {
        PersistenciaDao.getInstance().persist(e);
    }

    @Override
    public void alterar(Servico e) {
        PersistenciaDao.getInstance().update(e);
    }

    @Override
    public Servico recuperar(Integer codigo) {
        List lista = PersistenciaDao.getInstance().read("SELECT s FROM Servico s WHERE s.id_servico=" + codigo);
        if(!lista.isEmpty()){
            return (Servico) lista.get(0);
        }
            return null;
    }

    @Override
    public void deletar(Servico e) {
        PersistenciaDao.getInstance().delete(e);
    }

    @Override
    public List<Servico> recuperarTodos() {
        return PersistenciaDao.getInstance().read("SELECT s.nome FROM Servico s");
    }
    
    
}
