//Herança
public class FilmesPremiados extends Filmes{

	private String premio;
	private int ano;
	
	//Construtor sem parâmetros
	public FilmesPremiados(){
		super();
		this.premio = "";
		this.ano = 0;
	}
	
	
	//Construtor com parâmetros
	public FilmesPremiados(String nomePortugues, String nomeOriginal, String diretor, int anoLancamento, 
			String tipo, String sinopse, String premio, int ano) {
		super(nomePortugues, nomeOriginal, diretor, anoLancamento, tipo, sinopse);
		this.premio = premio;
		this.ano = ano;
	}

		//Getters e Setters
		public String getPremio() {
			return this.premio;
		}
		public void setPremio(String premio) {
			this.premio = premio;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}

		
		//To String
		@Override
		public String toString() {
			return super.toString() + "\nPremios: [premio=" + premio + ", ano=" + ano + "]";
		}
		
		
		
}
