import java.util.ArrayList;

public class Subtrair implements Operador{

    @Override
    public double calcular(ArrayList<Double> list) {
        double resultado = 0.0;
        for (int i = 0; i < list.size(); i++) {
            if(i == 0){
                resultado = list.get(i);
            }else{
                resultado -= list.get(i);
            }
        }
        return resultado;
    }

}
