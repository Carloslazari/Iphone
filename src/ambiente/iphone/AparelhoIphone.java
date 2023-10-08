package ambiente.iphone;

import ambiente.iphone.funcoes.navegadorInternet.NavegadorInternet;
import ambiente.iphone.funcoes.reprodutorMusical.ReprodutorMusical;
import ambiente.iphone.funcoes.sistemaLigacao.SistemaLigacao;

public class AparelhoIphone implements SistemaLigacao,NavegadorInternet,ReprodutorMusical {

	@Override
	public void reproduzindoMusica() {
		System.out.println("REPRODUZINDO UA MUSICA");		
	}

	@Override
	public void navegarInternet() {
		System.out.println("NAVEGANDO NA INTERNET");		
	}

	@Override
	public void aparelhoTelefonia() {
		System.out.println("FAZENDO UMA LIGAÇÃO");
		
	}
	
}