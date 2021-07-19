package model;

public class wallet {
    private int saldo;

    public wallet(){
        super();
        saldo=0;
    }

    public String guardarDinero(int valor){
        saldo += valor;
        return "Exito! ahora tienes "+saldo;
    }
    public String retirarDinero(int valor){
        if(valor < 0){
            return"Cantidad invalida";
        }
        if(valor>saldo){
            return"Saldo insuficiente";
        }
        saldo -= valor;
        return"Exito! ahora tienes $"+saldo;
    }
    public String consultarSaldo(){
        return"Su saldo actual es $"+saldo;
    }
}
