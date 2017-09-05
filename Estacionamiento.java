/**
 * PRIMER EXAMEN PARCIAL POO
 * @author Luis Fernando Herrera Gonzalez
 */

public class Estacionamiento
{
    private Vehiculo []estacionamiento;
    
    public Estacionamiento()
    {
        estacionamiento =new Vehiculo[150];
    }
    
    public void RegistraVehiculo(Vehiculo nuevoVehiculo)
    {
        for(int i=0;i<estacionamiento.length;i++)
        {
            if(estacionamiento[i]==null)
            {
                estacionamiento[i]=nuevoVehiculo;
                break;
            }
        }
    }
    
    private int buscaPlacas(String placas)
    {
        for(int i=0;i<estacionamiento.length;i++)
        {
            if(placas==estacionamiento[i].dimePlacas())
            {
                return i;
            }
        }
        return -1;
    }
}
