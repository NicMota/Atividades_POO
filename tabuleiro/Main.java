import java.util.*;

public class Main{
    public static void main(String[] args) {

       
        Scanner tec = new Scanner(System.in);
        ArrayList<Integer> aux = new ArrayList<Integer>();

        
        while (tec.hasNextInt()) {
            aux.add(tec.nextInt());
        }


        int[] estado_inicial = aux.stream()
                                .mapToInt(Integer::intValue)
                                .toArray();
        
       
        Tabuleiro tab = new Tabuleiro(estado_inicial,aux.size());

        char[] movimentos = tec.next().toCharArray();

        for(char c : movimentos)
        {
            tab.mover(c);
        }
       
        tab.print();
        
        tec.close();
        
  

    }
}