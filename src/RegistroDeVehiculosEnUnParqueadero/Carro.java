package RegistroDeVehiculosEnUnParqueadero;

public class Carro extends Vehiculo{
    private int numeroPuertas;
    
    Carro (String placa, String marca, String color, int numeroPuertas){
        super(placa,marca,color);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas(){
        return numeroPuertas;
    }

    @Override

    public void mostrarInfo(){
        super.mostrarInfo(){
            System.out.println("El carro tiene " + getNumeroPuertas() + " puertas.");
        }
    }
}