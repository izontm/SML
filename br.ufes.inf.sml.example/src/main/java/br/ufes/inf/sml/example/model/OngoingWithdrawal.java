package br.ufes.inf.sml.example.model;
import br.ufes.inf.sml.example.builtin.*;

// Start of user code for imports
// 
// import java.lang.*
//
// End of user code

public class OngoingWithdrawal {
	
	// Start of user code for constructors and methods
	/* 
	public OngoingWithdrawal() {
		this.setValue;
	}
	*/
	// End of user code

	private Monetary value;
	private Account hasWithdrawal;
	private ATM doWithdrawal;

	public Monetary getValue() {
		return value;
	}

	public void setValue(Monetary value) {
		this.value = value;
	}
	
	public Account getHasWithdrawal() {
		return hasWithdrawal;
	}

	public void setHasWithdrawal(Account hasWithdrawal) {
		this.hasWithdrawal = hasWithdrawal;
	}
	
	public ATM getDoWithdrawal() {
		return doWithdrawal;
	}

	public void setDoWithdrawal(ATM doWithdrawal) {
		this.doWithdrawal = doWithdrawal;
	}
	
}
