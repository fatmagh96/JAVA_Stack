import java.util.ArrayList;
class CafeUtil {

    public int getStreakGoal(int numberOfWeeks){
        int sum = 0;
        for(int i=1;i<=numberOfWeeks;i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        int sum = 0;
        for(int i=0;i<prices.length;i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
            System.out.println(i+" "+ menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);


    }


}