package ambiente.iphone.funcoes.sistemaLigacao.funcao;

import ambiente.iphone.funcoes.sistemaLigacao.SistemaLigacao;

public class Atender implements SistemaLigacao{

	@Override
	public void aparelhoTelefonia() {
		System.out.println("ATENDENDO");
	}

}
