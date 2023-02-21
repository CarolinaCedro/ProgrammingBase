package baseSintax;

public class Pessoa {

    private String nome;
    private String cpf;
    private String sexo;
    private Integer idade;
    private Boolean casada;


    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, String sexo, Integer idade, Boolean casada) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.idade = idade;
        this.casada = casada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setCasada(Boolean casada) {
        this.casada = casada;
    }

    public Boolean getCasada() {
        return casada;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String toString() {
        return "Pessoa: " + "\n" +
                "Nome: " + getNome() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Cpf: " + getCpf() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Casada: " + getCasada() + "\n";

    }
}
