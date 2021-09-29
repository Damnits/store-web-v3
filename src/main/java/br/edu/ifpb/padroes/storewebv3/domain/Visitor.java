package br.edu.ifpb.padroes.storewebv3.domain.products;

public interface Visitor {
    String visitEletronico(Eletronico eletronico);
    String visitLivro(Livro livro);
    String visitProduct(Product product);
}
