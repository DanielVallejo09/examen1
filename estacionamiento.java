import java.util.ArrayList;

public class estacionamiento
{
     private String NoDePlacas;
     private int HoraEntrada;
     private int MinEntrada;
     private coche[] estacionamiento;
    
     public estacionamiento()
    {
        estacionamiento = new coche[150];
    }
    
    public void añadirCoche(String placas, int HoraEntrada, int MinEntrada)
    {
        int i;
        
        if(estacionamiento[i]<=150)
        {
          NoDePlacas = placas;
          HoraEntrada = HoraEntrada;
          MinEntrada = MinEntrada; 
        }
    }
    
    public int dameHoraEntrada()
    {
        return HoraEntrada;
    }
    
    public int dameMinEntrada()
    {
        return MinEntrada; 
    }
    
    public void salidaCoche(String placasSal, int HoraSalida, int MinSalida)
    {
        int t1 = 0;
        int t2 = 0;
        
        int dinero  = 0;
        int dinero2 = 0;
        
        int total = 0;
        if(placasSal == this.NoDePlacas)
          {
            t1 = HoraSalida - this.dameHoraEntrada();
            t2 = MinSalida - this.dameMinEntrada();
            
            dinero = dinero + (t1 *15);
            dinero2 = dinero2 + (t2 * 15);
            
            total = dinero + dinero2;
            estacionamiento = estacionamiento -1;
          }
          else
          {
              System.out.println("Placas erroneas, verificar de nuevo");
            }
    }
    

} 
