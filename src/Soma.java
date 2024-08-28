import java.util.ArrayList;

public class Soma implements Operador{

    @Override
    public double calcular(ArrayList<Double> list) {
        double resultado = 0.0;
        for (int i = 0; i < list.size(); i++) {
            resultado += list.get(i);
        }

        return resultado;
    }
}
