package br.com.ifpe.salaojpa.model.entidades;

import br.com.ifpe.salaojpa.model.entidades.Servico;
import br.com.ifpe.salaojpa.model.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-29T01:27:27")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, Date> data;
    public static volatile SingularAttribute<Agenda, Date> horario;
    public static volatile SingularAttribute<Agenda, Integer> id_agenda;
    public static volatile SingularAttribute<Agenda, Usuario> usuarios;
    public static volatile SingularAttribute<Agenda, Servico> servico;

}