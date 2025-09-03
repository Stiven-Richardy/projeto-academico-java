/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 471 - LINGUAGEM DE PROGRAMAÇÃO II
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Stiven Richardy", "stiven@gmail.com", 'm');
        authors[1] = new Author("Guilherme Mendes", "guilherme@gmail.com", 'm');

        Book testeBook = new Book("Java for Dummy", authors, 59.99, 50);
        System.out.println(testeBook.toString());
        System.out.println(String.format("\n| Names Authors: %s.", testeBook.getAuthorNames())); 
    }
}
