public class Sensor{
    public static Sensor[] sensores  = new Sensor[8];
    public static int tamano = 8;
    public static int posAnadir = 0;
    private String tipo;
    private double valor; 
  
        public Sensor(){
      Sensor.sensores[posAnadir] = this; 
      Sensor.posAnadir  ++;
    }
  
    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
        Sensor.sensores[posAnadir] = this; 
        Sensor.posAnadir  ++;
  
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
        String info = "";
        for(int i = 0; i < posAnadir; i++){
            info = info + sensores[i].toString() + "\n";
        }
        return info;
    }
  
    public static int cantidadSensores(){
        return posAnadir;
    }
  
    public static String toStringSensoresTemperatura(){
        String infoTem = "";
        for(int i = 0; i < posAnadir; i++){
  
            if(sensores[i].getTipo().equals("temperatura")){
                infoTem = infoTem + sensores[i].toString() + "\n";
            }
        }
        return infoTem;
    }
  
    public static Sensor[] sensoresOrdenados(){
        int contadorSensor = 0;
        for(int i=0; i< posAnadir; i++){
            if(sensores[i].getTipo().equals("temperatura")){
                contadorSensor = contadorSensor + 1;
            }
        }
        if(contadorSensor>=1){  
            Sensor[] sensor = new Sensor [contadorSensor];
            int contador2 = 0;
            for(int i =0; i<posAnadir; i++){
                if(sensores[i].getTipo().equals("temperatura")){
                    sensor[contador2] = sensores[i];
                    contador2 ++;
                }
            }
            contador2 =0;
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