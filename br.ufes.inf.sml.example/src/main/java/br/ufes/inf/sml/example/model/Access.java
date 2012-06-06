package br.ufes.inf.sml.example.model;
import br.ufes.inf.sml.example.builtin.*;

// Start of user code for imports
// 
// import java.lang.*
//
// End of user code

public class Access {
	
	// Start of user code for constructors and methods
	/* 
	public Access() {
	}
	*/
	// End of user code

	private Account isAccessed;
	private Device isAcessing;

	public Account getIsAccessed() {
		return isAccessed;
	}

	public void setIsAccessed(Account isAccessed) {
		this.isAccessed = isAccessed;
	}
	
	public Device getIsAcessing() {
		return isAcessing;
	}

	public void setIsAcessing(Device isAcessing) {
		this.isAcessing = isAcessing;
	}
	
}
