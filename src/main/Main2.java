package main;

import models.*;
import relatorios.FolhaDePagamento;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        FuncionarioComissionado pedro = new FuncionarioComissionado();
        pedro.setNome("Pedro");
        pedro.setCpf("0000000000");
        pedro.setPercentual(10);
        pedro.setValorVendas(10000);

        FuncionarioMensalista roberta = new FuncionarioMensalista();
        roberta.setNome("Roberta");
        roberta.setCpf("1111111111");
        roberta.setSalario(5000);

        FuncionarioHorista joao = new FuncionarioHorista();
        joao.setNome("João");
        joao.setCpf("222222222");
        joao.setCustoHora(50);
        joao.setHorasTrabalhadas(120);

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(pedro);
        listaDeFuncionarios.add(roberta);
        listaDeFuncionarios.add(joao);

        Fornecedor umFornecedor = new Fornecedor("Fornecimentos LTDA", "123123212", "rua blablabla");
        Fatura nf1 = new Fatura();
        nf1.setFornecedor(umFornecedor);
        nf1.setValorNotaFiscal(2000);

        FolhaDePagamento folha = new FolhaDePagamento();

        List<ContasAPagar> contasAPagar = new ArrayList<>();
        contasAPagar.add(nf1);
        for (Funcionario f : listaDeFuncionarios) {
            contasAPagar.add(f);
        }

        folha.calculaTotalGastos(contasAPagar);
        System.out.println("Valor total de gastos da empresa: R$" + folha.getTotal());

    }
}
