/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.interfaces;

import java.util.List;

/**
 *
 * @author wemerson
 */
public interface InterfaceGenerico<E> {
    
    public void inserir(E e);
    public void alterar(E e);
    public E recuperar(Integer codigo);
    public void deletar(E e);
    public List<E> recuperarTodos();
    
}
