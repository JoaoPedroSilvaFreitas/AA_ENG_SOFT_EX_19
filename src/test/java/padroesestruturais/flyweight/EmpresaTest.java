package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarAlunos() {
        Empresa empresa = new Empresa();
        empresa.registrar("Jose", "Analista", 10000.0f);
        empresa.registrar("Maria", "Analista", 10000.0f);
        empresa.registrar("Ana", "Analista", 10000.0f);
        empresa.registrar("Joao", "Supervisor", 30000.0f);

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Jose', cargo='Analista', salario='10000.0'}",
                "Funcionario{nome='Maria', cargo='Analista', salario='10000.0'}",
                "Funcionario{nome='Ana', cargo='Analista', salario='10000.0'}",
                "Funcionario{nome='Joao', cargo='Supervisor', salario='30000.0'}");

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCidades() {
        Empresa empresa = new Empresa();
        empresa.registrar("Jose", "Analista", 10000.0f);
        empresa.registrar("Maria", "Analista", 10000.0f);
        empresa.registrar("Ana", "Analista", 10000.0f);
        empresa.registrar("Joao", "Supervisor", 30000.0f);

        assertEquals(2, CargoFactory.getTotalCargos());
    }

}