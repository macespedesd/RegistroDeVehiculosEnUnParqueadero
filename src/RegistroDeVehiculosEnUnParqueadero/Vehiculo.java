package RegistroDeVehiculosEnUnParqueadero

public class Vehiculo {

    private String placa;
    private Sting marca;
    private String color;

    Vehiculo ( String placa , String marca , String color){
        this.placa = placa ;
        this.marca = marca;
        this.color = color ;
    }

    public String getPlaca (){
        return placa;
    }
    public void setPlaca (String placa ){
        this.placa = placa ;
    }

    public String getColor (){
        return color ;
    }
    public void setColor (String  color ){
        this.color = color ;
    }

    public String getMarca (){
        return marca;
    }
    public void setMarca ( String marca){
        this.marca = marca;
    }

    public void mostrarInfo(){
        System.out.println("la placa del vehiculo es :"+getPlaca());
        System.out.println("la marca del vehiculo es :"+getMarca());
        System.out.println("la color del vehiculo es :"+getColor());

    }

}