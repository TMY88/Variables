public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2(){
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3(){
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
    }
    public static void task5() {
        var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }
    public static void task6() {
        var firsboxerWeight = 78.2;
        var secondboxerWeight=82.7;
        var totalboxerWeight=firsboxerWeight+secondboxerWeight;
        System.out.println("Общий вес двух бойцов "+totalboxerWeight+" кг");

        var differenceWeight=secondboxerWeight-firsboxerWeight;
        System.out.println("Разница в весе между бойцами "+differenceWeight+" кг");
    }
    public static void task7() {
        var firsboxerWeight = 78.2;
        var secondboxerWeight=82.7;
        var differenceWeight=secondboxerWeight-firsboxerWeight;
        System.out.println("Разница в весе между бойцами "+differenceWeight+" кг");

        var differenceboxerWeight=secondboxerWeight%firsboxerWeight;
        System.out.println("Разница в весе между бойцами "+differenceboxerWeight+" кг");
    }
    public static void task8() {
        var totalworkTime=640;
        var onewokerTime=8;
        var workersNumbers=totalworkTime/onewokerTime;
        System.out.println("Всего работников в компании — "+workersNumbers+" человек");

        workersNumbers=workersNumbers+94;
        totalworkTime=workersNumbers*onewokerTime;
        System.out.println("Если в компании работает "+workersNumbers+" человек, то всего "+totalworkTime+" часов работы может быть поделено между сотрудниками!");
    }
}