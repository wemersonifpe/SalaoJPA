/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.negocio;

import br.com.ifpe.salaojpa.model.entidades.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wemerson
 */
public class NegocioUsuarioIT {
    
    public NegocioUsuarioIT() {
    }

    @Test
    public void testSomeMethod() {
        Usuario u = new Usuario("458", "hbbu", "gcfccyc", "ghghcg");
        
        NegocioUsuario n = new NegocioUsuario();
        
        n.inserir(u);
    }
    
}
