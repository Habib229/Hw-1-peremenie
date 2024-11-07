public class Main {
    public static void main(String[] args) {
        System.out.println("Домашние задание по пременым 1");
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println();

        System.out.println("Задание 2");
        dog = dog * 4;
        System.out.println(dog);
        cat = cat * 4;
        System.out.println(cat);
        paper = paper * 4;
        System.out.println(paper);

        System.out.println();

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println();

        System.out.println("Задание 4");
        var fried = 19;
        System.out.println(fried);
        fried = fried + 2;
        System.out.println(fried);
        fried = fried / 7;
        System.out.println(fried);

        System.out.println();

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println();

        System.out.println("Задание 6");
        var weightOfOneBoxer = 78.2;
        System.out.println("Масса одного боксера " + weightOfOneBoxer + " кг");
        var theWeightOfTheSecondBoxer = 82.7;
        System.out.println("Масса второго боксера " + theWeightOfTheSecondBoxer + " кг");
        var theTotalWeightOfTheTwoFighters = weightOfOneBoxer + theWeightOfTheSecondBoxer;
        System.out.println("Общая масса двух бойцов = " + theTotalWeightOfTheTwoFighters + " кг");
        var theDifferenceBetweenTheMassesOfFighters = theWeightOfTheSecondBoxer -  weightOfOneBoxer;
        System.out.println("Разница между массами бойцов = " + theDifferenceBetweenTheMassesOfFighters + " кг");

        System.out.println();

        System.out.println("Задание 7");
        var remains = theWeightOfTheSecondBoxer % weightOfOneBoxer;
        System.out.println(remains);

        System.out.println();

        System.out.println("Задание 8");
        System.out.println("1");
        var workingHours = 640;
        var employeesWorkingHours = 8;
        var employeesInTheCompany = workingHours / employeesWorkingHours;
        System.out.println("Всего работников в компании " + employeesInTheCompany + " человек");
        System.out.println("2");
        employeesInTheCompany = employeesInTheCompany + 94;
        var newWorkingHoursForEmployees = workingHours / employeesInTheCompany;
        System.out.println("Если в компании работает " + employeesInTheCompany + " человек, то всего " + newWorkingHoursForEmployees + " часов работы может быть поделено между сотрудниками");

        System.out.println();
    }
}