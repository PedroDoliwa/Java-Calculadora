import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // lista para calculo
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(20.0);
        lista.add(10.0);

        // Inicializando Objeto Operador
        Soma soma = new Soma();
        Subtrair subtracao = new Subtrair();
        Multiplicar multiplicacao = new Multiplicar();
        Dividir divisao = new Dividir();

        // Inicializando Objeto Calculadora
        CalculadoraBasica calculadora = new CalculadoraBasica();

        // Operação Soma
        calculadora.calcular(soma,lista);
        System.out.println(calculadora.getResultado()); // retornar um Double Resultado

        // Operação Subtração
        calculadora.calcular(subtracao,lista);
        System.out.println(calculadora.getResultado());

        // Operação Multiplicação
        calculadora.calcular(multiplicacao,lista);
        System.out.println(calculadora.getResultado());

        // Operação Divisão
        calculadora.calcular(divisao,lista);
        System.out.println(calculadora.getResultado());
    }
}