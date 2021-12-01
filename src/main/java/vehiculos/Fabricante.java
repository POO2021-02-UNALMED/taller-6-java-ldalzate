package vehiculos;
import java.util.ArrayList;

public class Fabricante {

    private static final ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private String nombre;
    private Pais pais;
    private int cantidadVehiculos;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static void agregarFabricante(Fabricante fabricante) {
        fabricantes.add(fabricante);
    }

    public void cantidadVehiculo() {
        cantidadVehiculos++;
    }

    public int getVehiculosFabricados() {
        return cantidadVehiculos;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante maxVentas = fabricantes.get(0);
        for (int i = 1; i < fabricantes.size(); i++) {
            if (fabricantes.get(i).getVehiculosFabricados() > maxVentas.getVehiculosFabricados()) {
                maxVentas = fabricantes.get(i);
            }
        }
        return maxVentas;
    }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public Pais getPais () {
            return pais;
        }

        public void setPais (Pais pais){
            this.pais = pais;
        }
    }
