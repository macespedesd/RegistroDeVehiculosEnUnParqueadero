package RegistroDeVehiculosEnUnParqueadero;

 public class Tiquete {
    private Vehiculo vehiculo;
    private String horaEntrada;
    private String minEntrada;
    private String horaSalida;
    private String minSalida;
    private double tarifaHora;
    
    Tiquete (Vehiculo vehiculo, String horaEntrada, String minEntrada, String horaSalida, String minSalida, double tarifaHora){
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
        this.minEntrada = minEntrada;
        this.horaSalida = horaSalida;
        this.minSalida = minSalida;
        this.tarifaHora = tarifaHora;
    }
     public String getHoraSalida() {
        return horaSalida;
     }
     public String getMinSalida() {
        return minSalida;
     }
     public String getHoraEntrada(){
        return horaEntrada;
     }
     public String getMinEntrada(){
        return minEntrada;
     }
      public double CalcularValor(){
        int horaEntradaInt = Integer.parseInt(getHoraEntrada());
        int minEntradaInt = Integer.parseInt(getMinEntrada());
        int horaSalidaInt = Integer.parseInt(getHoraSalida());
        int minSalidaInt = Integer.parseInt(getMinSalida());

        int totalMinutosEntrada = (horaEntradaInt * 60) + minEntradaInt;
        int totalMinutosSalida = (horaSalidaInt * 60) + minSalidaInt;

        int minutosTotales = totalMinutosSalida - totalMinutosEntrada;
        double horasTotales = minutosTotales / 60.0;

        return horasTotales * tarifaHora;
      }
 }