public class Main {
    public static void main(String[] args) {
        lift(1,false);
        lift(3,true);
        lift(5,false);
        lift(9,true);

    }

    public static void lift(int floor, boolean hasCard) {
        switch (floor) {
            case 4:
                System.out.println("4 floor");
                break;
            case 1:
                System.out.println("1 floor");
                break;
            case 2:
                System.out.println("2 floor");
                break;
            case 3:
                System.out.println("3 floor");
                break;
            case 5:
                if (hasCard) {
                    System.out.println("5 floor");
                }else {
                    System.out.println("Access is denied");
                }
                break;
            default:
                System.out.println("Тhere is no such floor");
        }
    }
}
