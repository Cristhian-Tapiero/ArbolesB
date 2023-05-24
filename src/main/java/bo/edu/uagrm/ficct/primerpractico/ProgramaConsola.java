/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bo.edu.uagrm.ficct.primerpractico;

/**
 *
 * @author HP
 */
public class ProgramaConsola {

    public static void main(String[] args) throws NullPointerException, ExcepcionClaveNoExiste {
        
        ArbolB<Integer, String> miArbolB = new ArbolB<>();
        
        System.out.println("Insertando nuevos elementos");
        miArbolB.insertar(50, "Rojo");
        miArbolB.insertar(30, "Azul");
        miArbolB.insertar(40, "Verde");
        miArbolB.insertar(60, "Amarillo");
        miArbolB.insertar(70, "Negro");
        miArbolB.insertar(80, "Blnaco");
        System.out.println(miArbolB.toString());
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Borrando elementos");
        miArbolB.eliminar(50);
        System.out.println(miArbolB.toString());
        
    }
}
