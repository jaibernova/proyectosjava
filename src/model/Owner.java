package model;


public class Owner extends User{
    private Wallet wallet;


    public Owner(String nombre) {
        super();
        wallet= new Wallet();
        setNombre(nombre);
    }



    public Wallet getWallet(){
        return wallet;
    }

    public String compararWalet(Wallet wallet2){
        if (wallet.getSaldo()==wallet2.getSaldo()) {
            return "son iguales";
        }
        if (wallet>wallet2) {
            return "no son iguales";
                        
        }
        if (wallet2<wallet) {
            return " esmayor";
            
        }

        return 

    }

}
