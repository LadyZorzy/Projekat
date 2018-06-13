/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Leglo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lenovo
 */
@Local
public interface LegloFacadeLocal {

    void create(Leglo leglo);

    void edit(Leglo leglo);

    void remove(Leglo leglo);

    Leglo find(Object id);

    List<Leglo> findAll();

    List<Leglo> findRange(int[] range);

    int count();
    
}
