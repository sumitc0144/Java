package exception;

// Custom checked exception
class PlayerDeadException extends Exception {
    public PlayerDeadException(String msg) {
        super(msg);
    }
}

// Player class
class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Method declares it may throw PlayerDeadException
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
public class Without_custom {
    public static void main(String[] args) {
        Player first = new Player("Tony", 100);

        try {
            first.takeDamage(50);
            System.out.println("Health after damage: " + first.getHealth());

            first.takeDamage(60); // This will throw PlayerDeadException
            System.out.println("Health after damage: " + first.getHealth());

        } catch (PlayerDeadException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
