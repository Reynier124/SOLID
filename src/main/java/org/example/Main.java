package org.example;

import InterfaceSegregation.Cuenta_Bancaria_false;
import InterfaceSegregation.Cuenta_Bancaria_true;
import InterfaceSegregation.Tarjeta_Credito_false;
import InterfaceSegregation.Tarjeta_Credito_true;
import SingleResposibility.Libro_false;
import SingleResposibility.Libro_true;
import SingleResposibility.PrestarLibro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Este es el codigo sin el principio Single Responsibility siendo que, en este caso,
        la clase "Libro_false" tiene 2 responsabilidades: Libros y prestamos
         */
        Libro_false lf1 = new Libro_false("Harry Potter", "J.K Rowling", true);
        lf1.verificarPrestamo();
        lf1.devolverLibro();

        /*Y aquí tenemos el mismo ejemplo, pero siguiendo el principio de Single Responsibility
        siendo que: "Libro_true" solo se encarga de los libros y "PrestarLibro" de los prestamos"
         */
        Libro_true lt1 = new Libro_true("Harry Potter", "J.K Rowling");
        PrestarLibro p1 = new PrestarLibro(true);
        p1.setLibro(lt1);
        p1.verificarPrestamo();
        p1.devolverLibro();

        /*-----------------------------------------------------------------------------------*/

        /* El primer caso es donde no se aplica el principio de Interface Segregation haciendo que
        una interfaz general para varías clases. Con esto consigo que tarjeta de credito tenga 2 metodos que no utiliza
         */
        Tarjeta_Credito_false tf1 = new Tarjeta_Credito_false(1,12300);
        Cuenta_Bancaria_false cf1 = new Cuenta_Bancaria_false(1, 9300);
        Cuenta_Bancaria_false cf2 = new Cuenta_Bancaria_false(2,200);
        tf1.verificarSaldo();
        tf1.realizarTransferencia();
        tf1.realizarPago(8000);

        cf1.realizarPago(300);
        cf1.realizarTransferencia(5000, cf2);
        cf2.verificarSaldo();

        /* Y ahora es un caso que sí aplicamos el principio, diviendo la interfaz en 2, de esta forma
        no tenemos metodos innecesarios en ninguna clase
         */
        Tarjeta_Credito_true tt1 = new Tarjeta_Credito_true(1, 12300);
        Cuenta_Bancaria_true ct1 = new Cuenta_Bancaria_true(1, 9300);
        Cuenta_Bancaria_true ct2 = new Cuenta_Bancaria_true(2, 200);
        tt1.realizarPago(8000);

        ct1.realizarPago((300));
        ct1.realizarTransferencia(5000,ct2);
        ct2.verificarSaldo();

        
    }
}