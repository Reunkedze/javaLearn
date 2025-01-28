import com.reunkedze.oop.lesson7.Computer;
import com.reunkedze.oop.lesson7.Ram;
import com.reunkedze.oop.lesson7.Ssd;

public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}