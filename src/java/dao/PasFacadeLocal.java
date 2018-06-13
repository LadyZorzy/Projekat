/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lenovo
 */
@Local
public interface PasFacadeLocal {

    void create(Pas pas);

    void edit(Pas pas);

    void remove(Pas pas);

    Pas find(Object id);

    List<Pas> findAll();

    List<Pas> findRange(int[] range);

    int count();
    
}
