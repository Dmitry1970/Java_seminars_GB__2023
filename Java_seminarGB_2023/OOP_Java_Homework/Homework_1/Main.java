public class Main {
    public static void main(String[] args) {
        Product foodProduct = new FoodProducts("Томаты маринованные", 120.12, 1, "штук", "23.12.2025");
        Product beverage = new Beverages("Fanta", 25.00, 1, "бутылка", 1.0);
        Product bread = new Bread("Московский", 25.10, 1, "буханка", "3 дня", "пшеничная");
        Product childrenProduct = new ChildrensProducts("игрушка", 220.00, 1, "штука", 5, "да");
        ChildrensProducts diapers = new Diapers("Подгузники детские", 850.00, 12, "штук", 1, "да", 6, 4.50, 10.0,
                "влаговпитывающие");
        FoodProducts eggs = new Eggs("куриные яйца", 150.00, 1, "упаковка", "20.03.2023", 30);
        Product hygieneProduct = new HygieneProducts("прокладки женские", 110.00, 1, "упаковка", 12);
        FoodProducts lemonade = new Lemonade("Дюшес", 85.00, 1, "бутылка", "15.05.2023");
        Product masks = new Masks("Маска для лица", 240.00, 1, "упаковка", 10);
        FoodProducts milk = new Milk("Домик в деревне", 85.00, 1, "пакет", "01.09.2023", 3.5);
        ChildrensProducts nipple = new Nipple("соска детская", 130.00, 1, "штука", 0, "да");
        HygieneProducts toiletPaper = new ToiletPaper("Zewa", 80.00, 1, "упаковка", 8, 3);
        Program.printInfo(foodProduct);
        Program.printInfo(beverage);
        Program.printInfo(bread);
        Program.printInfo(childrenProduct);
        Program.printInfo(diapers);
        Program.printInfo(eggs);
        Program.printInfo(hygieneProduct);
        Program.printInfo(lemonade);
        Program.printInfo(masks);
        Program.printInfo(milk);
        Program.printInfo(nipple);
        Program.printInfo(toiletPaper);
    }
}
