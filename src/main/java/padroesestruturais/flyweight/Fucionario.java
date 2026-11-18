package padroesestruturais.flyweight;

public class Fucionario {

    private String nome;
    private Cargo cargo;

    public Fucionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String obterFucionario() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", cargo='" + cargo.getNome() + '\'' +
                ", salario='" + cargo.getSalario() + '\'' +
                '}';
    }
}
