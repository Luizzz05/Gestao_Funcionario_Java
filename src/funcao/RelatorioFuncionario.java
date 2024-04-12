package funcao;

import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class RelatorioFuncionario {

	private List<Funcionario> Funcionario;

    public void relatorioFuncionarios() {
        Funcionario = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        Funcionario.add(f);
    }

    public void gerarRelatorioPorCidade(String cidade) {
        System.out.println("Relatório dos funcionários em " + cidade + ":");
        for (Funcionario f : Funcionario) {
            if (f.getCidade().equalsIgnoreCase(cidade)) {
                System.out.println(f);
            }
        }
    }

    public void gerarRelatorioPorCargo(String cargo) {
        System.out.println("Relatório dos funcionários com cargo de " + cargo + ":");
        for (Funcionario f : Funcionario) {
            if (f.getCargo().equalsIgnoreCase(cargo)) {
                System.out.println(f);
            }
        }
    }

    public void gerarRelatorioPorSexo(String sexo) {
        System.out.println("Relatório dos funcionários do sexo " + sexo + ":");
        for (Funcionario f : Funcionario) {
            if (f.getSexo().equalsIgnoreCase(sexo)) {
                System.out.println(f);
            }
        }
    }

    public void gerarRelatorioPorEstado(String estado) {
        System.out.println("Relatório dos funcionários do estado " + estado + ":");
        for (Funcionario f : Funcionario) {
            if (f.getEstado().equalsIgnoreCase(estado)) {
                System.out.println(f);
            }
        }
    }
}
