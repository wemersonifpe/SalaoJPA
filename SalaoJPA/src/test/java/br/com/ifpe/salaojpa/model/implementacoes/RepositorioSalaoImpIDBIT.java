/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.entidades.Endereco;
import br.com.ifpe.salaojpa.model.entidades.Salao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wemerson
 */
public class RepositorioSalaoImpIDBIT {
    
    public RepositorioSalaoImpIDBIT() {
    }

    @Test
    public void testSomeMethod() {
        
        Endereco end = new Endereco(12, "rua", "bairro", "cidade");
        
        Salao sal = new Salao("cnpj", "nome", end, "login", "senha");
        
        RepositorioSalaoImpIDB r = new RepositorioSalaoImpIDB();
        
        r.inserir(sal);
    }
    
}
