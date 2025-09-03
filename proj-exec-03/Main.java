/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 471 - LINGUAGEM DE PROGRAMAÇÃO II
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Guilherme Mendes", "Cubatao - Bolsao 8", "Java", 2004, 100);
        Staff staff = new Staff("Stiven Richardy", "Praia Grande - Tupi", "IFSP", 5000);

        System.out.println(student.toString());
        System.out.println("\n" + staff.toString());
    }
}
