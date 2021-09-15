/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import clases.Account;
import clases.Movement;

/**
 *
 * @author 2dam
 */
public interface MovementControler {
    public void doMovement(Account x);
    public Movement[] consultMovements(Account x);
}
