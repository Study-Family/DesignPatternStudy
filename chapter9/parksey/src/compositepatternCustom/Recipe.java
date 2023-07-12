package compositepatternCustom;

public class Recipe{
    private int price;

    public Recipe() {
        price = 0;
    }

    public void initrecipe(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
