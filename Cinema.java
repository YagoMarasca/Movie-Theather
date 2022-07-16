import java.lang.Math;
public class Cinema {
	private Exibicao sessoes[];
	private String horariosFuncionamento[] = {"16:00", "17:00", "18:00", "19:30", "20:00", "22:00", "24:00"};
	private Funcionario gruposFuncionarios[];
	
	//Construtor vazio
	public Cinema () {
		this.sessoes = new Exibicao[7];
		this.gruposFuncionarios = new Funcionario[3];
	}
	
	//construtor com par�metros
	public Cinema (int tamanho) {
		this.sessoes = new Exibicao[tamanho];
		this.gruposFuncionarios = new Funcionario[3];
	}
	
	//Getters e setters
		public Exibicao[] getSessoes() {
			return sessoes;
		}
	
		public void setSessoes(Exibicao[] sessoes) {
			this.sessoes = sessoes;
		}
	
		public String[] getHorariosFuncionamento() {
			return horariosFuncionamento;
		}
	
		public void setHorariosFuncionamento(String[] horariosFuncionamento) {
			this.horariosFuncionamento = horariosFuncionamento;
		}
	
		public Funcionario[] getFuncionarios() {
			return gruposFuncionarios;
		}
	
		public void setFuncionarios(Funcionario[] funcionarios) {
			this.gruposFuncionarios = funcionarios;
		}
		public int retornaTamanho() {
			return this.horariosFuncionamento.length;
		}
		
		public void mostraFuncoes() {
			String funcoes[] = new String[3];
			
			funcoes[0] = "Atendente do caixa - Venda de ingressos";
			funcoes[1] = "Atendente da Loja";
			funcoes[2] = "Lanterninha - Cuidas das 4 Salas";
			
			//La�os para imprimir os funcion�rios e suas fun��es (fun��es sorteadas)
			for(int k = 0; k<gruposFuncionarios.length; k++) {
				System.out.println("\nFuncionario " + this.getFuncionarios()[k].getNome()); 
				for(int i = 0, j=0; i < gruposFuncionarios.length; i++) {
					System.out.println("\nFun��o: " + funcoes[Math.abs(k-i)] +" - Hor�rio: "+ this.getSessoes()[j].getHorario());
					j+= 2;
				}
			}
		}

	public void apresentacao(Cinema cinema) {
		System.out.println("Bem vindo ao nosso cinema, segue abaixo os hor�rios das sess�es: \n");
		
		//Imprime as sess�es e suas informa��es
		for(int i = 0; i < horariosFuncionamento.length; i++) {
			System.out.println("Filme: " + cinema.getSessoes()[i].getFilme().getNomePortugues() + " - Horario: " + cinema.getSessoes()[i].getHorario() + " - Sala: " + cinema.getSessoes()[i].getSala().getNome());
			System.out.print("--------------------------------------------------------------");
			System.out.println(cinema.getSessoes()[i]);
			
			System.out.println("--------------------------------------------------------------");
			System.out.print("\n");
		}
		
		System.out.println("Qualquer d�vida, voc� pode tirar-las com os nossos funcion�rios: ");
		
		cinema.mostraFuncoes();
		
	}
	
	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		Exibicao sessoes[] = new Exibicao[7];
		Filmes filme[] =  new Filmes[4];
		Sala sala[] = new Sala[4];
		Funcionario funcionarios[] = new Funcionario[3];
		
		
		//Cadastrando os filmes
		filme[0] = new FilmesPremiados("Clube da Luta","Fight Club","David Fincher",1999,"A��o/drama","Um homem deprimido que sofre de ins�nia conhece um estranho vendedor chamado Tyler Durden e se v� morando em uma casa suja depois que seu perfeito apartamento � destru�do.\nA dupla forma um clube com regras r�gidas onde homens lutam. A parceria perfeita � comprometida quando uma mulher, Marla, atrai a aten��o de Tyler.","Empire Award na categoria de Melhor Atriz Brit�nica", 2000 );
		filme[1] = new Filmes("Tr�s Homens em Conflito","The Good, the Bad and the Ugly","Sergio Leone",1967,"A��o", "Durante a Guerra Civil Americana,um pistoleiro misterioso e dois estrangeiros decidem juntar suas for�as para encontrar um tesouro escondido. \nCada um dos homens conhece apenas uma parte da localiza��o da fortuna, o que for�a essa parceria. O problema � que nenhum deles tem a inten��o de dividir a riqueza.");	
		filme[2] = new Filmes("O M�skara","The Mask","Charles Russell",1994,"Com�dia","A vida do t�mido e socialmente desajeitado banc�rio Stanley Ipkiss muda completamente quando ele encontra no mar uma m�scara que possui o esp�rito do deus escandinavo Loki.\nSempre que usa a m�scara, Stanley ganha superpoderes e se transforma em um cara cheio de charme e confid�ncia, tudo o que � suficiente para ganhar a aten��o da linda cantora Tina. \nMas, acaba atraindo tamb�m o perigoso namorado dela, o g�ngster Dorian, que tenta se apoderar da m�scara para usar seus poderes para o mal.");
		filme[3] = new FilmesPremiados("Django Livre","Django Unchained","Quentin Tarantino",2012,"A��o","No sul dos Estados Unidos, o ex-escravo Django faz uma alian�a inesperada com o ca�ador de recompensas Schultz para ca�ar os criminosos mais procurados\ndo pa�s e resgatar sua esposa de um fazendeiro que for�a seus escravos a participar de competi��es mortais.", "Oscar de Melhor Ator Coadjuvante para Cristoph Waltz", 2013);
		
		//Cadastrando os funcionarios
		funcionarios[0] = new Funcionario(4561234,"Mateus", 2400.0, "24/07/2009");
		funcionarios[1] = new Funcionario(9182734,"Gustavo", 1800.0, "28/02/2020");
		funcionarios[2] = new Funcionario(1092385,"Joana", 2100.0, "25/10/2018");
		
		cinema.setFuncionarios(funcionarios);
		
		//Criando as Salas
		for(int i =0; i<4; i++) {
			sala[i] = new Sala("A-"+i,40);
		}
		
		//Criando as sessoes
		for(int i = 0; i<7; i++) {
			sessoes[i] = new Exibicao();
			if(i<4) {
				sessoes[i].criaSessoes(filme[i], sala[i], cinema.getHorariosFuncionamento()[i]);
			}else {
				sessoes[i].criaSessoes(filme[i-4], sala[i-4], cinema.getHorariosFuncionamento()[i]);
			}
		}
		//Inserindo as sessoes dentro do objeto Cinema
		cinema.setSessoes(sessoes);
		
		//Chamando m�todo de apresenta��o
		cinema.apresentacao(cinema);
		
		
	}	
}
