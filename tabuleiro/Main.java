import java.util.*;

public class Main{
    public static void main(String[] args) {

       
        Scanner tec = new Scanner(System.in);
        ArrayList<Integer> aux = new ArrayList<Integer>();

        
        while (tec.hasNextInt()) {
            aux.add(tec.nextInt());
        }

        int n = (int) Math.sqrt(aux.size());
        int[][] estado_inicial = new int[n][n];
        
       
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                estado_inicial[i][j] = aux.get(i*n + j);
            }
        }
        Tabuleiro tab = new Tabuleiro(estado_inicial,aux.size(),n);
        tab.print();
        char[] movimentos = tec.next().toCharArray();
        
        for(char c : movimentos)
        {
            tab.mover(c);
        }
       
        tab.verificar_estado();
        tec.close();
        
  

    }
}