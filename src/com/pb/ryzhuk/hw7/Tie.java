package com.pb.ryzhuk.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie() {
        super("Галстук", Size.XXS, "Голубий", 99.95);
    }

    @Override
    public void dressMan() {
        //    System.out.println("Мужчина одягає галстук.");
        System.out.printf("\nТип одягу: %s",
                "\nЦіна: %s USD" +
                        "\nРозмір: %s." +
                        "\nКолір: %s. ",
                name, price,
                size, color);
    }
}