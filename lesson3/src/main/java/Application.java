import enumeration.Status;
import general.MeanTransportation;
import transport.Car;
import transport.Motorcycle;
import transport.Transport;

public class Application {
    public static void main(String[] args) {
        Transport motorcycle = new Motorcycle(
                "Toyota",
                "WRX",
                "200 kg",
                2,
                "140 kg",
                "100",
                Status.FREE,
                Boolean.TRUE,
                "Sport",
                "100ru",
                "JZ 2",
                "Center");

        System.out.println(motorcycle.getStatus());

        motorcycle.diagnostics();

        motorcycle.setStatus(Status.RENT);

        System.out.println(motorcycle.getStatus());
    }
}
