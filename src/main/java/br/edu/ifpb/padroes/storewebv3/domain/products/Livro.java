package br.edu.ifpb.padroes.storewebv3.domain.products;

import br.edu.ifpb.padroes.storewebv3.domain.Visitor;

public class Livro extends Product {
    @Override
    public Long accept(Visitor visitor) {
        return visitor.visitLivro(this);
    }
}
