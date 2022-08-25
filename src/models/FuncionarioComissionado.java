package models;

public class FuncionarioComissionado extends Funcionario{

    private double percentual;
    private double valorVendas;

    @Override
    public double calculaSalario(){
        return  this.valorVendas * (this.percentual / 100);
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "Comissão:" + this.percentual + ". Valor de vendas: R$ " + this.valorVendas +
                "\n Salario: R$ " + this.calculaSalario() + ".";
    }
}
