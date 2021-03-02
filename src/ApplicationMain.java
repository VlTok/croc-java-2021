import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество байт:");
        double bytes = in.nextDouble();
        printBytes(bytes);
    }

    public static void printBytes(double bytes) {
        try {
            if (bytes < 0) {
                throw new ArithmeticException("Не может быть меньше 0");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return;
        }
        String bytesFormat;
        int whatCase = searchCase(bytes);

        switch (whatCase) {
            case 1:
                bytesFormat = String.format("%.1f", bytes);
                System.out.println(bytesFormat + " B");
                break;
            case 2:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 10));
                System.out.println(bytesFormat + " KB");
                break;
            case 3:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 20));
                System.out.println(bytesFormat + " MB");
                break;
            case 4:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 30));
                System.out.println(bytesFormat + " GB");
                break;
            case 5:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 40));
                System.out.println(bytesFormat + " TB");
                break;
            case 6:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 50));
                System.out.println(bytesFormat + " PB");
                break;
            case 7:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 60));
                System.out.println(bytesFormat + " EB");
                break;
            case 8:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 70));
                System.out.println(bytesFormat + " ZB");
                break;
            default:
                bytesFormat = String.format("%.1f", bytes / Math.pow(2, 80));
                System.out.println(bytesFormat + " YB");
        }
    }

    private static int searchCase(double bytes) {
        boolean iterationForWhile = true;
        int degree = 10;
        int whatCase = 0;

        while (iterationForWhile) {
            whatCase += 1;
            if (bytes < Math.pow(2, degree)) {
                iterationForWhile = false;
            }
            degree += 10;
        }
        return whatCase;
    }
}
