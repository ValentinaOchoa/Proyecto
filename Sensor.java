
public class Sensor{
  public static Sensor[] sensores  = new Sensor[8];
  public static int tamano = 8;
  public static int posAnadir = 0;
  private String tipo;
  private double valor; 

  public Sensor(){

  }

  public Sensor(String t, double v){
      this.tipo = t;
      this.valor = v;
      sensores[posAnadir] = this; 
      posAnadir  ++;

  }

  public double getValor(){
      return this.valor;
  }

  public void setValor(double v){
      this.valor = v;
  }

  public String getTipo(){
      return this.tipo;
  }

  public void setTipo(String t){
      this.tipo = t;
  }

  public String toString(){
      return this.tipo +" "+ this.valor;
  }

  public static String toStringSensores(){
      String salida = "";
      for(int i = 0; i < posAnadir; i++){
          salida = salida + sensores[i].toString() + "\n";
      }
      return salida;
  }

  public static int cantidadSensores(){
      return posAnadir;
  }

  public static String toStringSensoresTemperatura(){
      String salida = "";
      for(int i = 0; i < posAnadir; i++){

          if(sensores[i].getTipo().equals("temperatura")){
              salida = salida + sensores[i].toString() + "\n";
          }
      }
      return salida;
  }

  public static Sensor[] SensoresOrdenados(){
      int salida = 0;
      for(int i=0; i< posAnadir; i++){
          if(sensores[i].getTipo().equals("temperatura")){
              salida = salida + 1;
          }
      }
      if(salida>=1){  
          Sensor[] sensor = new Sensor [salida];
          salida = 0;
          for(int i =0; i<posAnadir; i++){
              if(sensores[i].getTipo().equals("temperatura")){
                  sensor[salida] = sensores[i];
                  salida ++;
              }
          }
          salida =0;
          Sensor aux = null;
          for(int i =0; i< sensor.length; i++){
              for(int j=0; j< sensor.length -i -1; j++ ){
                  if(sensor[j+1].getValor() < sensor[j].getValor()){
                      aux = sensor[j+1];
                      sensor[j+1] = sensor[j];
                      sensor [j]= aux;
                  }
              }
          } 
          return sensor;
      } else{
          return null;
      }

  }

}