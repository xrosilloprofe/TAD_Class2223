package generics;

public class TestVehi {
    public static void main(String[] args) {
        GenericLinkedList<Vehiculo> listaVehiculo = new GenericLinkedList<>();
        Coche c1 = new Coche("1111zzz","4");
        Coche c2 = new Coche("2222zzz","2");
        Moto m1 = new Moto("3333",500);
        Moto m2 = new Moto("4444",125);
        listaVehiculo.addHead(c1);
        listaVehiculo.addHead(m1);
        listaVehiculo.remove(0);

        System.out.println(listaVehiculo);



    }
}
