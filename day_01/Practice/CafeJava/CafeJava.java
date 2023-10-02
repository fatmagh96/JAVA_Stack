public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready \n";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.5;
        double latte = 5;
        double cappuccino = 6.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(isReadyOrder1? readyMessage: pendingMessage); 

        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(isReadyOrder4? readyMessage+ displayTotalMessage + cappuccino: pendingMessage); 

        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(displayTotalMessage + latte*2); 
        System.out.println(isReadyOrder3? readyMessage: pendingMessage); 

        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(displayTotalMessage + latte); 
    }
}