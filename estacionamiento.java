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
        int var = 0;
        
        if(var<= 150)
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
        if(placasSal == this.NoDePlacas)
        {
            t1 = HoraSalida - this.dameHoraEntrada();
            t2 = MinSalida - this.dameMinEntrada();
            
            
        }
    }
    

} 
