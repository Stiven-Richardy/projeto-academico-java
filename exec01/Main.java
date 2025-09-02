public class Main {
    public static void main(String[] args) {
        Author author = new Author("Stiven Richardy", "stiven@farialimacorporations.com.br", 'm');
        System.out.println(author.toString());
        author.setEmail("stiven@metaglobaltech.com");
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}
