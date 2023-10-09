import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();

    }


    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }else return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal(){
        double sum = 0;
        for(int i=0; i<items.size();i++){
            sum += items.get(i).getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.printf("Customer Name: %s\n", this.name);
        for(int i=0; i<items.size();i++){
           System.out.printf("%s - $%.2f \n", this.items.get(i).getName(), this.items.get(i).getPrice());
        }
        System.out.printf("Total: %s\n", this.getOrderTotal());

    }



    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }


}