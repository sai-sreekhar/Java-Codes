import java.util.Scanner;

class shape {
    public static void main(String[] args) {

        String countries[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < countries.length; i++) {
            countries[i] = sc.nextLine();
        }
        System.out.println("Countries atrting with A are: ");
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].charAt(0) == 'A') {
                System.out.println(countries[i]);
            }
        }
        System.out.println("Sam P: 21BCE2930");
    }
}
