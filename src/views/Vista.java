package views;

import model.wallet;

public class Vista {
    public static void main(String[] args){
        wallet billetera1= new wallet();
        wallet miBilletera= new wallet();

        System.out.println(billetera1.consultarSaldo());
        System.out.println(billetera1.guardarDinero(10));
        System.out.println(billetera1.consultarSaldo());
        System.out.println(miBilletera.consultarSaldo());

    }
    
}
