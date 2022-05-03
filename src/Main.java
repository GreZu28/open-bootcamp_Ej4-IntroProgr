public class Main {
    public static void main(String[] args) {

        //  Bucle if - else

        int numeroIf = 3;
        if(numeroIf > 0) {
            System.out.println("Es un numero positivo");
        } else if(numeroIf < 0){
            System.out.println("Es un numero negativo");
        } else {
            System.out.println("Es cero");

        }

        // Bucle while

        int numeroWhile = 1;
        while(numeroWhile < 3) {
            System.out.println("El valor de numeroWhile es " + numeroWhile);
            numeroWhile++;
        }

        // Bucle do - while

        do {
            System.out.println("El valor de numeroWhile es " + numeroWhile);
            numeroWhile++;
        } while(numeroWhile < 3);

        // Bucle for

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de numeroFor es " + numeroFor);
        }

        // Bucle switch

        var estacion = "primavera";

        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("La variable no es una estacion");
        }
    }
}
