package relatorios;

import models.*;

import java.util.List;

public class FolhaDePagamento {
    private double total;

    public void calculaTotalSalario(List<Funcionario> listaDeFuncionarios) {
        for (Funcionario funcionario : listaDeFuncionarios){
            this.total += funcionario.calculaSalario();
        }
    }

    public void calculaTotalGastos(List<ContasAPagar> lista) {
        for (ContasAPagar divida : lista) {
            this.total += divida.calculaGastos();
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
