/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cp;

/**
 *
 * @author natsu
 */
public class Cp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc, num;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Numero a insertar: ");
                    num = obj.entrada.nextInt();
                    obj.raiz = obj.insertar(num, obj.raiz);
                }
                case 2 -> {
                    obj.preOrden(obj.raiz);
                    System.out.println("");
                    obj.inOrden(obj.raiz);
                    System.out.println("");
                    obj.posOrden(obj.raiz);
                    System.out.println("");
                }
                /*
                case 3 -> {
                    System.out.println("Numero a eliminar: ");
                    num = obj.entrada.eliminar(num, obj.raiz);
                }
*/
            }
        } while (opc != 0);
    }

}
