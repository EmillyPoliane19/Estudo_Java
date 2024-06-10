package curso.fundamentos;

public class DesafioOperadores {
   public static void main(String[] args){
      int a = (1-5) * (2-7) / 2;
      int x = (int) Math.pow(a, 2);

      int b = (3+2) * 6;
      int y = (int) Math.pow(b, 2) / 3 * 2;

      int c = y - x;
      int z = (int) Math.pow(c, 3) / (int) Math.pow(10, 3);

      System.out.printf(" %d " , z);


   }
}
