public class StudentGrades {
    public static void main(String[] args) {

        System.out.println("////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////");


        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");


        printStudent("Raj",       50, 7);
        printStudent("Avi",       49, 8);
        printStudent("Srijan",    39, 10);



        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void printStudent(String name, int labPoints, int bonusPoints) {
        int totalPoints = labPoints + bonusPoints;
        System.out.println(name + "\t\t" + labPoints + "\t" + bonusPoints + "\t" + totalPoints);
    }
}