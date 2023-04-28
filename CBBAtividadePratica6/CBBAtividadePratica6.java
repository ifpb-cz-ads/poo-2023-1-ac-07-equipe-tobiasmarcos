import java.util.Scanner;

public class CBBAtividadePratica6
{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];
        int maior = 0;
        
            for(int k = 0; k<10; k++){
                System.out.println("Insira um número: ");
                arr[k] = scan.nextInt();
                    if(arr[k]>maior){
                        maior = arr[k];
                    }
                    
            }
            System.out.println();
            System.out.println();
            for(int k = 0; k<10; k++){
                System.out.println(arr[k]);      
            }
        System.out.println();
        System.out.println();
        System.out.println("O maior número é "+ maior);
    }

}
