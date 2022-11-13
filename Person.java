import java.io.*;

class Management {

    String name;
    String place;

    Management(String name, String place) {
        this.name = name;
        this.place = place;
    }
}

class Employee extends Management {

    int id;
    String name;
    String company = "SSS";

    Employee(int id, String name, String place) {

        super(name, place);
        this.id = id;
        this.name = name;
    }
}

class Person {

    public static void main(String arg[]) {

        try {
            Employee e1 = new Employee(69, "Person", "TamilNadu");

            File file = new File("f.txt");
            FileInputStream f = new FileInputStream(file);
            byte bytes[] = new byte[(int) file.length()];
            FileOutputStream out = new FileOutputStream("output.txt");
            out.write(bytes);
            out.close();
            out.flush();
            f.close();
            System.out.println("success");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}