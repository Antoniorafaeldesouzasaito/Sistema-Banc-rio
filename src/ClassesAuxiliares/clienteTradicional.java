package ClassesAuxiliares;

	
public class clienteTradicional extends Pessoa{

	public clienteTradicional(String nome, String dataDeNascimento, String cPF, String nomeMae, String nomePai) {
		super(nome, dataDeNascimento, cPF, nomeMae, nomePai);
	}

	@Override
	public String toString() {
		return "clienteTradicional [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", CPF=" + CPF
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	
	
			
			
		
		}
