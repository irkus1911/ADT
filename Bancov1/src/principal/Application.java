/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import implementations.*;
import control.*;
/**
 *
 * @author 2dam
 */
public class Application {
    public static void main (String [ ] args) {

    /**
     *
     * @return
     */
    
        }
    public static AccountControler aci(){
        AccountControler aci =new AccountControlerImplementation();
        return aci;
       }
     public static CustomerControler cci(){
        CustomerControler cci =new CustomerControlerImplementation();
        return cci;
       }
      public static MovementControler mci(){
        MovementControler mci =new MovementControlerImplementation();
        return mci;
       }
    
}
