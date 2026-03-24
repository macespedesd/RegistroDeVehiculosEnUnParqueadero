package RegistroDeVehiculosEnUnParqueadero;

public class Moto extends Vehiculo{
    private boolean tieneCajuela;
    
    Moto (String placa, String marca, String color, Boolean tieneCajuela){
        super(placa,marca,color);
        this.tieneCajuela = tieneCajuela;
    }

    public boolean getTieneCajuela(){
        return tieneCajuela;
    }

    @Override

    public void mostrarInfo(){
        super.mostrarInfo(){
            System.out.println("La moto tiene cajuela:" + getTieneCajuela());
        }
    }
}