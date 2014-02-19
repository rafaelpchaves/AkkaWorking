package br.rafael.main.actors;

import akka.actor.UntypedActor;

public class StringActor extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Exception {

		if (message instanceof String) {

			String msgs = testeDeMetodo((String) message);
			System.out.println("Ator de string              "+ msgs);
		
		}
		
	}
	public String testeDeMetodo(String message){
		
		return message+" teste de método dentro do ator de strings";
	}
}
