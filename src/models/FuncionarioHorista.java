package models;

public class FuncionarioHorista extends Funcionario{

    private double custoHora;
    private double horasTrabalhadas;

    public double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(double custoHora) {
        this.custoHora = custoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario() {
        return this.custoHora * this.horasTrabalhadas;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "Custo/Hora: R$ " + this.custoHora + ". Horas trabalhadas: "+ this.horasTrabalhadas +
                "\n Salario: R$" + this.calculaSalario() + ".";
    }
}
