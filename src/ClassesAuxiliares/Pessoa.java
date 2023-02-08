package ClassesAuxiliares;

public class Pessoa {
		
		protected String nome;
		protected String dataDeNascimento;
		protected String CPF;
		protected String nomeMae;
		protected String nomePai;
		
		public Pessoa(String nome, String dataDeNascimento, String cPF, String nomeMae, String nomePai) {
			super();
			this.nome = nome;
			this.dataDeNascimento = dataDeNascimento;
			CPF = cPF;
			this.nomeMae = nomeMae;
			this.nomePai = nomePai;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataDeNascimento() {
			return dataDeNascimento;
		}

		public void setDataDeNascimento(String dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}
		
		
		
}
