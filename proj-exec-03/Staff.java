/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 471 - LINGUAGEM DE PROGRAMAÇÃO II
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

class Staff extends Person {
    private String school;
    private double pay;

    public String getSchool() { return school; }
    public double getPay() { return pay; }

    public void setSchool(String school) { this.school = school; }
    public void setPay(double pay) { this.pay = pay; }

    public Staff (String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String toString() {
        return String.format("Staff[Person[name = %s, address = %s], school = %s, pay = R$%s]", this.name, this.address, this.school, this.pay);
    }
}
