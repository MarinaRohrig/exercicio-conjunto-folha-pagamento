package models;

public class Fornecedor {
    private String nomeFantasia;
    private String cnpj;
    private String  endereco;

    public Fornecedor(String nomeFantasia, String cnpj, String endereco) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEnderešo() {
        return endereco;
    }

    public void setEnderešo(String enderešo) {
        this.endereco = enderešo;
    }

}
