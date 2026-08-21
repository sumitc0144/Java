package Interface;

interface Animal {
    void sound();
    void play();
}


//an interface is a contract that defines a set of abstract methods
//(without implementation) that a class must provide. 
//It is mainly used to achieve abstraction and multiple inheritance,
//allowing different classes to share common behavior
//while implementing their own logic

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void play() {
        System.out.println("Dog plays fetch");
    }
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
        d.sound();
        d.play();

	}

}
