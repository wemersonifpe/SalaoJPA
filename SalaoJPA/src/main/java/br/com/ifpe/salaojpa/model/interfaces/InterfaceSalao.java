/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.interfaces;

import br.com.ifpe.salaojpa.model.entidades.Salao;

/**
 *
 * @author wemerson
 */
public interface InterfaceSalao extends InterfaceGenerico<Salao>{
    
    public Salao recuperarCNPJ(String cnpj);
    public Salao login(String login, String senha);
    
}
