public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de una potencia");
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine()); 
        System.out.print("Introduzca el exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());

        double resultado = 1.0;
        int valor = Math.abs(exponente);

        for(int i = 0; i < valor; i++){
            resultado *= base;
        }
        if (exponente<0) {
            resultado = 1.0/resultado;
        }
        if (exponente == 0){
            resultado = 1.0;
        }
        System.out.printf("%d^%d = %.5f%n", base, exponente, resultado);
    }
}
