/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.*;

/**
 *
 * @author 2dam
 */
public interface AccountControler {
    public void createAcount(Customer i);
    public Account[] consultAccountsCli(Customer i);
    public void addClient(Customer i,Account x);
    public Account[] consultAccount(Account c);
    
}
