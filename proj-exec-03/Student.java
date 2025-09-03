/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 471 - LINGUAGEM DE PROGRAMAÇÃO II
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public String getProgram() { return program; }
    public int getYear() { return year; }
    public double getFee() { return fee; }

    public void setProgram(String program) { this.program = program; }
    public void setYear(int year) { this.year = year; }
    public void setFee(double fee) { this.fee = fee; }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String toString() {
        return String.format("Student[Person[name = %s, address = %s], program = %s, year = %s, fee = R$%s]", this.name, this.address, this.program, this.year, this.fee);
    }
}
