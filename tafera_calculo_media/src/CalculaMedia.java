public class CalculaMedia {

    public static int numeroSoma;

    public static void main (String args[]){
        calculaSoma();
        calculaMedia();


    }

    public static void calculaSoma() {

        int num1 = 10;
        int num2 = 7;
        int num3 = 8;
        int num4 = 6;

       numeroSoma = num1 +  num2 + num3 + num4;

        System.out.println(numeroSoma);



    }

    public static void calculaMedia() {



        float numeroMedia = (float) numeroSoma / 4;

        System.out.println(numeroMedia);

    }

}

