public class Main{

    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.edad = 25;
        System.out.println("La edad del cliente es" + " " + cliente.edad);

        Cliente clienteNombre = new Cliente();
        cliente.nombre = "Gonzalo";
        System.out.println("El nombre del Cliente es" + " " + cliente.nombre);

        Cliente clienteTelefono = new Cliente();
        cliente.telefono = 46905250;
        System.out.println("El numero del cliente es" + " " + cliente.telefono);

        Cliente clienteCredito = new Cliente();
        cliente.Credito = 250000;
        System.out.println("El crédito del cliente es de" + " " + "$"+ cliente.Credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        System.out.println("La edad del Trabajador es" + " " + trabajador.edad);

        Trabajador trabajadorNombre = new Trabajador();
        trabajador.nombre = "Juan";
        System.out.println("El nombre del trabajador es" + " " + trabajador.nombre);

        Trabajador trabajadorTelefono = new Trabajador();
        trabajador.telefono = 1145289045;
        System.out.println("El telefono del trabajador es" + " " + trabajador.telefono);

        Trabajador trabajadorCredito = new Trabajador();
        trabajador.Credito = 750000;
        System.out.println("El Crédito del trabajador es" + "$" + trabajador.Credito);





    }

}

class Persona{

    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{

    int Credito;

   
}

class Trabajador extends Cliente{

    int Salario;
}