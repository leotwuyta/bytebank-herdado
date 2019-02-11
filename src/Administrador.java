
public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return 50;
	}
	

	
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	
}
