import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        int op=0;
        int fila;
        int marca;
        float datos;
        Scanner sc = new Scanner();
        List lista= new ArrayList<>();
        do {
            System.out.println("Ingrese lo que desea hacer: ");
            System.out.println("1=Ingresar nuevo Celular");
            System.out.println("2=Ingresar nueva Laptop");
            System.out.println("3=Modificar electrónicos existente");
            System.out.println("4=Ver listado de electrónicos");
            System.out.println("5= Salir");
            op= sc.nextInt();
            switch (op){
                case 1:
                    Telefono telefono=new Telefono();
                     telefono.create();
                     lista.add(telefono);

                case 2:
                    Laptop laptop=new Laptop();
                    laptop.create();
                    lista.add(laptop);


                case 3:
                    System.out.println("Ingrese la fila que desea modificar");
                    fila= sc.nextInt();

                case 4:
                    System.out.println(lista);

                case 5:
                    break;

                default:
                    System.out.println("Opcion invalida");

            }


        }while (op!=5);

    }
}

