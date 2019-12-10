package labsheet3;

public class Driver {
public static void main(String[] args) {
	q1 qa=new q1("((a,a),(a))$");
	if(qa.S()) {
		qa.read_next_token();
		if(qa.token=='$')
			System.out.println("q1 Accepted");
		else
			System.out.println("q1 Not Accepted");
	}
	else {
		//System.out.println(qa.token);
		System.out.println("q1 Not Accepted");
	}
	
	q2 qb=new q2("(()())$");
	if(qb.S()) {
		qb.read_next_token();
		if(qb.token=='$')
			System.out.println("q2 Accepted");
		else
			System.out.println("q2 Not Accepted");
	}
	else {
		//System.out.println(qa.token);
		System.out.println("q2 Not Accepted");
	}
	
	q3 qc=new q3("((a,a),(a,a))$");
	if(qc.S()) {
		qc.read_next_token();
		if(qc.token=='$')
			System.out.println("q3 Accepted");
		else
			System.out.println("q3 Not Accepted");
	}
	else {
		//System.out.println(qa.token);
		System.out.println("q3 Not Accepted");
	}
	
	q4 qd=new q4("abababa,$");
	if(qd.S()) {
		qd.read_next_token();
		if(qd.token=='$')
			System.out.println("q4 Accepted");
		else
			System.out.println("q4 Not Accepted");
	}
	else {
		//System.out.println(qa.token);
		System.out.println("q4 Not Accepted");
	}
	
	q5 qe=new q5("(id+id)$");
	if(qe.E()) {
		qe.read_next_token();
		if(qe.token=='$')
			System.out.println("q4 Accepted");
		else
			System.out.println("q4 Not Accepted");
	}
	else {
		//System.out.println(qa.token);
		System.out.println("q4 Not Accepted");
	}
	
}
}
