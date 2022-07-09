import java.util.*;

public class SortAman {
    static  class sort{
        String name;
        int quantity;
        int price;

        public sort(String name, int quantity, int price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void helper(List<Ruff.sort> list){
        Collections.sort(list, Comparator.comparing(Ruff.sort::getQuantity).thenComparing(Ruff.sort::getPrice).thenComparing(Ruff.sort::getName).reversed());

        for(Ruff.sort obj : list){
            System.out.print(obj.name+" "+obj.quantity+" "+obj.price);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Ruff.sort> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            String name = sc.next();
            int quantity = sc.nextInt();
            int price = sc.nextInt();
            list.add(new Ruff.sort(name,quantity,price));
        }
        helper(list);
    }
}
