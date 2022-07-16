
public class Filmes {
	
	protected  String nomePortugues;
	protected  String nomeOriginal;
	protected  String diretor;
	protected  int anoLancamento;
	protected  String tipo;
	protected String sinopse;
	
	//Construtor vazio
	public Filmes() {
		this.nomePortugues = "";
		this.nomeOriginal = "";
		this.diretor = "";
		this.anoLancamento = 0;
		this.tipo = "";
		this.sinopse = "";
	}
	
	//Construtor com parametros
	public Filmes(String nomePortugues, String nomeOriginal, String diretor, int anoLancamento, String tipo,
			String sinopse) {
		this.nomePortugues = nomePortugues;
		this.nomeOriginal = nomeOriginal;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;
		this.tipo = tipo;
		this.sinopse = sinopse;
	}
	
	
	//Getters e setters----------------------------------------------------------------------------
	
		public String getNomePortugues() {
			return nomePortugues;
		}

		public void setNomePortugues(String nomePortugues) {
			this.nomePortugues = nomePortugues;
		}
		public String getNomeOriginal() {
			return nomeOriginal;
		}
		public void setNomeOriginal(String nomeOriginal) {
			this.nomeOriginal = nomeOriginal;
		}
		public String getDiretor() {
			return diretor;
		}
		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}
		public int getAnoLancamento() {
			return anoLancamento;
		}
		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getSinopse() {
			return sinopse;
		}
		public void setSinopse(String sinopse) {
			this.sinopse = sinopse;
		}

		
		//To STRING
		@Override
		public String toString() {
			return "Filme: [nomePortugues=" + nomePortugues + ", Titulo Original=" + nomeOriginal + ", diretor=" + diretor
					+ ", anoLancamento=" + anoLancamento + ", tipo=" + tipo + "\n \nSinopse=" + sinopse + "]";
		}
		
	
}
