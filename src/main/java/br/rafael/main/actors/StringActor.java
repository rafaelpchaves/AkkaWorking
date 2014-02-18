package br.rafael.main.actors;

import akka.actor.UntypedActor;

public class StringActor extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Exception {

		if (message instanceof String) {

			System.out.println("Ator de string");
		
		}
	}
}
