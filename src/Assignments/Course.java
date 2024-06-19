package Assignments;

public class Course extends Student {

        static int [] students = new int[100] ;
        static int studentCount = 0;

      public Course(String name, int[] grades) {
        super(name, grades);
    }


    public static Student addStudent(Student addStudent){

           studentCount++;
        return addStudent;
    }

        public static int getHighestGrade(){
            int highestGrade = grades[0];

            for (int i = 0; i < grades.length; i++) {

                if (grades[i] > highestGrade)
                    highestGrade = grades[i];

            }
            return highestGrade;
        }



        public static int getLowestGrade(){
            int lowestGrade = grades[0];

            for (int i = 0; i < grades.length; i++) {

                if (grades[i] < lowestGrade)
                    lowestGrade = grades[i];
            }

            return lowestGrade;
        }

        public static void printStudentDetails(){
            System.out.println("Highest grade : "+ getHighestGrade());
            System.out.println("Lowest grade : " + getLowestGrade());
            System.out.println("Total students in class : " + studentCount);


        }


}
