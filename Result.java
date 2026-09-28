
class Result {

    public int add(int english, int math, int science) {
        return english + math + science;

    }
    public static void main(String[] args) {
        Result result = new Result();
        int totalMarks = result.add(85, 90, 95);
        System.out.println("Total Marks: " + totalMarks);
    }
}
