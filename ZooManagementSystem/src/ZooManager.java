import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZooManager {
    static ArrayList<Animal> animalList = new ArrayList<Animal>();
    static ArrayList<Animal> aquariumAnimals = new ArrayList<Animal>();
    static ArrayList<Animal> aviaryAnimals = new ArrayList<Animal>();
    static ArrayList<Animal> jungleAnimals = new ArrayList<Animal>();
    static ArrayList<Animal> savannahAnimals = new ArrayList<Animal>();
    static ArrayList<Animal> otherAnimals = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        animalList.add(new Monkey("monkey", 2, 34.0, 3));
        animalList.add(new Ape("ape", 5, 50.5, 3));

        System.out.println("Welcome to Zoo Management System! ");
        runApp();
        exitApp();

    }

    public static void runApp() {

        Scanner uScanner = new Scanner(System.in);
        int r_usrInt = 0;

        System.out.println("Please Select your option: ");

        System.out.println("1: Add new Animal");
        System.out.println("2: View Animals");
        System.out.println("3: Expel an Animal");
        System.out.println("4: Inspect Animals");
        System.out.println("5: Exit System");
        r_usrInt = uScanner.nextInt();
        System.out.println("Processing choice .... ");
        System.out.println("----------------------------------------- ");

        switch (r_usrInt) {

            case 0:

                runApp();
            case 1:
                System.out.println("New type of animal entered the zoo!");
                enterNewAnimal();

                break;

            case 2:

                viewControl();

                break;

            case 3:
                expellAnimal();
                break;

            case 4:
                inspectAnimals();
                break;

            case 5:

                System.out.println("Exiting the system, Goodbye ...");
                System.out.println("----------------------------------------- ");
                break;

            default:
                System.out.println("The option can't be process, try again...");
                System.out.println("----------------------------------------- ");

                runApp();
                break;
        }

    }

    public static void enterNewAnimal() {

        System.out.println("----------------------------------------- ");
        Scanner uScanner1 = new Scanner(System.in);

        int usrIn = 0;
        String $usrIn = "unidentified";

        double _usrIn = 0.0;

        System.out.println("Enter new animal as it is called (You cannot name it with spaces): ");
        try {
            $usrIn = uScanner1.next();
        } catch (InputMismatchException e) {

            System.out.println("Please use underscore for spaces..");
            enterNewAnimal();
        }

        System.out.println("Enter new animal's age (Months): ");

        try {
            usrIn = uScanner1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number..");
            enterNewAnimal();
        }

        System.out.println("Enter new animal's weight (Kilograms): ");

        try {
            _usrIn = uScanner1.nextDouble();
        } catch (InputMismatchException e) {

            System.out.println("Please enter a whole number and/or decimal number only..");
        }

        System.out.println("Enter new animal's ability: ");
        System.out.println("1: Can fly");
        System.out.println("2: Can swim");
        System.out.println("3: Can climb");
        System.out.println("0: No ability");

        int t_userIn = 0;
        try {
            t_userIn = uScanner1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number in range only.");
        }

        System.out.println("Enter new animal's family type: ");
        System.out.println("1: Mammal");
        System.out.println("2: Bird");
        System.out.println("3: Fish");
        System.out.println("4: Reptile");
        System.out.println("5: Primate");
        System.out.println("6: Monkey");
        System.out.println("7: Ape");

        System.out.println("0: None of these");
        int s_userIn = 0;
        try {
            s_userIn = uScanner1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a whole number in range only.");
        }

        System.out.println("Processing choice .... ");
        System.out.println("----------------------------------------- ");

        addAnimalTolist($usrIn, usrIn, _usrIn, t_userIn, s_userIn);

        runApp();

    }

    public static void addAnimalTolist(String name, int age, double weight, int ability, int family) {
        switch (family) {
            case 1:

                // jungleAnimals.add(new Mammal(name, age, weight, ability));
                animalList.add(new Mammal(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;

            case 2:
                // aviaryAnimals.add(new Bird(name, age, weight, ability));
                animalList.add(new Bird(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;

            case 3:
                // aquariumAnimals.add(new Fish(name, age, weight, ability));
                animalList.add(new Fish(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;

            case 4:
                // jungleAnimals.add(new Reptile(name, age, weight, ability));
                animalList.add(new Reptile(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;

            case 5:
                // jungleAnimals.add(new Reptile(name, age, weight, ability));
                animalList.add(new Primate(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;

            case 6:
                // jungleAnimals.add(new Reptile(name, age, weight, ability));
                animalList.add(new Monkey(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;
            case 7:
                // jungleAnimals.add(new Reptile(name, age, weight, ability));
                animalList.add(new Ape(name, age, weight, ability));
                System.out.println("added an animal successfully..");
                System.out.println("----------------------------------------- ");
                break;

            default:
                System.out.println("not added an animal..");
                System.out.println("----------------------------------------- ");
                break;
        }
    }

    public static void viewControl() {

        aquariumAnimals.clear();
        aviaryAnimals.clear();
        savannahAnimals.clear();
        otherAnimals.clear();
        jungleAnimals.clear();

        update();

        Scanner uScanner2 = new Scanner(System.in);
        System.out.println("Please select an area to look for animals..");
        System.out.println("Please select 0 for cancel.");
        System.out.println("1: All animals");
        System.out.println("2: Aviary");
        System.out.println("3: Aquarium");
        System.out.println("4: Jungle");
        System.out.println("5: Savannah");
        System.out.println("6: Other");

        int res = uScanner2.nextInt();
        System.out.println("processing...");
        System.out.println("----------------------------------------- ");

        switch (res) {
            case 1:
                viewAllanimals();
                viewControl();
                break;

            case 2:
                viewAllanimalsOnAviary();
                viewControl();
                break;

            case 3:
                viewAllanimalsOnAquarium();
                viewControl();
                break;

            case 4:
                viewAllanimalsOnJungle();
                viewControl();
                break;

            case 0:
                runApp();
                break;

            case 5:
                viewAllanimalsOnSavannah();
                viewControl();
                break;

            case 6:
                viewAllanimalsOnOthers();
                viewControl();
                break;

            default:
                System.out.println("cannot process..");
                System.out.println("----------------------------------------- ");
                viewControl();
                break;
        }

    }

    public static void viewAllanimals() {
        System.out.println("----------------------------------------- ");
        int x = 1;
        for (Animal map : animalList) {

            System.out.println(x + " " + map.name + " " + map.getClass());

            x++;
        }
        System.out.println("----------------------------------------- ");
    }

    public static void viewAllanimalsOnAquarium() {
        System.out.println("----------------------------------------- ");
        int x = 1;
        for (Animal map : aquariumAnimals) {

            System.out.println(x + " " + map.name);
            x++;
        }
        System.out.println("----------------------------------------- ");
    }

    public static void viewAllanimalsOnJungle() {
        System.out.println("----------------------------------------- ");
        int x = 1;
        for (Animal map : jungleAnimals) {

            System.out.println(x + " " + map.name);
            x++;
        }
        System.out.println("----------------------------------------- ");

    }

    public static void viewAllanimalsOnAviary() {
        System.out.println("----------------------------------------- ");
        int x = 1;
        for (Animal map : aviaryAnimals) {

            System.out.println(x + " " + map.name);
            x++;
        }
        System.out.println("----------------------------------------- ");

    }

    public static void viewAllanimalsOnSavannah() {
        System.out.println("----------------------------------------- ");
        int x = 1;
        for (Animal map : savannahAnimals) {

            System.out.println(x + " " + map.name);
            x++;
        }
        System.out.println("----------------------------------------- ");

    }

    public static void viewAllanimalsOnOthers() {
        System.out.println("----------------------------------------- ");
        int x = 1;
        for (Animal map : otherAnimals) {

            System.out.println(x + " " + map.name);
            x++;
        }
        System.out.println("----------------------------------------- ");

    }

    public static void inspectAnimals() {
        Scanner inspector = new Scanner(System.in);
        System.out.println("Choose an animal to inspect : ");
        System.out.println("(enter 0 to back/cancel)");
        viewAllanimals();
        int result = inspector.nextInt();
        System.out.println("processing....");
        System.out.println("----------------------------------------- ");
        if (result == 0) {
            runApp();

        } else {

            Animal animPicked = animalList.get(result - 1);
            System.out.println("----------------------------------------- ");
            System.out.println("Animal Picked Informations : ");

            System.out.println("Animal Name: " + animPicked.name);
            System.out.println("Animal Age: " + animPicked.age + " months");
            System.out.println("Animal Weight: " + animPicked.weight + " Kg.");
            System.out.println(animPicked.getClass());
            animPicked.checkAbility();
            System.out.println("----------------------------------------- ");
            abilityInspect(animPicked);
        }
    }

    public static void abilityInspect(Animal animal) {

        Scanner ability_ins = new Scanner(System.in);
        System.out.println("Choose an ability for animal to test: ");
        System.out.println("1. Eat (Feed the animal)");
        System.out.println("2. Sleep (Inject tranquilizer)");
        System.out.println("3. Make a Sound (Challenge the animal to make a sound)");
        System.out.println("4. Fly (Make the animal fly)");
        System.out.println("5. Swim (Make the animal swim)");
        System.out.println("6. Climb (Make the animal climb)");

        System.out.println("(enter 0 to back)");

        int result = ability_ins.nextInt();
        System.out.println("processing....");
        System.out.println("----------------------------------------- ");

        switch (result) {
            case 0:
                System.out.println("----------------------------------------- ");
                runApp();

                break;
            case 1:
                animal.eat();
                System.out.println("----------------------------------------- ");
                break;
            case 2:
                animal.sleep();
                System.out.println("----------------------------------------- ");
                break;
            case 3:
                animal.makeSound();
                System.out.println("----------------------------------------- ");
                break;
            case 4:
                try {
                    Bird bAnimal = (Bird) animal;
                    bAnimal.fly();
                    System.out.println("----------------------------------------- ");
                } catch (ClassCastException e) {

                    System.out.println("This animal cannot fly..");
                    System.out.println("----------------------------------------- ");
                }

                break;
            case 5:
                try {
                    Fish fAnimal = (Fish) animal;
                    fAnimal.swim();
                    System.out.println("----------------------------------------- ");
                } catch (ClassCastException e) {

                    System.out.println("This animal can't swim..");
                    System.out.println("----------------------------------------- ");
                }

                break;
            case 6:
                try {

                    Monkey mAnimal = (Monkey) animal;
                    System.out.println("This animal is a monkey..");
                    mAnimal.climb();
                    System.out.println("----------------------------------------- ");

                } catch (ClassCastException e) {

                    System.out.println("This animal is not a monkey. ");
                    System.out.println("----------------------------------------- ");
                }

                try {

                    Ape mAnimal = (Ape) animal;
                    System.out.println("This animal is an ape.");
                    mAnimal.climb();
                    System.out.println("----------------------------------------- ");

                } catch (ClassCastException e) {

                    System.out.println("This animal is not an ape.. ");
                    System.out.println("----------------------------------------- ");
                }
                break;

            default:
                System.out.println("The animal did nothing...");
                System.out.println("----------------------------------------- ");

                break;
        }
        runApp();
    }

    public static void expellAnimal() {
        Scanner inspector = new Scanner(System.in);
        System.out.println("Choose an animal to expell : ");
        System.out.println("(enter 0 to cancel");
        viewAllanimals();
        int result = inspector.nextInt();
        System.out.println("processing....");
        System.out.println("----------------------------------------- ");
        if (result == 0) {
            runApp();

        } else {
            Animal tobedel = animalList.get(result - 1);
            animalList.remove(result - 1);

            System.out.println(tobedel.name + " has been expelled in the zoo...");
            System.out.println("----------------------------------------- ");
            runApp();
        }
    }

    public static void update() {

        for (Animal animal : animalList) {

            try {
                Fish f = (Fish) animal;
                aquariumAnimals.add(f);

            } catch (ClassCastException e) {
            }

            try {
                Bird f = (Bird) animal;
                aviaryAnimals.add(f);

            } catch (ClassCastException e) {

            }

            try {
                Reptile f = (Reptile) animal;
                savannahAnimals.add(f);

            } catch (ClassCastException e) {

            }

            try {
                Primate f = (Primate) animal;
                jungleAnimals.add(f);

            } catch (ClassCastException e) {

            }

            try {
                Mammal f = (Mammal) animal;
                otherAnimals.add(f);

            } catch (ClassCastException e) {

            }
        }
    }

    public static void exitApp() {

    }
}
