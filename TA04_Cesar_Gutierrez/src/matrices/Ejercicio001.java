
 
package matrices;

/**
 *
 * @author luudwin
 */
public class Ejercicio001 {

   
    public static void main(String[] args) 
       
        throws InterruptedException {
    // declarando un arreglo de una matriz de 6x10
    int[][] num = new int[6][10];
    
    int fila;
    int columna;
    /* Integer.MAX_VALUE, Integer.MIN_VALUE; permite identifiacar los valores
      maximos y minimos de la matriz
    */
    int min = Integer.MAX_VALUE;
    int filaMin = 0;
    int columnaMin = 0;
    
    int max = Integer.MIN_VALUE;
    int filaMax = 0;
    int columnaMax = 0;

    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        num[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(100);
        
        //a siguiente instruccion Calcula el máximo y guarda sus coordenadas
        if (num[fila][columna] < min) {
          min = num[fila][columna];
          filaMin = fila;
          columnaMin = columna;
        }
        
        // la siguiente instruccion Calcula el máximo y guarda sus coordenadas
                
        if (num[fila][columna] > max) {
          max = num[fila][columna];
          filaMax = fila;
          columnaMax = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }

    System.out.println("┘\n\nEl valor Maximo es:  " + max+ 
            " esta ubicado en la fila " + filaMax + ", columna " + columnaMax);
    System.out.println("El valor mínimo es " + min + " y está ubicadoen  fila " 
            + filaMin+ ", columna " + columnaMin);
    }
    
}
