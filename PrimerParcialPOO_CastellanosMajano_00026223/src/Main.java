import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{

    public static void main(String[]args) {
        int op=0;
        int fila;
        String marca, name, modelo,description;
        float memory, price;
        Scanner sc = new Scanner(System.in);
        List lista= new ArrayList<>();
        do {
            System.out.println("Ingrese lo que desea hacer: ");
            System.out.println("1=Ingresar nuevo Celular");
            System.out.println("2=Ingresar nueva Laptop");
            System.out.println("3=Modificar electrónicos existente");
            System.out.println("4=Ver listado de electrónicos");
            System.out.println("5= Salir");
            System.out.println();
            op= sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese la marca ");
                    marca=sc.nextLine();
                    System.out.println("Ingrese la memoria ");
                    memory=sc.nextFloat();
                    System.out.println("Ingrese el nombre ");
                    name=sc.nextLine();
                    System.out.println("Ingrese el modelo ");
                    modelo=sc.nextLine();
                    System.out.println("Ingrese descripción ");
                    description=sc.nextLine();
                    System.out.println("Ingrese el precio neto");
                    price=sc.nextFloat();

                    Telefono telefono=new Telefono(marca,memory,name,modelo,description,price);
                     telefono.create();
                     lista.add(telefono);

                case 2:
                    System.out.println("Ingrese la marca ");
                    marca=sc.nextLine();
                    System.out.println("Ingrese la memoria RAM ");
                    memory=sc.nextFloat();
                    System.out.println("Ingrese el nombre ");
                    name=sc.nextLine();
                    System.out.println("Ingrese el modelo ");
                    modelo=sc.nextLine();
                    System.out.println("Ingrese descripción ");
                    description=sc.nextLine();
                    System.out.println("Ingrese el precio neto");
                    price=sc.nextFloat();
                    Laptop laptop=new Laptop(marca,memory,name,modelo,description,price);
                    laptop.create();
                    lista.add(laptop);


                case 3:
                    System.out.println("Ingrese la fila que desea modificar");
                    fila= sc.nextInt();
                    if(fila== lista.size()){

                    }

                case 4:
                    for(int i =0;i< lista.size();i++){
                        System.out.println(lista);
                    }


                case 5:
                    break;

                default:
                    System.out.println("Opcion invalida");

            }


        }while (op!=5);


    }
}

