/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 471 - LINGUAGEM DE PROGRAMAÇÃO II
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
*/

class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public char getGender() { return this.gender; }

    public void setEmail(String email) { this.email = email; }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return String.format("Author[name = %s, email = %s, gender = %c]", this.name, this.email, this.gender);
    }
}