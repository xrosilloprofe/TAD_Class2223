package generics;

public class Concesionario {
    GenericLinkedList<Vehiculo> vehiculos;

    public Concesionario(){
        vehiculos = new GenericLinkedList<>();
    }

    public void añadirVehiculo(Vehiculo v){
        vehiculos.addHead(v);
    }

}
