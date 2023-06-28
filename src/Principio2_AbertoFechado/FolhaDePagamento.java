package Principio2_AbertoFechado;

import java.util.List;

// Essa classe está aberta para extensão, pois seu método "calcular" recebe um parâmetro do tipo "Remuneravel", que é uma interface.
// Isso significa que novas classes podem ser criadas para implementar a interface
public class FolhaDePagamento {
    private double saldo;

    public void calcular(List<Remuneravel> funcionarios){
        double totalRemuneracao = 0;

        for (Remuneravel funcionario : funcionarios) {
            totalRemuneracao += funcionario.calcularRemuneracao();
        }

        this.saldo = totalRemuneracao;
    }

    public double getSaldo() {
        return saldo;
    }


}
