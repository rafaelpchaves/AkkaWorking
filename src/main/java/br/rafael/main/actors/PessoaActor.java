package br.rafael.main.actors;

import br.rafael.main.menssages.Pessoa;
import akka.actor.UntypedActor;

public class PessoaActor extends UntypedActor{

	@Override
	public void onReceive(Object message) throws Exception {
		
		if(message instanceof Pessoa){
			System.out.println("Ator pessoa sem passar pelo master actor");
		}
	}
}
