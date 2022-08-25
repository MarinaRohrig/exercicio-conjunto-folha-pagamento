package main;

import models.Funcionario;
import models.FuncionarioComissionado;
import models.FuncionarioHorista;
import models.FuncionarioMensalista;
import relatorios.FolhaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarioList = new ArrayList<>();
        FolhaDePagamento folha = new FolhaDePagamento();
        FuncionarioComissionado func1 = new FuncionarioComissionado();
        FuncionarioHorista func2 = new FuncionarioHorista();
        FuncionarioMensalista func3 = new FuncionarioMensalista();

        func1.setNome("Pedro");
        func1.setCpf("00000000");
        func1.setPercentual(2.5);
        func1.setValorVendas(2000);

        func2.setNome("Marina");
        func2.setCpf("00000344");
        func2.setCustoHora(10);
        func2.setHorasTrabalhadas(3000);

        func3.setNome("Milene");
        func3.setCpf("21038123");
        func3.setSalario(2222);

        funcionarioList.add(func1);
        funcionarioList.add(func2);
        funcionarioList.add(func3);

        folha.calculaTotalSalario(funcionarioList);
        System.out.println(func1.getInfo() + "\n");
        System.out.println(func2.getInfo() + "\n");
        System.out.println(func3.getInfo() + "\n");
        System.out.println("Total de salários na folha de pagamento: R$ "+ folha.getTotal());


    }
}
