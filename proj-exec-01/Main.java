/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 471 - LINGUAGEM DE PROGRAMAÇÃO II
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Stiven Richardy", "stiven@farialimacorporations.com.br", 'm');
        System.out.println(author.toString());
        author.setEmail("stiven@metaglobaltech.com");
        System.out.println("\nUpdated Auhtor info");
        System.out.println(String.format("| Name: %s", author.getName()));
        System.out.println(String.format("| E-mail: %s",author.getEmail()));
        System.out.println(String.format("| Gender: %s",author.getGender()));
    }
}
