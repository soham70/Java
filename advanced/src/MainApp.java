import com.example.car.Car;
import com.example.car.Engine;

public class MainApp {

    public static void main(String[] args)
    {
        Car myCar = new Car("Tesla","2024");
        Engine eng = new Engine((200));

        myCar.display();
        eng.Start();

    }

}


