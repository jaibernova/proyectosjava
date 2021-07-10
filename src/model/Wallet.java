package model;

public class Wallet {
    public static final int CAPACIDAD_MAXIMA = 1000000;
    private int saldo;
    private boolean tieneLimite;   
    
    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;

    }

    public String saveMoney(int valor){
        if (valor<0){
            return "debe digitar un valor valido";
        }
        if (tieneLimite && valor+saldo > CAPACIDAD_MAXIMA) {
            return "el saldo no puede superar la capacidad maxima";
        }
        saldo += valor;
        return "transsaccion exitosa";

    }
    public String takeMoney (int valor){
        if (saldo<valor) {
            return "el monto supera el saldo";
        }
        saldo-=valor;
        return "transaccion exitosa";
    }
    public int getSaldo(){
        return saldo;
    }

    public void cambiarMaximo(){
        tieneLimite=false;
    }

}
