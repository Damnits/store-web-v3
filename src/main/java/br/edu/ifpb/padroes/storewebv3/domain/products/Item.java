package br.edu.ifpb.padroes.storewebv3.domain.products;

import br.edu.ifpb.padroes.storewebv3.domain.Visitor;

public interface Item {
    Long accept(Visitor visitor);
}
