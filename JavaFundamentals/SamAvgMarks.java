public class SamAvgMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int totalMarks = maths + physics + chemistry;
        double average = totalMarks / 3.0;  // Use 3.0 to get decimal average

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
