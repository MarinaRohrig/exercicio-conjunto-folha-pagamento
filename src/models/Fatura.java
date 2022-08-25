package models;

public class Fatura implements ContasAPagar {
    private Fornecedor fornecedor;
    private double valorNotaFiscal;


    @Override
    public double calculaGastos(){

        return this.valorNotaFiscal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }


}
