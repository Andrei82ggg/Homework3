public class Main {
    public static void main(String[] args) {
        byte a=67;
        System.out.println("Значение переменной a с типом byte равно "+a);
        int b=27897;
        System.out.println("Значение переменной b с типом int равно "+b);
        short c=-159;
        System.out.println("Значение переменной c с типом short равно "+c);
        short d=569;
        System.out.println("Значение переменной d с типом short равно "+d);
        long e=987678965546L;
System.out.println("Значение переменной e с типом long равно "+e);
float i=27.12f;
System.out.println("Значение переменной e с типом floet равно "+i);
float k=2.786f;
System.out.println("Значение переменной e с типом floet равно "+k);

    byte ludmila=23;
    byte anna=27;
    byte ekaterina=30;
    int allTeacher=(ludmila + anna + ekaterina);
    System.out.println(allTeacher);
    int listAll=480;
    float listOneL =listAll/allTeacher;
    System.out.println("На каждого ученика рассчитано "+listOneL+ "листов бумаги");

    byte prodmashin=16;
    System.out.println("Производительность машины за две минуты "+prodmashin+ "бутылок");
    int twentyMin=prodmashin*10;
    System.out.println("Производительность машины за двадцать минут "+twentyMin+ "бутылок");
    int day=24*60/2*prodmashin;
    System.out.println("Производительность машины за сутки  "+day+ "бутылок");
    int treeday=day*3;
    System.out.println("Производительность машины за три дня "+treeday+ "бутылок");
    int month=day*30;
    System.out.println("Производительность машины за месяц "+month+ "бутылок");

    int allBank=120;
    int oneClassWhite=2;
    int oneClassBrown=4;
    int allClass=allBank/(oneClassBrown+oneClassWhite);
    System.out.println("Всего классов "+allClass);
    int whiteBank=allClass*oneClassWhite;
    int brownBank=allClass*oneClassBrown;
    System.out.println("В школе, где "+allClass+"классов, нужно "+whiteBank+"банок белой краски и "+brownBank+"банок коричневой краски");

    int banan=80;
    int fiveBanan=banan*5;
    int milkSto=105;
    int milkTwo=milkSto*2;
    int ice=100;
    int iceTwo=ice*2;
    int egg=70;
    int eggFour=egg*4;
    int weightGram=fiveBanan+milkTwo+iceTwo+eggFour;
    float weightKilo=weightGram/1000f;
    System.out.println("Завтрак спортсмена "+weightGram+"грамм "+weightKilo+"килограмм");

    int veight=7;
    int veightOne=250;
    int veightTwo=500;
    int dayOne=veight*1000/veightOne;
    System.out.println("Уйдет "+dayOne+"если спортсмен будет терять по 250 гр ежедневно");
    int dayTwo=veight*1000/veightTwo;
    System.out.println("Уйдет "+dayTwo+"если спортсмен будет терять по 500 гр ежедневно");
    int averege=(dayOne+dayTwo)/2;
    System.out.println("Понадобится "+averege+"дней в среднем, чтобы добиться результата похудения.");

    int masha=67760;
    int denis=83960;
    int cristina=76230;
    int mashaUp=masha/100*10+masha;
        int denisUp=denis/100*10+denis;
    int cristinaUp=cristina/100*10+cristina;
    int zp=masha+denis+cristina;
    int zpUp=mashaUp+denisUp+cristinaUp;
    int zpYers=zpUp-zp;
    int difMasha=mashaUp-masha;
    int difDenis=denisUp-denis;
    int difCristina=cristinaUp-cristina;
    System.out.println("Маша теперь получает " +mashaUp+" рублей. Годовой доход вырос на " +difMasha+" рублей");
    System.out.println("Денис теперь получает " +denisUp+" рублей. Годовой доход вырос на " +difDenis+" рублей");
    System.out.println("Кристина теперь получает " +cristinaUp+" рублей. Годовой доход вырос на " +difCristina+" рублей");

    
    }
}