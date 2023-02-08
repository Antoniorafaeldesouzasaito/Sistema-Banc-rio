package Programa;
import java.util.Scanner;
import ClassesAuxiliares.Conta;
import ClassesAuxiliares.clienteTradicional;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		
		System.out.println("Bom Dia! Já é cliente? S/N");
		char resposta1 = sc.next().charAt(0);

		if(resposta1 == 'S') {
			System.out.println("Qual operação deseja realizar?");
			System.out.println("Saque, Deposito ou Consulta? S/D/C");
			char resposta2 = sc.next().charAt(0);
			if(resposta2 == 'S') {
				System.out.println("Qual valor deseja sacar?");
				double saque = sc.nextDouble();
				conta.saque(saque);
				System.out.println("Foram sacados: $" + saque);
				System.out.println("Seu saldo atual ficou: $" + conta.getSaldo());
			}
			if(resposta2 == 'D') {
				System.out.println("Qual valor deseja depositar?");
				double deposito = sc.nextDouble();
				conta.deposito(deposito);
				System.out.println("Foram depositados: $" + deposito);
				System.out.println("Seu saldo atual ficou: $" + conta.getSaldo());
			}
			if(resposta2 == 'C'){
				System.out.println("Seu saldo atual é de: $" + conta.getSaldo());
			}
		}
		else {
			System.out.printf("Para iniciar seu cadastro digite seu nome completo: ");
			String nome = sc.next();
			System.out.printf("Digite a data de Nascimento dd/MM/yyyy: ");
			String dataDeNascimento = sc.next();
			System.out.printf("Digite o numero de CPF: ");
			String CPF = sc.next();
			System.out.printf("Digite o nome da mãe: ");
			String nomeMae = sc.next();
			System.out.println("Digite nome do pai: ");
			String nomePai = sc.next();
			
			clienteTradicional clienteTrad = new clienteTradicional(nome, dataDeNascimento,CPF, nomeMae, nomePai);
			System.out.println("Dados recebidos com sucesso!");
		}
		
		
		sc.close();	
	}
}