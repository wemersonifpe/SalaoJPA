/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.entidades.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wemerson
 */
public class RepositorioUsuarioImpIDBIT {
    
    public RepositorioUsuarioImpIDBIT() {
    }

    @Test
    public void testSomeMethod() {
        Usuario u = new Usuario("12681", "fulano", "fulano.login", "123");
        //u.setId_usuario(201);
        
        RepositorioUsuarioImpIDB r = new RepositorioUsuarioImpIDB();
        
        r.inserir(u);
    }
    
}
