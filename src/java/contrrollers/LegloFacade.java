/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrrollers;

import bean.Leglo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lenovo
 */
@Stateless
public class LegloFacade extends AbstractFacade<Leglo> {

    @PersistenceContext(unitName = "ProjekatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LegloFacade() {
        super(Leglo.class);
    }
    
}
