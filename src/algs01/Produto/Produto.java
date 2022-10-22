package algs01.Produto;

import java.math.BigDecimal;

public class Produto {
    private Long id;
    private String name;
    private BigDecimal price;

    public Produto(){}

    public Produto(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto: "+getName()+": Preco: "+getPrice();
    }
}
