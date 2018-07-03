/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.implementacoes;

import br.com.ifpe.salaojpa.model.entidades.Endereco;
import br.com.ifpe.salaojpa.model.entidades.Salao;
import br.com.ifpe.salaojpa.model.entidades.Servico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wemerson
 */
public class RepositorioServicoImpIDBIT {
    
    public RepositorioServicoImpIDBIT() {
    }

    @Test
    public void testSomeMethod() {
        Endereco end = new Endereco(12, "rua", "bairro", "cidade");
        
        Salao sal = new Salao("cnpj", "nome", end, "login", "senha");
        sal.setId_salao(351);
        
        Servico ser = new Servico(sal, "Corte de cabelo", "cortar cabelo", 12, null);
        
        RepositorioServicoImpIDB r = new RepositorioServicoImpIDB();
        r.inserir(ser);
    }
    
}
