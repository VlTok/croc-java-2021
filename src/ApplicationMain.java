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
        String unitMeasure;

        boolean iterationForWhile = true;
        int degree = 10;
        int whatCase = -1;

        while (iterationForWhile) {
            whatCase += 1;
            if (bytes < Math.pow(2, degree)) {
                bytes = bytes / Math.pow(2, degree - 10);
                iterationForWhile = false;
            }
            degree += 10;
        }

        switch (whatCase) {
            case 1:
                unitMeasure = "KB";
                break;
            case 2:
                unitMeasure = "MB";
                break;
            case 3:
                unitMeasure = "GB";
                break;
            case 4:
                unitMeasure = "TB";
                break;
            case 5:
                unitMeasure = "PB";
                break;
            case 6:
                unitMeasure = "EB";
                break;
            case 7:
                unitMeasure = "ZB";
                break;
            case 8:
                unitMeasure = "YB";
                break;
            default:
                unitMeasure = "B";
        }

        bytesFormat = String.format("%.1f", bytes);
        System.out.println(bytesFormat + " " + unitMeasure);
    }

}
