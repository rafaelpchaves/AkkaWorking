package br.rafael.main;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import br.rafael.main.actors.MasterActor;
import br.rafael.main.menssages.Metric;

public class Principal  {

	
	
	public static void main(String[] args) throws Exception{
		
		Metric metric = new Metric(100, 100, true);
		
			
		
		ActorSystem _system = ActorSystem.create("StringTest");
		ActorRef master = _system.actorOf(new Props(MasterActor.class),"master");
		master.tell("String");
		master.tell(metric);
		master.tell(11);
		
		
		_system.shutdown();
		
	}

}
