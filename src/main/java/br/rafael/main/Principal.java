package br.rafael.main;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import br.rafael.main.actors.MasterActor;
import br.rafael.main.actors.PessoaActor;
import br.rafael.main.menssages.Metric;
import br.rafael.main.menssages.Pessoa;

public class Principal  {

	
	
	
	public static void main(String[] args) throws Exception{
		
		
		
		Metric metric = new Metric(100, 100, true);
		Pessoa pessoa = new Pessoa("Rafael", 18);
			
		
		ActorSystem _system = ActorSystem.create("StringTest");
		ActorRef master = _system.actorOf(new Props(MasterActor.class),"master");
		ActorRef pessoaActor = _system.actorOf(new Props(PessoaActor.class),"pessoa") ;
		master.tell("String");
		master.tell(metric);
		master.tell(11);
		pessoaActor.tell(pessoa);
		
		
		_system.shutdown();
		
	}

	
	}


