import java.util.Arrays;

public class Main {

    public static void changeValue(int value) {
        value = 22;
        System.out.println("value = " + value);
    } // Объявили метод changeValue, который принимает параметр типа int.

    public static void changeValue2(Integer value) {
        value = 22;
        System.out.println("value = " + value);
    }

    public static void changeValue3(Integer[] value) {
        value = new Integer[]{1,2};
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
    }

    public static void changeValue4(Integer[] value) {
        value[0] = 99;
    }

    public static void main(String[] args) {
        System.out.println("Задание 5:");
        int value = 33; // Объявили переменную типа int и присвоили ей значение 33.
        changeValue(value);
        System.out.println("value = " + value); // Значение переменной value не изменится, так как при передачи
        // её в метод changeValue, внутри метода changeValue создается новая переменная, которая
        // копирует значение переменной value.

        System.out.println("Задание 6:");
        Integer value2 = 33;
        changeValue2(value2);
        System.out.println("value2 = " + value2); // При передачи перерменной value2 в метод changeValue2
        // туда передается копия значния переменной объектного типо value2, то бишь копия ссылки(назовем её value)
        // value создается как копия value2, но является самостоятельной единицей
        // соответственно её(value) изменения никак не повлияют на значение value2.

        // Значения переменной int value и Integer value2 остались неизменными
        // так как в обоих методах мы присваивали новые значения их копиям.
        // Но в случае с объектами нужно помнить, что если в методе мы не присвоим новый объект копии ссылки
        // а изменим текущий объект, то этот объект поменяется и по ссылке в переменной вне метода
        // так как они ссылаются на один и тот же объект.

        System.out.println("Задание 7:");
        Integer[] value3 = new Integer[]{3,4};
        changeValue3(value3);
        System.out.println("Arrays.toString(value3) = " + Arrays.toString(value3));
        // В данном задании ситуация аналогичная той, что в задании №6.
        // Массив типа Integer также является объектом, и в метод changeValue3 передается копия значения(ссылка)
        // переменной value3. А так как копия является самостоятельной единицей
        // то присваивание ей нового значения, не повлияет на значения переменной вне метода(переданая в этот метод).

        System.out.println("Задание 8:");
        Integer[] value4 = new Integer[]{3,4};
        System.out.println("Arrays.toString(value4) = " + Arrays.toString(value4));
        changeValue4(value4);
        System.out.println("Arrays.toString(value4) = " + Arrays.toString(value4));
        // В данном случае в метод changeValue4 также передается копия значения(ссылка)
        // переменной value4, но в отличии от прошлого задания, где мы присваивали новой объект
        // копии ссылки, в этом задании мы изменяем текущий объект
        // а точнее первую ячейку массива. А так как ссылка и её копи ссылаются
    }
}