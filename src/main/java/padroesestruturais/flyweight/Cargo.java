package padroesestruturais.flyweight;

public class Cargo {

    private String nome;
    private float salario;

    public Cargo(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }
}
