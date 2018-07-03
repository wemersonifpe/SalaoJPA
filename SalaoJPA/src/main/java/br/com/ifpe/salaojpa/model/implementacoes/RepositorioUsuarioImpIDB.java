/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.dao.PersistenciaDao;
import br.com.ifpe.salaojpa.model.entidades.Usuario;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceUsuario;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class RepositorioUsuarioImpIDB implements InterfaceUsuario{

    @Override
    public void inserir(Usuario e) {
        PersistenciaDao.getInstance().persist(e);
    }

    @Override
    public void alterar(Usuario e) {
        PersistenciaDao.getInstance().update(e);
    }

    @Override
    public Usuario recuperar(Integer codigo) {
       List lista = PersistenciaDao.getInstance().read("SELECT u FROM Usuario u WHERE u.id_usuario=" + codigo);
        if(!lista.isEmpty()){
            return (Usuario) lista.get(0);
        }
            return null;
    }

    @Override
    public void deletar(Usuario e) {
        PersistenciaDao.getInstance().delete(e);
    }

    @Override
    public List<Usuario> recuperarTodos() {
        return PersistenciaDao.getInstance().read("SELECT usuarios FROM Usuario usuarios");
    }

    @Override
    public Usuario recuperarCPF(String cpf) {
        List lista =  PersistenciaDao.getInstance().read("SELECT c FROM Usuario c WHERE c.cpf=" + cpf);
        if(!lista.isEmpty()){
            return (Usuario) lista.get(0);
        }
            return null;
    }
    
    @Override
    public Usuario login1(String login, String senha) {
       List lista = PersistenciaDao.getInstance().read("Select u From Usuario u Where u.login='"+login+"' And u.senha='"+senha+"'");
       if(!lista.isEmpty()){
           return (Usuario) lista;
       }
       return null;
    }
    /*@Override
    public Usuario login1(String login, String senha) {
       return (Usuario) PersistenciaDao.getInstance().autenticar("SELECT a FROM Usuario a", login, senha);
    }*/
    
    @Override
    public boolean login(String login, String senha) {
       List<Usuario> usuarios = this.recuperarTodos();
        
        for(Usuario usu : usuarios){
            if(usu.getLogin().equals(login)){
                if(usu.getSenha().equals(senha)){
                    return true;
                }
            }
        }
        return false;
    }
    
}
