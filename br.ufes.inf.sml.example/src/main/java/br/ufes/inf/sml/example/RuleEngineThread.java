package br.ufes.inf.sml.example;

import org.drools.runtime.StatefulKnowledgeSession;

class RuleEngineThread extends Thread {
	
	private StatefulKnowledgeSession ksession;
	
	public RuleEngineThread(StatefulKnowledgeSession ksession) {
		this.ksession = ksession;
	}

    public void run() {
    	
    	this.ksession.fireUntilHalt();
    	
    }

}

