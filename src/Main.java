
public class Main {
    public static void main(String[] args) {


        Dancer dancer=new Dancer("Atai"," is a dancer", "Adem");
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println(dancer);

        Programmer programmer=new Programmer("Meikinbek"," is the programming specialist", "Google");
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println(programmer);



        Singer singer=new Singer("Nick Carter", " is a singer", "Backstreet Boys");
        singer.singing();
        singer.playGuitar();
        singer.learn();
        singer.walk();
        singer.eat();
        System.out.println(singer);










    }
}