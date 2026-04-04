
public class Tabuleiro {

    private int estado[];
    private int tamanho;

    public Tabuleiro(int[] estado_inicial,int tamanho)
    {
        this.estado = estado_inicial;
        this.tamanho = tamanho;
    }
  

    public void mover(char movimento)
    {
        switch(movimento){
            case 'd':
              for(int i = 0; i<tamanho;i++)
                {   
                    if((2*i+1) > 0)
                        return;
                    if(estado[(2*i)+1] == 0)
                    {
                        trocar(i,2*i+1);
                    }

                }
            break;
            case 'u':
                for(int i = 0; i<tamanho;i++)
                {   
                    if(((i-1)/2) < 0)
                        return;
                    if(estado[(i-1)/2] == 0)
                    {
                        trocar(i,(i-1)/2);
                    }

                }
            
            break;

            case 'r':

                for(int i = 0; i<tamanho;i++)
                {   
                    if(i+1>=tamanho)
                        return;
                    if(estado[i+1] == 0)
                    {
                        trocar(i,i+1);
                    }

                }

            break;

            case 'l':
                for(int i = 0; i<tamanho;i++)
                {   
                    if(i-1>0)
                        return;
                    if(estado[i-1] == 0)
                    {
                        trocar(i,i-1);
                    }

                }
            break;

        }
    }   
    public void trocar(int i, int j)
    {
        int aux = estado[j];
        estado[j] = estado[i];
        estado[i] = aux;
    }

    public void print()
    {
        System.out.println("tamanho: "+ this.tamanho);

        
        for(int i = 0; i<tamanho;i++)
        {
            System.out.printf(" %d ",estado[i]);
        }
    }



    
}
