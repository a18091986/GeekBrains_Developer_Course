import java.util.Scanner;

public class case_switch {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int month = iScanner.nextInt();
        String text = "";
        switch (month) {
            case 9:
            case 10:
            case 11:
                text = "'Autumn'";
                break;
            case 1:
            case 2:
            case 12:
                text = "'Winter'";
                break;
            case 3:
            case 4:
            case 5:
                text = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                text = "Summer";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
    
}
