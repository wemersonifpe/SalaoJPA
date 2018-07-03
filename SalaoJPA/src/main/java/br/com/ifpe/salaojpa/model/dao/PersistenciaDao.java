/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifpe.salaojpa.model.dao;

import br.com.ifpe.salaojpa.model.entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wemerson
 */
public class PersistenciaDao {
    
    private static PersistenciaDao instance = null;
    private EntityManagerFactory emf = null;
    
    private PersistenciaDao(){
        this.emf = Persistence.createEntityManagerFactory("Salaoajpas");
    }
    
    public static PersistenciaDao getInstance(){
        if(instance == null){
            instance = new PersistenciaDao();
        }
        return instance;
    }
    
    public void persist(Object o){
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println("erro ao "+e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    public void update(Object o){
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println("erro ao "+e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    public void delete(Object o){
        EntityManager em = emf.createEntityManager();
        
        try{
            em.getTransaction().begin();
            em.remove(em.merge(o));
            em.getTransaction().commit();
        }catch(Exception e){
            System.out.println("erro ao "+e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }
    
    public List read(String sql){
        EntityManager em = emf.createEntityManager();
        
        List result = em.createQuery(sql).getResultList();
        
        em.close();
        
        return result;
    }
    
    public Object autenticar(String sql, String login, String senha){
        EntityManager em = emf.createEntityManager();
        
        Object obj = em.createQuery(sql +" WHERE a.login = :login AND a.senha = :senha");
        
        em.close();
        
        return obj;
    }
    
    public static void main(String args[]){
        Usuario c = new Usuario("123", "123", "123", "123");
        
        PersistenciaDao.getInstance().persist(c);
    }
}
