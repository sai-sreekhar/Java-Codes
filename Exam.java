class Person {
    String name;
    String address;

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }
}

class Student extends Person {
    String program;
    int year;
    double fee;

    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    String getProgram()
    {
        return program;
    }

    void setProgram(String program){
        this.program = program;
    }

    int getYear()
    {
        return year;
    }

    double getFee()
    {
        return fee;
    }

    void setFee(double fee)
    {
        this.fee = fee;
    }

    void setYear(int year)
    {
        this.year = year;
    }
}

