package br.ufes.inf.sml.example.situation;

import org.drools.situation.base.*;

import br.ufes.inf.sml.example.model.*;
import br.ufes.inf.sml.example.situation.*;
import br.ufes.inf.sml.example.builtin.*;

// Start of user code for imports
// 
// import java.lang.*
//
// End of user code

public class AccountUnderObservationSituation extends SituationType {
	
	@SituationRole
	private Account account;

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	// Start of user code for class AccountUnderObservationSituation
	/*
	@Override
	public void setActive() {
		super.setActive();
		System.out.println("AccountUnderObservationSituation activated at " + this.getActivation().getTimestamp());		
	}
	
	public void setInactive() {
		super.setInactive();
		System.out.println("AccountUnderObservationSituation deactivated at " + this.getDeactivation().getTimestamp() + ". It lasts: " + (this.getDeactivation().getTimestamp() - this.getActivation().getTimestamp()) );		
	}
	*/	
	// End of user code

}

