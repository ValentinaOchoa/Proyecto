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
      return tipo +" "+ valor;
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
  
}