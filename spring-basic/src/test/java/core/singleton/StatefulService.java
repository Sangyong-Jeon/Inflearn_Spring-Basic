package core.singleton;

public class StatefulService {

    private int price; //상태를 유지하는 필드

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; //여기가 문제이므로 공유필드를 사용하지 말고 바로 price를 반환해줘야함
    }

    public int getPrice() {
        return price;
    }
}
