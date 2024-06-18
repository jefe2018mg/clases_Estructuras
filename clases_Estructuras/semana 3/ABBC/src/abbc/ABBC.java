package abbc;
public class ABBC {
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
