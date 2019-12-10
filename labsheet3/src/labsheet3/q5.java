package labsheet3;
public class q5 {
	public String s;
	public int indx=0;
	public char token;
	q5(String s) {
		this.s=s;
	}
	public void read_next_token() {
		this.token=s.charAt(indx);
		indx=indx+1;
	}
	public boolean E() {
		int savep=indx;
		if(T() && A()) {
			return true;
		}
		else {
			indx=savep;
			return false;
		}
	}
	public boolean A() {
		if(token=='+' && T() && A()) {
			return true;
		}
		return true;
	}
	public boolean T() {
		int savep=indx;
		if(F() && B())
			return true;
		else {
			indx=savep;
			return false;
		}
	}
	public boolean B() {
		int savep=indx;
		if(token=='*' && F() && B()) {
			return true;
		}
		indx=savep;
		return true;
	}
	public boolean F() {
		int savep=indx;
		read_next_token();
		if(token=='(' && E()) {
			savep=indx;
			read_next_token();
			if(token==')')
				return true;
			else {
				indx=savep;
				return false;
			}
		}
		else {
			indx=savep;
			read_next_token();
			if(token=='i') {
				savep=indx;
				read_next_token();
				if(token=='d') {
					return true;
				}
				else {
					indx=savep;
					return false;
				}
			}
			else {
				indx=savep;
				return false;
			}
		}
	}
}
