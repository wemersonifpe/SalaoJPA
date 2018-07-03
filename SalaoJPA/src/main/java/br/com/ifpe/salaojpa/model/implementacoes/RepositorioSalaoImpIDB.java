/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.dao.PersistenciaDao;
import br.com.ifpe.salaojpa.model.entidades.Salao;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceSalao;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class RepositorioSalaoImpIDB implements InterfaceSalao{
    
    @Override
    public Salao recuperarCNPJ(String cnpj) {
        List lista =  PersistenciaDao.getInstance().read("SELECT sa FROM Salao sa WHERE sa.cnpj=" + cnpj);
        if(!lista.isEmpty()){
            return (Salao) lista.get(0);
        }
            return null;
    }

    @Override
    public Salao login(String login, String senha) {
        return (Salao) PersistenciaDao.getInstance().autenticar("SELECT sa FROM Salao sa", login, senha);
    }

    @Override
    public void inserir(Salao e) {
        PersistenciaDao.getInstance().persist(e);
    }

    @Override
    public void alterar(Salao e) {
        PersistenciaDao.getInstance().update(e);
    }

    @Override
    public Salao recuperar(Integer codigo) {
        List lista = PersistenciaDao.getInstance().read("SELECT sa FROM Salao sa WHERE sa.id_salao=" + codigo);
        if(!lista.isEmpty()){
            return (Salao) lista.get(0);
        }
            return null;
    }

    @Override
    public void deletar(Salao e) {
        PersistenciaDao.getInstance().delete(e);
    }

    @Override
    public List<Salao> recuperarTodos() {
        return PersistenciaDao.getInstance().read("SELECT sa FROM Salao sa");
    }
    
}
