package view;

import model.Owner;
import model.Wallet;

public class Vista {

    public static void main2(String[] args) {
        Wallet wallet1 = new Wallet();
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.getSaldo());
        wallet1.cambiarMaximo();
        System.out.println(wallet1.saveMoney(900000));
        System.out.println(wallet1.getSaldo());
        Owner cliente1 = new Owner("juan");
        String respoes=cliente1.getWallet().saveMoney(1000);
        cliente1.getWallet().takeMoney(200);
        
    }
    
}
