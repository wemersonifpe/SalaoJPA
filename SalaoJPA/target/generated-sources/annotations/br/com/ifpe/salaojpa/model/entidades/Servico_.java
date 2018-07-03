package br.com.ifpe.salaojpa.model.entidades;

import br.com.ifpe.salaojpa.model.entidades.Salao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-29T01:27:27")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, Integer> id_servico;
    public static volatile SingularAttribute<Servico, Double> valor;
    public static volatile SingularAttribute<Servico, String> nome;
    public static volatile SingularAttribute<Servico, Date> duracao;
    public static volatile SingularAttribute<Servico, Salao> salao;
    public static volatile SingularAttribute<Servico, String> descricao;

}