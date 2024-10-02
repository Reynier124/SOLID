package InterfaceSegregation;

public class Cuenta_Bancaria_false implements Pago{
    private int numero_cuenta;
    private int saldo;

    public Cuenta_Bancaria_false() {
    }

    public Cuenta_Bancaria_false(int numero_cuenta, int saldo) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void realizarPago(int cargo){
        this.saldo = saldo - cargo;
        System.out.println("Pago realizado");
    }
    public void verificarSaldo(){
        System.out.println("Tu saldo es de: "+ saldo);
    };
    public void realizarTransferencia(int cargo, Cuenta_Bancaria_false c1){
        if (saldo >= cargo){
            this.saldo = saldo - cargo;
            int sum = c1.getSaldo();
            c1.setSaldo(sum+cargo);
            System.out.println("Transferencia realizado con exito a la cuenta: "+c1.numero_cuenta);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    };
}
