package competitive_programming.level_1;

public class PenDistribution {
    public static void penDistribution() {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }
    public static void main(String[] args) {
        penDistribution();
    }
    
}
