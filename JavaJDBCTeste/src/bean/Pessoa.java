package bean;

public class Pessoa {
    
    
    private String CPF;
    private String nome;
    private String Cidade;
    private String Rua;

    public Pessoa() {
    }

    public Pessoa(String CPF, String nome, String Cidade, String Rua) {
        this.CPF = CPF;
        this.nome = nome;
        this.Cidade = Cidade;
        this.Rua = Rua;
    }

    

    
    
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }
    
    
    
}
