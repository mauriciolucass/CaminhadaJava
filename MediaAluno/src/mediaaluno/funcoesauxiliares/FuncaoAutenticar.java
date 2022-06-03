package mediaaluno.funcoesauxiliares;

import mediaalun.interfaces.PermitirAcesso;

public class FuncaoAutenticar {
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticar(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
		
	}
}
