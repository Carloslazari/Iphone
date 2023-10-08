package ambiente.iphone.funcoes.sistemaLigacao.funcao;

import ambiente.iphone.funcoes.sistemaLigacao.SistemaLigacao;

public class Ligar implements SistemaLigacao{

	@Override
	public void aparelhoTelefonia() {
		System.out.println("LIGANDO");
	}

}
