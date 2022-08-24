package relatorios;

import models.Funcionario;

import java.util.List;

public class FolhaDePagamento {
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calculaTotal(List<Funcionario> listaDeFuncionarios){
        //for each funcionario dentro de lista de funcionarios, incrementa o total
        for (Funcionario func : listaDeFuncionarios) {
            this.total += func.calculaSalario();
        }
    }
}
