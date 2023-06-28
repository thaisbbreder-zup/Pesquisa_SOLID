package Principio2_AbertoFechado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Remuneravel> funcionarios = new ArrayList<>();

        Remuneravel estagio = new Estagio();
        funcionarios.add(estagio);

        Remuneravel contratoCLT = new ContratoCLT();
        funcionarios.add(contratoCLT);

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.calcular(funcionarios);

        System.out.println("Remuneração total dos funcionarios: " + folhaDePagamento.getSaldo());
    }
}
