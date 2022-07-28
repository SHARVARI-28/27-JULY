/*3)Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products

whose cost is less than 20000 and print the details of products in the list whose cost is greater than 20000

Step1: Create an Electronic Product bean class with attributes id , name and price

Step2: create a main method and add list of products created to product list

Step3: create a stream object and filter the list using stream filter and lambda expression

Step4: Using lambda expression iterate through list to print product name and product price

Sample output

Iphone 6S: 65000.0

Sony Xperia: 25000.0

Redmi4 : 26000.0*/
/*Write a program in java for LambdaExpressionComparator demo. The filter will sort the list of electronic products based
on product name
Step1: Create a Product bean class with attributes id, name and price
Step2: create a main method and inside main method create the Product objects and products to the product list
Step3: Using the Collections. Sort , sort the Product List using lambda expression. Lambda expression will use the
 object compareTo method compare the name objects for sorting
Step4: Finally print the elements of sorted product list
Sample output
Sorting on the basis of name...
2 Dell Mouse 150.0
1 HP Laptop 25000.0
3 Keyboard 300.0*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ElectronicsProductBean {

 int id;

 String name;

 float price;

 public ElectronicsProductBean (int id, String name, float price) {

  this.id = id;

  this.name = name;

  this.price = price;

 }

}

public class LambdaExpressionFilter {

 public static void main(String[] args) {

  List<ElectronicsProductBean> productsList = new ArrayList<ElectronicsProductBean>();

  //Adding Products

  productsList.add(new ElectronicsProductBean(5,"Iphone 6S",65000f));
  
  productsList.add(new ElectronicsProductBean(3,"Lenevo Laptop",19000f));

  productsList.add(new ElectronicsProductBean(4,"Sony Xperia",25000f));
  
  productsList.add(new ElectronicsProductBean(1,"Redmi 4",26000f));

  productsList.add(new ElectronicsProductBean(2,"Dell Laptop",19500f));

  
 Stream<ElectronicsProductBean> data = productsList.stream().filter(p->p.price > 20000);

 data.forEach(product -> System.out.println(product.name+ ": "+product.price));
 
 }
}