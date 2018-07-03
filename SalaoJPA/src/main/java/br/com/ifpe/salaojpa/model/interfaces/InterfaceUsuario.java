/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.interfaces;

import br.com.ifpe.salaojpa.model.entidades.Usuario;

/**
 *
 * @author wemerson
 */
public interface InterfaceUsuario extends InterfaceGenerico<Usuario>{
    public Usuario recuperarCPF(String cpf);
    public boolean login(String login,String senha);
    public Usuario login1(String login,String senha);
    
}
