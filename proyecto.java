
import java.util.LinkedList;
import java.util.Scanner;

public class proyecto{
    public static void main(String[] args) {
        
        LinkedList <empleado> empleados = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < 3; i++) {
            empleado item = new empleado(null, null, null, null, i);
            System.out.println("Ingrese el nombre");
            item.setNombre(sc.next());
            System.out.println("Ingrese el apellido");
            item.setApellido(sc.next());
            System.out.println("Ingrese el direccion");
            item.setDireccion(sc.next());
            System.out.println("Ingrese el cargo");
            item.setCargo(sc.next());
            System.out.println("Ingrese el edad");
            item.setEdad(sc.nextInt());
            empleados.add(item);
            
        }
        
        String cadena ="";
        for (empleado empleado : empleados) {
            cadena = cadena + empleado.getNombre() + "\n" + empleado.getApellido()+ "\n"+ empleado.getCargo() + "\n"+ empleado.getDireccion() + "\n" + empleado.getEdad() + "\n";
            
        }
        System.out.println(cadena);
    }
}