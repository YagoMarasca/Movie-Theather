
public class Funcionario {

	private int numeroCarteira;
	private String nome;
	private double salario;
	private String dataAdmissao;
	
	//Construtor vazio
	public Funcionario() {
		this.numeroCarteira = 0;
		this.nome = "";
		this.salario = 0;
		this.dataAdmissao = "";
	}
	
	
	//Construtor com parâmetros
	public Funcionario(int numeroCarteira, String nome, double salario, String dataAdmissao) {
		this.numeroCarteira = numeroCarteira;
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
	
	//Getters e setters----------------------------------------------------------------------------
		public int getNumeroCarteira() {
			return numeroCarteira;
		}
		public void setNumeroCarteira(int numeroCarteira) {
			this.numeroCarteira = numeroCarteira;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public String getDataAdmissao() {
			return dataAdmissao;
		}
		public void setDataAdmissao(String dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}

	//to String
	@Override
	public String toString() {
		return "Funcionario [numeroCarteira=" + numeroCarteira + ", nome=" + nome + ", salario=" + salario
				+ ", dataAdmissao=" + dataAdmissao + "]";
		}
}
