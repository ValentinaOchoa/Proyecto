import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu(){

        Scanner scan = new Scanner(System.in);  
        boolean repetir = true;
        while(repetir){
            System.out.println("Ingrese una opción");
            int opcion = scan.nextInt();
            switch(opcion){
                case 0:
                repetir = false;
                break;
                case 1:
                if( Vehiculo.posAnadir < Vehiculo.tamano){
                    System.out.println("Ingrese modelo");
                    int mo = scan.nextInt();
                    System.out.println("Ingrese Marca");
                    String ma = scan.next();
                    System.out.println("Ingrese Valor comercial");
                    double va= scan.nextDouble();
                    System.out.println("Ingrese Color");
                    String co= scan.next();
                    
                    Vehiculo V1 = new Vehiculo( mo, ma,  va,  co);
                } else{
                    System.out.println("Error base de datos llena");
                }

                break;
                case 2:
                System.out.println("Información de Vehiculos almacenados: "+
                  Vehiculo.toStringVehiculos());
                break;
                case 3:
                System.out.println("Cantidad de Vehiculos: " + Vehiculo.cantidadVehiculos());
                break;
                case 4:
                System.out.println("Información de Vehiculos verdes: "+
                Vehiculo.toStringVehiculosVerde());     
                break;
                case 5:
                if(Sensor.posAnadir < Sensor.tamano){
                     System.out.println("Ingrese tipo");
                     String t = scan.next();
                     System.out.println("Ingrese valor ");
                     double v= scan.nextDouble();
                     Sensor S1 = new Sensor(t, v);
                }else {
                    System.out.println("Error base de datos llena");
                }
                break;
                case 6:
                System.out.println("Información sensores almacenados: "+ Sensor.toStringSensores());
                break;
                case 7:
                
                System.out.println("Cantidad de sensores: "+ Sensor.cantidadSensores());
                break;
                case 8:
                System.out.println("Información sensores temperatura: " + Sensor.toStringSensoresTemperatura());
                break;
                case 666:
                Sensor[] sensor1 = Sensor.SensoresOrdenados();
                for(int i=0;i<sensor1.length;i++){
                    System.out.println("Sensores Temperatura Ordenados" + sensor1[i].toString()); 
                }

                break;
                default:
                 System.out.println("Ingresa un numero del 1-8 o el 666");
                break;
            }
        }
    }

}




