package StreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    int id;
    String productName;
    String productGroup;
    int productPrice;

    public Product(int id, String productName, String productGroup, int productPrice) {
        this.id = id;
        this.productName = productName;
        this.productGroup = productGroup;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productGroup='" + productGroup + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

public class CollectorsDemo {
    public CollectorsDemo() {
    }

    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
                new Product(1, "Bat", "Sport", 120),
                new Product(2, "Ball", "Sport", 2012),
                new Product(3, "Cricket", "Sport", 420),
                new Product(4, "Pant", "Daily", 7965),
                new Product(5, "Shirt", "Daily", 912),
                new Product(6, "Pizza", "Food", 4300)
        );



        //find average of emp salary

        Double collect = list.stream()
                .collect(
                        Collectors.averagingDouble(Product::getProductPrice)
                );


        System.out.println(collect);
//
//        //print all the product name
//        List<Integer> listFOProd = list.stream()
//                .map(prod -> prod.productPrice).collect(Collectors.toList());
//
//        System.out.println(listFOProd);
//
        //now i need to save all product with there price 
        //i need to store productname -> price
        //toMap()
//        Map<String, Integer> listOfNameAndPrice = list.stream()
//                .collect(Collectors.toMap(prod -> prod.productName, prod -> prod.productPrice));
//
//        System.out.println(listOfNameAndPrice);
//
//
//        //sum of all price
//
//        Integer totalSum = list.stream()
//                .collect(Collectors.summingInt(prod -> prod.getProductPrice()));
//
//        System.out.println("Total : "+totalSum);

        //each group how many items
//        Map<String, Long>  groupingProductGroup = list.stream()
//                .collect(Collectors.groupingBy(prod -> prod.productGroup, Collectors.counting()));
//
//
//        System.out.println("Group: "+ groupingProductGroup);


    }

}
