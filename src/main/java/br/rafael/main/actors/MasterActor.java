package br.rafael.main.actors;

import br.rafael.main.menssages.Metric;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class MasterActor extends UntypedActor {

	private ActorRef stringActor = getContext().actorOf(new Props(StringActor.class));
	private ActorRef metricActor = getContext().actorOf(new Props(MetricActor.class));
	
	@Override
	public void onReceive(Object message) throws Exception {

		if(message instanceof String){
			System.out.println("Mensagem passando pelo ator Master - String");
			stringActor.tell(message, getSelf());
		}else if(message instanceof Metric){
			System.out.println("Mensagem passando pelo ator Master - Metric");
			metricActor.tell(message, getSelf());
		}else if(message instanceof Integer){
			System.out.println("Ator master imprimindo um inteiro "+ message);
		}
		
		
	}
}
