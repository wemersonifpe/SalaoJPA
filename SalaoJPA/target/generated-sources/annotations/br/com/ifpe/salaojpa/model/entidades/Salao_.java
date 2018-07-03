package br.com.ifpe.salaojpa.model.entidades;

import br.com.ifpe.salaojpa.model.entidades.Endereco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-29T01:27:27")
@StaticMetamodel(Salao.class)
public class Salao_ { 

    public static volatile SingularAttribute<Salao, Integer> id_salao;
    public static volatile SingularAttribute<Salao, String> senha;
    public static volatile SingularAttribute<Salao, Endereco> endereco;
    public static volatile SingularAttribute<Salao, String> nome;
    public static volatile SingularAttribute<Salao, String> cnpj;
    public static volatile SingularAttribute<Salao, String> login;

}