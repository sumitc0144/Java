package exception;



//without thows keyword
class PlayerDeadException extends RuntimeException{
	public PlayerDeadException(String msg) {
		super(msg);
	}
}

class player{
	private String name;
	private int health;
	
	public player(String name,int health) {
		this.name=name;
		this.health=health;
	}
	
	public void tokedamage(int damage) {
		health-=damage;
		
		if(health<=0) {
			throw new PlayerDeadException(this.name+" is Dead!!");
		}
	}
	public int gethealth() {
		return this.health;
	}
		
}
	


public class customexception_Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player first=new player("tony",100);
		
		try {
			first.tokedamage(100);
		}catch(PlayerDeadException e) {
			System.out.println("Exception occur"+e);
		}

	}

}
