/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.negocio;

import br.com.ifpe.salaojpa.model.entidades.Salao;
import br.com.ifpe.salaojpa.model.implementacoes.RepositorioSalaoImpIDB;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceSalao;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class NegocioSalao implements InterfaceSalao{
    
    private RepositorioSalaoImpIDB repSalao;
    private Salao sal;

    public NegocioSalao(){
        repSalao = new RepositorioSalaoImpIDB();
    }
    
    @Override
    public Salao recuperarCNPJ(String cnpj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salao login(String login, String senha) {
        if(login == null || senha == null){
            return null;
        }
        return ((RepositorioSalaoImpIDB)repSalao).login(login, senha);
    }

    @Override
    public void inserir(Salao salao) {
        if(((RepositorioSalaoImpIDB)repSalao).recuperar(salao.getId_salao())==null){
            this.repSalao.inserir(salao);
        }
    }

    @Override
    public void alterar(Salao salao) {
        if(((RepositorioSalaoImpIDB)repSalao).recuperar(salao.getId_salao())!=null){
            this.repSalao.alterar(salao);
        }
    }

    @Override
    public Salao recuperar(Integer codigo) {
        if(codigo == null){
            return null;
        }else{
            sal = repSalao.recuperar(codigo);
            if(sal == null){
                return null;
            }else{
                return sal;
            }
        }
    }

    @Override
    public void deletar(Salao salao) {
        if(((RepositorioSalaoImpIDB)repSalao).recuperar(salao.getId_salao())!=null){
            this.repSalao.deletar(salao);
        }
    }

    @Override
    public List<Salao> recuperarTodos() {
        return ((RepositorioSalaoImpIDB)repSalao).recuperarTodos();
    }
    
}
