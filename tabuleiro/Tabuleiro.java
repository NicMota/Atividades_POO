
public class Tabuleiro {

    private int estado[][];
    private int tamanho;
    private int tamanho_linha;

    public Tabuleiro(int[][] estado_inicial,int tamanho, int tamanho_linha)
    {
        this.estado = estado_inicial;
        this.tamanho = tamanho;
        this.tamanho_linha = tamanho_linha;
    }
  

    public void mover(char movimento)
    {


        int zi = -1, zj = -1;

        for (int i = 0; i < tamanho_linha; i++) {
            for (int j = 0; j < tamanho_linha; j++) {
                if (estado[i][j] == 0) {
                    zi = i;
                    zj = j;
                }
            }
        }
        switch(movimento){
            case 'd':
                for(int i = 0; i<tamanho_linha;i++)
                {   
                   
                    for(int j = 0;j<tamanho_linha;j++)
                    {   
                        if(i+1 >= tamanho_linha)
                            continue;
                        if(estado[i+1][j] == 0)
                        {
                            trocar(i+1,j,i,j);
                            print();
                            return;
                        }
                       
                    }
                }
            break;
            case 'u':
                for(int i = 0; i<tamanho_linha;i++)
                {   
                   
                    for(int j = 0;j<tamanho_linha;j++)
                    {   
                        if(i-1 < 0)
                            continue;
                        if(estado[i-1][j] == 0)
                        {
                            trocar(i-1,j,i,j);
                            print();
                            return;
                        }
                       
                    }
                }
            break;

            case 'r':

               for(int i = 0; i<tamanho_linha;i++)
                {   
                   
                    for(int j = 0;j<tamanho_linha;j++)
                    {   
                        if(j+1 >= tamanho_linha)
                            continue;
                        if(estado[i][j+1] == 0)
                        {
                            trocar(i,j,i,j+1);
                            print();
                            return;
                        }
                       
                    }
                }

            break;

            case 'l':
                 for(int i = 0; i<tamanho_linha;i++)
                {   
                   
                    for(int j = 0;j<tamanho_linha;j++)
                    {  
                        if(j-1 < 0)
                            continue;
                        if(estado[i][j-1] == 0)
                        {
                            trocar(i,j,i,j-1);
                            print();
                            return;
                        }
                       
                    }
                }
            break;

        }
        print();
    }   
    public void trocar(int a,int b,int i, int j)
    {
        int aux = estado[a][b];
        estado[a][b] = estado[i][j];
        estado[i][j] = aux;
    }

    public void print()
    {
        

        
        for(int i = 0; i<tamanho_linha;i++)
        {   
            for(int a = 0;a<tamanho_linha;a++)
            {
                System.out.print("+------");
            }
            System.out.printf("+\n");
            for(int j = 0;j<tamanho_linha;j++)
            {   
                System.out.printf("|   %d  ",estado[i][j]);
            }
            System.out.printf("|\n");
        }
        for(int a = 0;a<tamanho_linha;a++)
        {
            System.out.print("+------");
        }
        System.out.printf("+\n\n");

    }


    public boolean verificar_estado()
    {   
        if(tamanho == 1)
        {
           if(estado[0][0] == 0){
                System.out.printf("Posicao final: true");
                return true;
           }
        
        }

        int prox = 0;
        for(int i = 0;i<tamanho_linha;i++)
        {   
            for(int j = 0;j<tamanho_linha;j++)
            {   
                
                if(j+1>=tamanho_linha)
                {   
                    if(i+1<tamanho_linha)
                        prox = estado[i+1][0];
                    else{
                        continue;
                    }
                }else
                {
                    prox = estado[i][j+1];
                }
                if(estado[i][j] +  1 != prox)
                {
                    System.out.printf("Posicao final: false");
                    return false;
                }
                    
            }
        }
        System.out.printf("Posicao final: true");
        return true;
       
    }

    
}
