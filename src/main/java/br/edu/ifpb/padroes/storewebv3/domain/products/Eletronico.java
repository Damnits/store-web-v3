package br.edu.ifpb.padroes.storewebv3.domain.products;

import br.edu.ifpb.padroes.storewebv3.domain.Visitor;

public class Eletronico extends Product {
    @Override
    public Long accept(Visitor visitor) {
        return visitor.visitEletronico(this);
    }
}
