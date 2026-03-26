package RegistroDeVehiculosEnUnParqueadero;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println(" Bienvenido ");
        System.out.println(" Ingrese la placa del vehiculo: ");
        String placa = sc.nextLine();
        System.out.println(" Ingrese la marca del vehiculo: ");
        String marca = sc.nextLine();
        System.out.println(" Ingrese el color del vehiculo: ");
        String color = sc.nextLine();

        System.out.println(" Ingrese el tipo de vehiculo (Carro / Moto): ");
        String tipovehiculo = sc.nextLine();

        if (tipovehiculo.equalsIgnoreCase("Carro")){
             System.out.println(" Ingrese el numero de puertas del carro: ");
            int numeroDePuertas  = sc.nextInt();
            Vehiculo carro1 = new Carro (placa,marca,color,numeroDePuertas);
            System.out.println(" Ingrese la hora de entrada del carro (24H): ");
            int horaEntrada  = sc.nextInt();
            System.out.println(" Ingrese el minuto de entrada del carro: ");
            int minEntrada  = sc.nextInt();
             System.out.println(" Ingrese la hora de salida del carro (24H): ");
            int horaSalida  = sc.nextInt();
            System.out.println(" Ingrese el minuto de salida del carro: ");
            int minSalida  = sc.nextInt();
            Tiquete tiquete1 = new Tiquete (carro1,horaEntrada,minEntrada,horaSalida,minSalida,2000);
            carro1.mostrarInfo();
            System.out.println(" La tarifa del carro es: " + tiquete1.CalcularValor());
        
            
        } else if (tipovehiculo.equalsIgnoreCase("Moto")){
            
            System.out.println(" Ingrese si su moto tiene cajuela (true/false): ");
            boolean tieneCajuela=  sc.nextBoolean();
            System.out.println(" Ingrese la hora de entrada del vehiculo (24H): ");
            int horaEntrada =  sc.nextInt();
            System.out.println(" Ingrese el minuto de entrada del vehiculo: ");
            int minEntrada =  sc.nextInt();
            System.out.println(" Ingrese la hora de salida del vehiculo (24H): ");
            int horaSalida =  sc.nextInt();
            System.out.println(" Ingrese el minuto de salida del vehiculo: ");
            int minSalida =  sc.nextInt();

            
            Vehiculo moto1 = new Moto (placa,marca,color,tieneCajuela);
            Tiquete tiquete2 = new Tiquete (moto1,horaEntrada,minEntrada,horaSalida,minSalida,1000);
            
            moto1.mostrarInfo();
            System.out.println(" La tarifa de la moto es: " + tiquete2.CalcularValor());
            System.out.println("eso es todo");
        }
        
        sc.close();

    }
}