/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.negocio;

import br.com.ifpe.salaojpa.model.entidades.Usuario;
import br.com.ifpe.salaojpa.model.implementacoes.RepositorioUsuarioImpIDB;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceUsuario;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class NegocioUsuario implements InterfaceUsuario{
    
    private RepositorioUsuarioImpIDB repUsuario;
    private Usuario usu;
    
    public NegocioUsuario(){
        repUsuario = new RepositorioUsuarioImpIDB();
    }

    @Override
    public Usuario recuperarCPF(String cpf) {
        if (cpf == null) {
            return null;
        } else {
            usu = repUsuario.recuperarCPF(cpf);
            if (usu == null) {
                return null;
            } else {
                return usu;
            }
        }
    }
    
    @Override
    public void inserir(Usuario usuario) {
        if(((RepositorioUsuarioImpIDB)repUsuario).recuperar(usuario.getId_usuario())==null){
            this.repUsuario.inserir(usuario);
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        if(((RepositorioUsuarioImpIDB)repUsuario).recuperar(usuario.getId_usuario())!=null){
            this.repUsuario.alterar(usuario);
        }
    }

    @Override
    public Usuario recuperar(Integer codigo) {
        if(codigo == null){
            return null;
        }else{
            usu = repUsuario.recuperar(codigo);
            if(usu == null){
                return null;
            }else{
                return usu;
            }
        }
        //return ((RepositorioUsuarioImpIDB)repUsuario).recuperar(codigo);
    }

    @Override
    public void deletar(Usuario usuario) {
        if(((RepositorioUsuarioImpIDB)repUsuario).recuperar(usuario.getId_usuario())!=null){
            this.repUsuario.deletar(usuario);
        }
    }

    @Override
    public List<Usuario> recuperarTodos() {
         return ((RepositorioUsuarioImpIDB)repUsuario).recuperarTodos();
    }
    
    @Override
    public Usuario login1(String login, String senha) {
        if(login == null || senha == null){
            return null;
        }
        return ((RepositorioUsuarioImpIDB)repUsuario).login1(login, senha);
    }
    
    @Override
    public boolean login(String login, String senha) {
         if(login == null || senha == null){
            return false;
        }
        return ((RepositorioUsuarioImpIDB)repUsuario).login(login, senha);
    }
}
