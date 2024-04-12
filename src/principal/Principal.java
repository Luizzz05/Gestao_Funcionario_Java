package principal;

import javax.swing.JOptionPane;

import funcao.Funcao;

public class Principal {
    
	public static void main(String[] args) {
        Funcao funcao = new Funcao();
        String cidade;
        
     funcao.printDados();
     cidade = JOptionPane.showInputDialog("Digite a cidade que deseja gerar o relatório de funcionarios: ");
     funcao.gerarRelatorioPorCidade (cidade);
//     relatorio.gerarRelatorioPorCargo("Gerente");
//     relatorio.gerarRelatorioPorSexo("F");
//     relatorio.gerarRelatorioPorEstado("SP");

    }
	
}
