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

public class LoggedInSituation extends SituationType {
	
	@SituationRole
	private Device device;
	@SituationRole
	private Account account;

	public void setDevice(Device device) {
		this.device = device;
	}

	public Device getDevice() {
		return device;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	// Start of user code for class LoggedInSituation
	/*
	@Override
	public void setActive() {
		super.setActive();
		System.out.println("LoggedInSituation activated at " + this.getActivation().getTimestamp());		
	}
	
	public void setInactive() {
		super.setInactive();
		System.out.println("LoggedInSituation deactivated at " + this.getDeactivation().getTimestamp() + ". It lasts: " + (this.getDeactivation().getTimestamp() - this.getActivation().getTimestamp()) );		
	}
	*/	
	// End of user code

}

