package funcao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import model.Funcionario;


public class Funcao {
	
    private List<Funcionario> funcionarios = new ArrayList<>();
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
	

    public void printDados() {
        while (true) {
            String sidade;

            // Criar um novo objeto Funcionario em cada iteração
            Funcionario f = new Funcionario();

            f.setNome(JOptionPane.showInputDialog("Digite o nome:"));
            f.setCargo(JOptionPane.showInputDialog("Digite o cargo:"));
            f.setHabilidades(JOptionPane.showInputDialog("Digite as habilidades:"));
            sidade = JOptionPane.showInputDialog("Digite sua idade: ");
            f.setIdade(Integer.parseInt(sidade)); // Converte a idade para int
            f.setSexo(JOptionPane.showInputDialog("Digite o sexo (M/F):"));
            f.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
            f.setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
            f.setEstado(JOptionPane.showInputDialog("Digite o estado:"));

            adicionarFuncionario(f); // Adiciona o funcionário à lista

            JOptionPane.showMessageDialog(null, "Nome: " + f.getNome() +
                    "\nCargo: " + f.getCargo() +
                    "\nHabilidades: " + f.getHabilidades() +
                    "\nIdade: " + f.getIdade() +
                    "\nSexo: " + f.getSexo() +
                    "\nEndereço: " + f.getEndereco() +
                    "\nCidade: " + f.getCidade() +
                    "\nEstado: " + f.getEstado());

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro funcionário?", "Novo Funcionário", JOptionPane.YES_NO_OPTION);
            if (resposta != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
	
	public void menuRelatorios() {
        while (true) {
            Object[] opcoes = {"Relatório por Cidade", "Relatório por Cargo", "Relatório por Sexo", "Relatório por Estado", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                null, 
                "Escolha uma opção:", 
                "Menu de Relatórios", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            if (escolha != JOptionPane.CLOSED_OPTION) {
                switch (escolha) {
                    case 0:
                        gerarRelatorioPorCidade();
                        break;
                    case 1:
                        gerarRelatorioPorCargo();
                        break;
                    case 2:
                        gerarRelatorioPorSexo();
                        break;
                    case 3:
                        gerarRelatorioPorEstado();
                        break;
                    case 4:
                        return;
                }
            } else {
                return; // Sai se o usuário cancelar
            }
        }
    }
	
    public void gerarRelatorioPorCidade() {
        String cidade = JOptionPane.showInputDialog("Digite a cidade que deseja gerar o relatório de funcionários: ");
        StringBuilder relatorio = new StringBuilder(); // Usaremos um StringBuilder para construir a mensagem do relatório
        boolean encontrouFuncionario = false; // Variável para verificar se pelo menos um funcionário foi encontrado

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCidade().equalsIgnoreCase(cidade)) {
                encontrouFuncionario = true;
                // Adicionamos as informações do funcionário ao StringBuilder
                relatorio.append("Cidade: ").append(funcionario.getCidade()).append("\n")
                         .append("Nome: ").append(funcionario.getNome()).append("\n")
                         .append("Cargo: ").append(funcionario.getCargo()).append("\n")
                         .append("Habilidades: ").append(funcionario.getHabilidades()).append("\n")
                         .append("Idade: ").append(funcionario.getIdade()).append("\n")
                         .append("Sexo: ").append(funcionario.getSexo()).append("\n")
                         .append("Endereço: ").append(funcionario.getEndereco()).append("\n")
                         .append("Estado: ").append(funcionario.getEstado()).append("\n\n");
            }
        }

        if (encontrouFuncionario) {
            // Se pelo menos um funcionário for encontrado na cidade especificada, exibimos o relatório
            JOptionPane.showMessageDialog(null, relatorio.toString());
        } else {
            // Se nenhum funcionário for encontrado na cidade especificada, exibimos uma mensagem indicando isso
            JOptionPane.showMessageDialog(null, "Não há funcionários na cidade especificada.");
        }
    }

    public void gerarRelatorioPorCargo() {
        String cargo = JOptionPane.showInputDialog("Digite o cargo que deseja gerar o relatório:");
        StringBuilder relatorio = new StringBuilder();
        boolean encontrouFuncionario = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCargo().equalsIgnoreCase(cargo)) {
                encontrouFuncionario = true;
                relatorio.append("Cargo: ").append(funcionario.getCargo()).append("\n")
                         .append("Nome: ").append(funcionario.getNome()).append("\n")
                         .append("Cidade: ").append(funcionario.getCidade()).append("\n")
                         .append("Habilidades: ").append(funcionario.getHabilidades()).append("\n")
                         .append("Idade: ").append(funcionario.getIdade()).append("\n")
                         .append("Sexo: ").append(funcionario.getSexo()).append("\n")
                         .append("Endereço: ").append(funcionario.getEndereco()).append("\n")
                         .append("Estado: ").append(funcionario.getEstado()).append("\n\n");
            }
        }

        if (encontrouFuncionario) {
            JOptionPane.showMessageDialog(null, relatorio.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Não há funcionários com o cargo especificado.");
        }
    }

    public void gerarRelatorioPorSexo() {
        String sexo = JOptionPane.showInputDialog("Digite o sexo que deseja gerar o relatório (M/F):");
        StringBuilder relatorio = new StringBuilder();
        boolean encontrouFuncionario = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSexo().equalsIgnoreCase(sexo)) {
                encontrouFuncionario = true;
                relatorio.append("Sexo: ").append(funcionario.getSexo()).append("\n")
                         .append("Nome: ").append(funcionario.getNome()).append("\n")
                         .append("Cidade: ").append(funcionario.getCidade()).append("\n")
                         .append("Cargo: ").append(funcionario.getCargo()).append("\n")
                         .append("Habilidades: ").append(funcionario.getHabilidades()).append("\n")
                         .append("Idade: ").append(funcionario.getIdade()).append("\n")
                         .append("Endereço: ").append(funcionario.getEndereco()).append("\n")
                         .append("Estado: ").append(funcionario.getEstado()).append("\n\n");
            }
        }

        if (encontrouFuncionario) {
            JOptionPane.showMessageDialog(null, relatorio.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Não há funcionários do sexo especificado.");
        }
    }

    public void gerarRelatorioPorEstado() {
        String estado = JOptionPane.showInputDialog("Digite o estado que deseja gerar o relatório:");
        StringBuilder relatorio = new StringBuilder();
        boolean encontrouFuncionario = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getEstado().equalsIgnoreCase(estado)) {
                encontrouFuncionario = true;
                relatorio.append("Estado: ").append(funcionario.getEstado()).append("\n")
                         .append("Nome: ").append(funcionario.getNome()).append("\n")
                         .append("Cidade: ").append(funcionario.getCidade()).append("\n")
                         .append("Cargo: ").append(funcionario.getCargo()).append("\n")
                         .append("Habilidades: ").append(funcionario.getHabilidades()).append("\n")
                         .append("Idade: ").append(funcionario.getIdade()).append("\n")
                         .append("Sexo: ").append(funcionario.getSexo()).append("\n")
                         .append("Endereço: ").append(funcionario.getEndereco()).append("\n\n");
            }
        }

        if (encontrouFuncionario) {
            JOptionPane.showMessageDialog(null, relatorio.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Não há funcionários no estado especificado.");
        }
    }
}


	
