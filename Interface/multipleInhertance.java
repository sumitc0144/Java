package Interface;

interface Anima {
    void sound();
}

interface Domestic {
    void care();
}

interface Pet extends Anima, Domestic {
    void play();
}

class DOG implements Pet {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void care() {
        System.out.println("Dog needs grooming");
    }
    public void play() {
        System.out.println("Dog plays fetch");
    }
}


public class multipleInhertance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOG D = new DOG();
        D.sound();
        D.play();
        D.care();

	}

}
