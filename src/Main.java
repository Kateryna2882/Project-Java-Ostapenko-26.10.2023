
public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add(new Order(4,"Alen"));
        orderBoard.add(new Order(27,"Yoda"));
        orderBoard.add(new Order(33,"Obi-van"));
        orderBoard.add(new Order(34,"John Snow"));

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.draw();

        orderBoard.deliver(4);
        orderBoard.draw();
        orderBoard.deliver(27);
        orderBoard.draw();


    }
}