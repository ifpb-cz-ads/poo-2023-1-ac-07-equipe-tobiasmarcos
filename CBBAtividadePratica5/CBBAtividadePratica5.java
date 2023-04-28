

public class CBBAtividadePratica5
{
    public static void main(String []args){
       String [] dias;
       dias = new String[] {"Segunda", "Terça", "Quarta","Quinta", "Sexta",
        "Sábado", "Domingo"};

        int k=0;

        while(dias.length > k){
         System.out.println(dias[k]);
         k ++;
        }
        System.out.println();
        k = 0;
        
        do{
         System.out.println(dias[k]);
         k ++;    
        }while(dias.length > k);
        System.out.println();
        
        for(k=0; dias.length > k; k++){
         System.out.println(dias[k]);
        }
    }
}
