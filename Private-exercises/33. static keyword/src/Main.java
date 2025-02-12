public class Main {
    public static void main(String[] args) {

        //static = modifier. A single copy of a variable or method is created and shared.
        //         The class "owns" the static member

        Friend friend1 = new Friend("Tiago");
        Friend friend2 = new Friend("Maria");
        Friend friend3 = new Friend("Jose");

 //       System.out.println(Friend.numberOfFriends);
        Friend.getNumberOfFriends();
    }
}