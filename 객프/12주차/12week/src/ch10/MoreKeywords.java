package ch10;

public class MoreKeywords {
	public static void main(String[] args) {
        Item item2 = new Item();
        System.out.printf("[%s](%d 골드) 생성 완료\n", item2.name, item2.price);
    }
}

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Item() {
        this("이름 없음", -1);
    }
}