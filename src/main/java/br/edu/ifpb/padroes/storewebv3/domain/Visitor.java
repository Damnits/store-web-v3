package br.edu.ifpb.padroes.storewebv3.domain;

import br.edu.ifpb.padroes.storewebv3.domain.products.Eletronico;
import br.edu.ifpb.padroes.storewebv3.domain.products.Livro;
import br.edu.ifpb.padroes.storewebv3.domain.products.Product;

public interface Visitor {
    Long visitEletronico(Eletronico eletronico);
    Long visitLivro(Livro livro);
    Long visitProduct(Product product);
}
