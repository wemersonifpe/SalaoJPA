/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.negocio;

import br.com.ifpe.salaojpa.model.entidades.Servico;
import br.com.ifpe.salaojpa.model.implementacoes.RepositorioServicoImpIDB;
import br.com.ifpe.salaojpa.model.interfaces.InterfaceGenerico;
import java.util.List;

/**
 *
 * @author wemerson
 */
public class NegocioServico implements InterfaceGenerico<Servico>{
    
    private RepositorioServicoImpIDB repServico;
    private Servico ser;

    public NegocioServico(){
        repServico = new RepositorioServicoImpIDB();
    }
    
    @Override
    public void inserir(Servico servico) {
        if(((RepositorioServicoImpIDB)repServico).recuperar(servico.getId_servico())==null){
            this.repServico.inserir(servico);
        }
    }

    @Override
    public void alterar(Servico servico) {
        if(((RepositorioServicoImpIDB)repServico).recuperar(servico.getId_servico())!=null){
            this.repServico.alterar(servico);
        }
    }

    @Override
    public Servico recuperar(Integer codigo) {
       /* if(codigo == null){
            return null;
        }
        return ((RepositorioServicoImpIDB)repServico).recuperar(codigo);*/
       if(codigo == null){
            return null;
        }else{
            ser = repServico.recuperar(codigo);
            if(ser == null){
                return null;
            }else{
                return ser;
            }
        }
    }

    @Override
    public void deletar(Servico servico) {
        if(((RepositorioServicoImpIDB)repServico).recuperar(servico.getId_servico())!=null){
            this.repServico.deletar(servico);
        }
    }

    @Override
    public List<Servico> recuperarTodos() {
        return ((RepositorioServicoImpIDB)repServico).recuperarTodos();
    }
    
}
