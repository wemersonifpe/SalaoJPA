/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.controller;

import br.com.ifpe.salaojpa.model.entidades.Salao;
import br.com.ifpe.salaojpa.model.negocio.NegocioSalao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wemerson
 */
@ManagedBean
@SessionScoped
public class SalaoController {
    
    private NegocioSalao salaoNegocio;
    private Salao salao;
    
    public SalaoController(){
        this.salaoNegocio = new NegocioSalao();
        this.salao = new Salao();
    }
    
    public void cadastrar(){
        this.salaoNegocio.inserir(this.salao);
        this.salao = new Salao();
    }
    
    public Salao rec(Integer codigo){
        return this.salaoNegocio.recuperar(codigo);
    }
    
    public Salao recupera(String cnpj){
        return this.salaoNegocio.recuperarCNPJ(cnpj);
    }
    
    public String alterar(Salao salao){
        this.salaoNegocio.alterar(salao);
        return "";
    }
    
    public void deletar(Salao salao){
        this.salaoNegocio.deletar(salao);
    }
    
    public List<Salao> listarAction(){
        return this.salaoNegocio.recuperarTodos();
    }
    
    public Salao login(String login,String senha) {
       return this.salaoNegocio.login(login, senha);
    }

    public NegocioSalao getSalaoNegocio() {
        return salaoNegocio;
    }

    public void setSalaoNegocio(NegocioSalao salaoNegocio) {
        this.salaoNegocio = salaoNegocio;
    }

    public Salao getSalao() {
        return salao;
    }

    public void setSalao(Salao salao) {
        this.salao = salao;
    }
    
}
