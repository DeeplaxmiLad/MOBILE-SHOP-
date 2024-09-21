/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Amey Patil
 */
@Stateless
public class MobileEntityFacade extends AbstractFacade<MobileEntity> {
    @PersistenceContext(unitName = "MobileShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MobileEntityFacade() {
        super(MobileEntity.class);
    }
    
}
