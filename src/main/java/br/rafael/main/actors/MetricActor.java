package br.rafael.main.actors;

import br.rafael.main.menssages.Metric;
import akka.actor.UntypedActor;

public class MetricActor extends UntypedActor{
	
	@Override
	public void onReceive(Object message) throws Exception {

		if(message instanceof Metric){
			System.out.println("Ator de metricas");
		}
	}

}
