package br.edu.ifpb.padroes.storewebv3.domain.products;

import br.edu.ifpb.padroes.storewebv3.domain.Visitor;

public class Product implements Item{

    private Long id;
    private String sku;
    private Long price;
    private String title;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Long accept(Visitor visitor) {
        return visitor.visitProduct(this);
    }
}
