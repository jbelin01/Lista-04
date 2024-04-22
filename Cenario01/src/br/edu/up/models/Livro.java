package br.edu.up.models;

public class Livro {

    private String codigo;

    private String titulo;

    private String[] autores = new String[5];

    private String isbn;

    private int ano;

    public Livro() {
    }


    public Livro(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }



    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getAutores() {
        return this.autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void info() {

        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.print("Autores: ");
        for (int i = 0; i < autores.length; i++) {
            System.out.print(autores[i]);
            if (i < autores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
        System.out.println();
    }


}
