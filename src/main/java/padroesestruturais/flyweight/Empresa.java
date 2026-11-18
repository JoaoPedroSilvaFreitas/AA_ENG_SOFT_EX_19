package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Fucionario> funcionarios = new ArrayList<>();

    public void registrar(String nomeFucionario, String nomeCidade, float salario) {
        Cargo cargo = CargoFactory.getCargo(nomeCidade, salario);
        Fucionario funcionario = new Fucionario(nomeFucionario, cargo);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<String>();
        for (Fucionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFucionario());
        }
        return saida;
    }


}
