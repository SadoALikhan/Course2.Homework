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

    public static void changePerson(Person person) {
        person = new Person("Lagutenko", "Ilya");
        System.out.println("person.toString() = " + person.toString());
    }

    public static void changePerson2(Person person) {
        person.setSurname("Lagutenko");
        person.setName("Ilya");
        System.out.println("person.toString() = " + person.toString());
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
        // Но в случае с объектами нужно помнить, что если в методе мы не присвоим копии ссылки новый объект
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
        // переменной value4, но в отличии от прошлого задания, где мы присваивали копии ссылки новой объект
        // в этом задании мы изменяем текущий объект, а точнее первую ячейку массива.
        // А так как ссылка в переменной вне метода и её копия в методе ссылаются на один объект
        // то и в объекте по ссылке из переменной вне метода тоже изменится первая ячейка.

        // В первом случае(задание 7) мы присвоили копии ссылки переменной вне метода новое значение(объект)
        // соответственно значение(объект) переменоой вне метода остается преждним.
        // Во втором же случае(задание 8) мы изменили текущий объект копии ссылки переменной вне метода
        // соответсвенно значение(объект) переменной вне метода также изменится.

        System.out.println("Задание 9:");
        Person person = new Person("Trubetskoy", "Lyapis");
        changePerson(person);
        System.out.println("person.toString() = " + person.toString());
        // Переменная Person также является объектом, и в метод changePerson передается копия значения(ссылка)
        // переменной person. А так как копия является самостоятельной единицей
        // то присваивание ей нового значения, не повлияет на значения переменной вне метода(переданая в этот метод).

        System.out.println("Задание 10:");
        Person person1 = new Person("Trubetskoy", "Lyapis");
        System.out.println("person1.toString() = " + person1.toString());
        changePerson2(person1);
        System.out.println("person1.toString() = " + person1.toString());
        // В данном случае в метод changePerson2 также передается копия значения(ссылка)
        // переменной person1, но в отличии от прошлого задания, где мы присваивали копии ссылки новой объект
        // в этом задании мы изменяем текущий объект, а точнее строки name и surname.
        // А так как ссылка в переменной вне метода и её копия в методе ссылаются на один объект
        // то и в объекте по ссылке из переменной вне метода тоже изменится первая ячейка.

        // В задании №9 мы присвоили копии ссылки переменной вне метода новое значение(объект)
        // соответственно значение(объект) переменоой вне метода остается преждним.
        // В задании №10 мы изменили текущий объект копии ссылки переменной вне метода
        // соответсвенно значение(объект) переменной вне метода также изменится.
    }
}