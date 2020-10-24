public class  Vehiculo{
  
  public static Vehiculo[] vehiculos = new Vehiculo[10];
  public static int tamano = 10;
  public static int posAnadir = 0;
  private int modelo;             // instacia de objeto
  private String marca;
  private double valorComercial;
  private String color;

  public Vehiculo(){
   Vehiculo.vehiculos[posAnadir] = this; 
   Vehiculo.posAnadir  ++;
  } 
  public Vehiculo(int mo, String ma, double va){
      this(mo, ma,va,"verde");
  } 
  public Vehiculo(int mo, String ma, double va, String co){
   this.modelo = mo;
   this.marca = ma;
   this.valorComercial = va;
   this.color = co;
   Vehiculo.vehiculos[posAnadir] = this; 
   Vehiculo.posAnadir  ++; // Aumento de atributo en 1 
  }  
  public int getModelo(){
      return this.modelo;

  }
  public void setModelo(int mo){
      this.modelo = mo;
  }
  public String getMarca(){
     return this.marca;
  }
  public void setMarca(String ma){
    this.marca = ma;
  }
  public double getValorComercial(){
     return this.valorComercial;
  }  
  public void setValorComercia(double va){
    this.valorComercial = va;
  }
  public String getColor(){
    return this.color;
  }
  public void setColor(String co){
    this.color = co;
  }
  
  public String toString(){
   return this.modelo + " "+ this.marca + " "+ this.valorComercial + " "+ this.color;  
  }
  public static String toStringVehiculos(){
    String info = "";
    for(int i = 0; i < posAnadir; i++){
      info = info + vehiculos[i].toString() + "\n";
      
    }   
    return info;
  } 
   public static int cantidadVehiculos(){
    return posAnadir;
  }
   public static String toStringVehiculosVerde(){
    String infoVerde = "";
    for(int i = 0; i < posAnadir; i++){
      if(vehiculos[i].getColor().equals("verde")){
          infoVerde = infoVerde + vehiculos[i].toString() + "\n";
      }
    }   
    return infoVerde;
}   

}