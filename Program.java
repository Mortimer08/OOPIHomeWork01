/*
 * Реализовать класс товар, содержащий следующие свойства:
v 1. Название     v
v 2. Цена         v
v 3. Количество   v
v 4. Единица измерения        v
А так же реализовать следующие классы-наследники:
v 1. Продукты питания, содержащие следующие свойства:     v
v 1.1 Срок годности
v 2. Напитки, содержащие следующие свойства:
v 2.1 Объём
v 3. Предметы гигиены, содержащие следующие свойства:
v 3.1 Количество штук в упаковке
v 4. Детские товары:
v 4.1 Минимальный возраст
v 4.2 Гипоаллергенность,

А так же реализовать слеюущие классы, наследуемые от приведённых выше классов
(надеюсь сами разберётесь от каких именно):
v 5. Молоко, содержащиее следующее свойство:
v 5.1 Процент жирности
v 5.2 Срок годности
v 6. Лимонад
v 7. Хлеб, содержащий следующие свойство:
v 7.1 Тип муки
v 8. Яйца, содержащее следующиее свойство:
v 8.1 Количество в упаковке
v 9. Маски
v 10. Туалетная бумага, содержащее следующее свойство:
v 10.1 Количество слоёв
v 11. Подгузники, содержащие следующее свойства:
v 11.1 Размер
v 11.2 Минимальный вес
v 11.3 Максимальный вес
v 11.4 Тип
v 12. Соска
У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, принемающие все поля.

Реализовать в классе Program, метод выводящий все данные о товаре.
Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program
 */
public class Program {

    public static void main(String[] args) {
        Product rice = new Food("Рис", 50, 50, "кг", "2025-01-01");

        Product toy = new KidsGood("Конструктор", 250, 10, "штуки", 6, true);
        Product coldTea = new Drink("Холодный чай", 100, 54, "банка", 1.0);
        Hygiene blades = new Hygiene("Лезвия для бритвы", 56, 43, "упаковка", 5);
        Product firstTaste = new Milk("Молоко 'Первый вкус'", 70, 45, "пакет", 1.0, 3.2, "2023-03-15");
        Product simplyCola = new Soda("Просто кола", 46, 23, "бутылка", 2.0);
        Product bun = new Bread("Слойка", 25, 10, "штуки", "2023-03-20", "Высший сорт");
        Product sunnyEggs = new Eggs("Яйца Солнышки", 80, 23, "упаковка", "2023-04-01", 10);
        Product antiFlu = new FaceMask("Маски 'Против гриппа'", 15, 57, "упаковка", 5);
        Product zeva = new ToiletPaper("ТБ 'Зёва'", 200, 203, "упаковка", 3);
        Product pampers = new Nappy("Подгузники 'Хамперс'", 1000, 231, "упаковка", 1, true, 3, 6, 10, "многоразовые");
        Product sos = new Pacifier("Сосулька", 150, 23, "штуки", 0, true);
        showProductDescription(rice);
        showProductDescription(toy);
        showProductDescription(coldTea);
        showProductDescription(blades);
        showProductDescription(firstTaste);
        showProductDescription(simplyCola);
        showProductDescription(bun);
        showProductDescription(sunnyEggs);
        showProductDescription(antiFlu);
        showProductDescription(zeva);
        showProductDescription(pampers);
        showProductDescription(sos);
    }

    public static void showProductDescription(Product product) {
        System.out.println("-----------------------");
        System.out.println(product.toString());
        System.out.println("-----------------------");
    }
}
