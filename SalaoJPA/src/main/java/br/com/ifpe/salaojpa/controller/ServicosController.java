/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.controller;

import br.com.ifpe.salaojpa.model.entidades.Servico;
import br.com.ifpe.salaojpa.model.negocio.NegocioServico;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author wemerson
 */
@ManagedBean
@SessionScoped
public class ServicosController {
    
    private NegocioServico servNegocio;
    private Servico servico;
    
    public ServicosController(){
        this.servNegocio = new NegocioServico();
        this.servico = new Servico();
    }
    
    public void cadastar(){
        this.servNegocio.inserir(servico);
        this.servico = new Servico();
    }
    
    public Servico recuperar(Integer codigo){
        return this.servNegocio.recuperar(codigo);
    }
    
    public String alterar(Servico servicos){
        this.servNegocio.alterar(servicos);
        return "";
    }
    
    public void deletar(Servico servicos){
        this.servNegocio.deletar(servicos);
    }
    
    public List<Servico> recuperarTodos(){
        return this.servNegocio.recuperarTodos();
    }

    public NegocioServico getServNegocio() {
        return servNegocio;
    }

    public void setServNegocio(NegocioServico servNegocio) {
        this.servNegocio = servNegocio;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
}
