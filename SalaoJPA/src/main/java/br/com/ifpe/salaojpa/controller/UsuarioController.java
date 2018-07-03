/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.controller;

import br.com.ifpe.salaojpa.model.entidades.Usuario;
import br.com.ifpe.salaojpa.model.negocio.NegocioUsuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wemerson
 */
@ManagedBean
@SessionScoped
public class UsuarioController {
    
     private NegocioUsuario nedUsuario;
    private Usuario cadUsuario;
    
    public UsuarioController(){
        this.nedUsuario = new NegocioUsuario();
        this.cadUsuario = new Usuario();
    }
    
    public void cadastrar(){
        this.nedUsuario.inserir(this.cadUsuario);
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario cadastrado com sucesso"));
        this.cadUsuario = new Usuario();
        //return "index.xhtml";
        
    }
    
    public String alterar(Usuario usuario){
        this.nedUsuario.alterar(usuario);
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario alterado com sucesso"));
        return "index.xhtml";
    }
    
    public String deletar(Usuario usuario){
        this.nedUsuario.deletar(usuario);
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario deletado com sucesso"));
        return "index.xhtml";
    }
    
    public List<Usuario> listarAction(){
        return this.nedUsuario.recuperarTodos();
    }
    
    public boolean login(String login,String senha) {
       return this.nedUsuario.login(login, senha);
    }

    public NegocioUsuario getNedUsuario() {
        return nedUsuario;
    }

    public void setNedUsuario(NegocioUsuario nedUsuario) {
        this.nedUsuario = nedUsuario;
    }

    public Usuario getCadUsuario() {
        return cadUsuario;
    }

    public void setCadUsuario(Usuario cadUsuario) {
        this.cadUsuario = cadUsuario;
    }
    
     public Usuario login1(String login,String senha) {
       return this.nedUsuario.login1(login, senha);
    }
    
}
