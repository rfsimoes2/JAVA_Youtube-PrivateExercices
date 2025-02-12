public class Pizza {


    String bead;
    String sauce;
    String cheese;
    String topping;


    Pizza(String bead, String sauce, String cheese, String topping) {
        this.bead = bead;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    Pizza(String bead, String sauce, String cheese) {
        this.bead = bead;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza(String bead) {
        this.bead = bead;
    }

}
