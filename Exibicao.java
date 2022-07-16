
public class Exibicao {

	private Filmes filme;
	private String horario ;
	private Sala sala;
	
	//Construtor vazio
	public Exibicao() {
		this.filme = null;
		this.horario = "";
		this.sala = null;
	}
	
	//Construtor Com parâmetros
	public Exibicao(Filmes filme, String horario, Sala sala) {
		this.filme = filme;
		this.horario = horario;
		this.sala = sala;
	}
	
	
	//Cria as sessões
	public void criaSessoes(Filmes filme, Sala sala, String horarios) {
			this.setFilme(filme);
			this.setHorario(horarios);
			this.setSala(sala);
		}
		
	
	
	//Getters e setters----------------------------------------------------------------------------
		public Filmes getFilme() {
			return filme;
		}
		public void setFilme(Filmes filme) {
			this.filme = filme;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}

		public Sala getSala() {
				return sala;
		}
	
		public void setSala(Sala sala) {
				this.sala = sala;
		}

		//to String
		@Override
		public String toString() {
			return "\n\nExibicao [filme=" + filme + "\nHorario=" + horario + ", Sala =" + sala + "]";
		}

		
		
	
}
