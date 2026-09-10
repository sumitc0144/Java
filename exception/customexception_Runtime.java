package exception;

// Custom unchecked exception (RuntimeException)
class PlayerDeadException extends RuntimeException {
    public PlayerDeadException(String msg) {
        super(msg);
    }
}

// Player class
class Player1 {
    private String name;
    private int health;

    public Player1(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Method that can throw PlayerDeadException
    public void takeDamage(int damage) throws PlayerDeadException {
        health -= damage;

        if (health <= 0) {
            throw new PlayerDeadException(this.name + " is Dead!!");
        }
    }

    public int getHealth() {
        return this.health;
    }
}

// Main class
public class customexception_Runtime {
    public static void main(String[] args) {
        Player1 first = new Player1("Tony", 100);

        try {
            first.takeDamage(100); // This will trigger the exception
        } catch (PlayerDeadException e) {
            // Option 1: Print full exception (class + message)
            System.out.println("Exception occur: " + e);

            // Option 2: Print only the custom message
            System.out.println("Exception occur: " + e.getMessage());
        }
    }
}
