package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la opcion que quiere estudiar: ");
    System.out.println("1= SUMA ");
    System.out.println("2= RESTA ");
    int seleccion= teclado.nextInt();

//    int numero = (int) (Math.random() * 20) + 1;
//    System.out.println("Número aleatorio: " + numero);

        String[] saludoBien={"Muy Bien","Excelente trabajo","correcto","Sigue asi"};
        String[] saludoMal={"No es correcto, Intentalo de nuevo","Error", "Vuelve a intentarlo","No te rindas"};

        int asierto=0;
        int incorrecto=0;

        if (seleccion==1){

        for (int i = 0; i < 10; i++) {

            int numeroMensaje1 = (int) (Math.random() * 4) ;
            int numero = (int) (Math.random() * 20) + 1;
            int numero2 = (int) (Math.random() * 20) + 1;

            double problema = numero + numero2;




            System.out.println("suma: " +numero + " + " + numero2 + " = ");
            double respuesta=teclado.nextDouble();


        if (respuesta==problema){

            System.out.println(saludoBien[numeroMensaje1]);

            asierto++;

        }else {


            System.out.println(saludoMal[numeroMensaje1]);
            incorrecto++;

        }


        double porcentajeAsierto=(asierto*100)/10;
        double porcentajeIncorrecto=(incorrecto*100)/10;


        System.out.println("Porcentaje de aciertos: "+porcentajeAsierto+"%");
        System.out.println("Porcentaje de errores: "+porcentajeIncorrecto+"%");


        }
            if (asierto>=8){
                System.out.println("FELICITACIONES");
            }else {
                System.out.println("SIGUELO INTENTANDO VALDRA LA PENA.");
            }



    }else {
            for (int i= 0; i < 10; i++) {

                int numeroMensaje1 = (int) (Math.random() * 4);
                int numero = (int) (Math.random() * 20) + 1;
                int numero2 = (int) (Math.random() * 20) + 1;

                double problema = numero - numero2;

                System.out.println("suma: " +numero + " - " + numero2 + " = ");
                double respuesta=teclado.nextDouble();

                if (respuesta==problema){

                    System.out.println(saludoBien[numeroMensaje1]);
                    asierto++;



                }else {
                    System.out.println(saludoMal[numeroMensaje1]);
                    incorrecto++;

                }

                double porcentajeAsierto=(asierto*100)/10;
                double porcentajeIncorrecto=(incorrecto*100)/10;


                System.out.println("Porcentaje de aciertos: "+porcentajeAsierto+"%");
                System.out.println("Porcentaje de errores: "+porcentajeIncorrecto+"%");





            }
            if (asierto>=8){
                System.out.println("FELICITACIONES");
            }else {
                System.out.println("SIGUELO INTENTANDO VALDRA LA PENA.");
            }

        }


    }
}