package br.edu.ifpb.padroes.storewebv3.domain;

import br.edu.ifpb.padroes.storewebv3.domain.products.Eletronico;
import br.edu.ifpb.padroes.storewebv3.domain.products.Item;
import br.edu.ifpb.padroes.storewebv3.domain.products.Livro;
import br.edu.ifpb.padroes.storewebv3.domain.products.Product;

public class PedidosVisitor implements Visitor{



    public Long export(Item... args){
        Long valor = 0L;
        for(Item item: args){
            valor = item.accept(this) + valor;
        }
        return valor;
    }


    @Override
    public Long visitEletronico(Eletronico eletronico) {
        return eletronico.getPrice();
    }
    @Override
    public Long visitLivro(Livro livro) {
        return livro.getPrice()* 4/5;// 80%
    }
    @Override
    public Long visitProduct(Product product) {
        return product.getPrice();
    }
}
