public class Cachorro extends Animal {

    public String getEspecie() {
        return "cachorro";
    }

    public void late() {
        System.out.println("O cachorro " + nome + " está latindo.");
    }
}