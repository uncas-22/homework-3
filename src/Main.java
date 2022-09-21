public class Main {
    public static void main(String[] args) {
        System.out.println("homework-3 exercise 1");
        {
            //write your code here
            double dog = 8;
            System.out.println("dog"); System.out.println(dog);
            var cat = 3.6;
            System.out.println("cat"); System.out.println(cat);
            double paper = 763789;
            System.out.println("paper"); System.out.println(paper);
        System.out.println("homework-3 exercise 2");
            //write your code here
            dog = dog + 4;
            System.out.println("dog"); System.out.println(dog);
            cat = cat + 4;
            System.out.println("cat"); System.out.println(cat);
            paper = paper +4;
            System.out.println("paper"); System.out.println(paper);
        System.out.println("homework-3 exercise 3");
            //write your code here
            dog = dog - 3.5;
            System.out.println("dog"); System.out.println(dog);
            cat = cat - 1.6;
            System.out.println("cat"); System.out.println(cat);
            paper = paper - 7639;
            System.out.println("paper"); System.out.println(paper);
        System.out.println("homework-3 exercise 4");
            var friend = 19;
            System.out.println("friend"); System.out.println(friend);
            friend = friend * 2;
            System.out.println("friend"); System.out.println(friend);
            friend = friend / 7;
            System.out.println("friend"); System.out.println(friend);
        System.out.println("homework-3 exercise 5");
            var frog = 3.5;
            System.out.println("frog " + "= " + frog);
            frog = frog * 10;
            System.out.println("frog " + "= " + frog);
            frog = frog / 3.5;
            System.out.println("frog " + "= " + frog);
            frog = frog + 4;
            System.out.println("frog " + "= " + frog);
        System.out.println("homework-3 exercise 6");
            var boxersWeightFirst = 78.2;
            var boxersWeightSecond = 82.7;
            var boxersWeightTwo = boxersWeightFirst + boxersWeightSecond;
            System.out.println("Общий вес боксеров " + boxersWeightTwo + " кг");
            var boxersWeightDifference = boxersWeightFirst - boxersWeightSecond;
            System.out.println("Разница в весе боксеров " + boxersWeightDifference + " кг");
            System.out.println("homework-3 exercise 7");
            var boxersWeightDifference2 = boxersWeightSecond - boxersWeightFirst;
            System.out.println("Первый способ. Второй боксер тяжелее на " + boxersWeightDifference2 + " кг");
            var boxersWeightDifference3 = boxersWeightSecond % boxersWeightFirst;
            System.out.println("Второй способ. Второй боксер тяжелее на " + boxersWeightDifference3 + " кг");
            System.out.println("homework-3 exercise 8");
            var workingHoursTotal = 640;
            var workingHoursDay = 8;
            var namberEmployees = workingHoursTotal / workingHoursDay;
            System.out.println("Всего работников в компании " + namberEmployees + " чел.");
            var namberEmployees2 = namberEmployees + 94;
            var workingHoursTotal2 = namberEmployees2 * 8;
            System.out.println("Если в компании работает " + namberEmployees2 + " чел., то всего " + workingHoursTotal2 +
                    " часов работы может быть поделено между сотрудниками");
        }
        }
    }