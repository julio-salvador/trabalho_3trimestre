public class TestaLivro {

    public static void main(String[] args) {
        Livro foia = new Livro();

        foia.setTitulo("Ferrari: O homem por trás das máquinas");
        foia.setAutor("Brock Yates");
        foia.setPaginas(552);

        System.out.println("Exibir detalhes:");

        System.out.println("Titulo: " + foia.getTitulo());
        System.out.println("Autor: " + foia.getAutor());
        System.out.println("Paginas: " + foia.getPaginas());

    }
}