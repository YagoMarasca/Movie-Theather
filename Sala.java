public class Sala {
	private String nome;
	private int capacidade;

	//construtor vazio
	public Sala() {
		this.nome = "";
		this.capacidade = 0;
	}
	
	//construtor com parâmetros
	public Sala(String nome, int capacidade) {
		this.nome = nome;
		this.capacidade = capacidade;
	}
	
	
	//Getters e setters----------------------------------------------------------------------------
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCapacidade() {
			return capacidade;
		}
		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}

		
		//TO String
		@Override
		public String toString() {
			return "[nome=" + nome + ", capacidade=" + capacidade + "]";
		}
	
		
		
	
}
