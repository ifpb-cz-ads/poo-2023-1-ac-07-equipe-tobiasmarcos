public class CeT {

    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 6.5, 9.0, 5.5, 7.5, 6.0, 8.0, 7.5, 9.5};
        double media = 0.0;
        int abaixoMedia = 0;
        int acimaMedia = 0;
        
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media) {
                abaixoMedia++;
            } else {
                acimaMedia++;
            }
        }
        
        System.out.println("Média das notas: " + media);
        System.out.println("Notas abaixo da média: " + abaixoMedia);
        System.out.println("Notas acima da média: " + acimaMedia);
    }

}
