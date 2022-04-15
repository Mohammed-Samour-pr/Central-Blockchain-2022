/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.blockchain.pkg2022;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohammed sammour
 */
public class CentralBlockchain2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Store kfc = new Store("KFC Vietnam", null);
        Store burger = new Store("Burger King", kfc);
        Store pho = new Store("Pho", kfc);

        Store[] stores = {kfc, burger, pho};

        for (Store store : stores) {
            Thread thread = new Thread(store);
            thread.start();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CentralBlockchain2022.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Store store : stores) {
            System.out.println("");
            store.printBlockChain();
        }
    }

}
