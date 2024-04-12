package funcao;


import javax.swing.JOptionPane;

import model.Funcionario;

public class Funcao {

	Funcionario f = new Funcionario();
    public void printDados() {
    	int idade;
    	String sidade;
    	
        f.setNome(JOptionPane.showInputDialog("Digite o nome:"));
        f.setCargo(JOptionPane.showInputDialog("Digite o cargo:"));
        f.setHabilidades(JOptionPane.showInputDialog("Digite as habilidades:"));
        sidade = JOptionPane.showInputDialog("Digite sua idade: ");
        f.setIdade(idade = Integer.parseInt(sidade));
        f.setSexo(JOptionPane.showInputDialog("Digite o sexo (M/F):"));
        f.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
        f.setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
        f.setEstado(JOptionPane.showInputDialog("Digite o estado:"));
        
        JOptionPane.showMessageDialog(null, "Nome: " + f.getNome() +
							                "\nCargo: " + f.getCargo() +
							                "\nHabilidades: " + f.getHabilidades() +
							                "\nIdade: " + f.getIdade() +
							                "\nSexo: " + f.getSexo() +
							                "\nEndereço: " + f.getEndereco() +
							                "\nCidade: " + f.getCidade() +
							                "\nEstado: " + f.getEstado());
    }
    
    public void gerarRelatorioPorCidade(String cidade) {
        System.out.println("Relatório dos funcionários em " + cidade + ":");
            if (f.getCidade() == cidade) {
                System.out.println(f);
            }
        }

    public void gerarRelatorioPorCargo(String cargo) {
        System.out.println("Relatório dos funcionários com cargo de " + cargo + ":");
            if (f.getCargo() == cargo) {
                System.out.println(f);
            }
        }


    public void gerarRelatorioPorSexo(String sexo) {
        System.out.println("Relatório dos funcionários do sexo " + sexo + ":");
            if (f.getSexo() == sexo) {
                System.out.println(f);
            }
        }

    public void gerarRelatorioPorEstado(String estado) {
        System.out.println("Relatório dos funcionários do estado " + estado + ":"); {
            if (f.getEstado() == estado) {
                System.out.println(f);
            }
        }
    }
}

	
