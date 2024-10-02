package InterfaceSegregation;

public class Tarjeta_Credito_false implements Pago {
    private int numero_tarjeta;
    private int limite_credito;

    public Tarjeta_Credito_false(int numero_tarjeta, int limite_credito) {
        this.numero_tarjeta = numero_tarjeta;
        this.limite_credito = limite_credito;
    }

    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public int getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(int limite_credito) {
        this.limite_credito = limite_credito;
    }
    public void realizarPago(int cargo) {
        if (limite_credito > cargo){
            this.limite_credito = limite_credito - cargo;
            System.out.println("Pago realizado desde la tarjeta: "+numero_tarjeta);
        }
        else{
            System.out.println("Credito insuficiente");
        }
    }
    public void verificarSaldo(){
        System.out.println("Incompatible con este medio");
    };
    public void realizarTransferencia(){
        System.out.println("Incompatible con este medio");
    };

}
