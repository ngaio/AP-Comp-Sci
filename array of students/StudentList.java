
/**
 * <<< This Class is NOT complete >>>
 * 
 * Here is the output of the complete code:
 * 
 * Name: Jim Average: 80
 * Name: Sue Average: 98
 * Name: Bob Average: 74
 * Name: Liz Average: 77
 * Name: Lee Average: 68
 * Name: Tom Average: 91
 * Name: Kim Average: 85
 * Name: Lou Average: 84
 * Name: Jan Average: 81
 * 
 * 
 * Name: Jim Average: 80
 * Name: Sue Average: 98
 * Name: Bob Average: 74
 * Name: Liz Average: 77
 * Name: Lee Average: 68
 * Name: Ned Average: 82
 * Name: Tom Average: 91
 * Name: Kim Average: 85
 * Name: Lou Average: 84
 * Name: Jan Average: 81
 * 
 *  Highest Average: Name: Sue Average: 98
 * 
 *  Class Average: 82.0
 * 
 */
public class StudentList 
{  
    private Student[] students;

    public StudentList(Student[] s) {
        students = s;
    }    

    /*** <<< This method is NOT complete >>>
     * prints all of the students in the class and their averages
     ***/ 
    public void printStudents() 
    {       
        for (int x = 0; x < students.length; x++){
            if (students[x] != null){
                System.out.println("name: " + students[x].getName() + " average: " + 
                    students[x].getAverage()); 
            }
        }
    }

    /*** <<< This method is NOT complete >>>
     * add a new student at first empty (null) position in the array
     * if there are no empty positions then the student does not get added
     ***/ 
    public void addStudent(String newName, int newGrade) 
    {       
        boolean stop = false;
        for (int x = 0; x < students.length; x++){
            if (students[x] == null && stop == false){
                students[x] = new Student(newName,newGrade);
                stop = true;
            }
        }
    }

    /*** <<< This method is NOT complete >>>
     * returns the class average
     ***/ 
    public double classAverage() 
    {       
        double sum = 0.0;
        int numberofstudents = 0;
        for (int x = 0; x < students.length; x++){
            if (students[x] != null){
                int studentAverage = students[x].getAverage();
                sum += studentAverage; 
                numberofstudents++;
            }
            
        }
        return sum/numberofstudents; 
    }

    /*** <<< This method is NOT complete >>>
     * returns the student in the class with the highest average
     ***/ 
    public Student getHighAve() 
    {
        int beststudent = students[0].getAverage();
        int y = 0;
        for (int x = 0; x < students.length; x++){
            if (students[x] != null && students[x].getAverage() > beststudent){
                beststudent = students[x].getAverage();
                y = x;
            }
        }
        return students[y];
    }

    /**
     * The main method is complete.  
     * Note that compSciStudent is an array of Student objects!
     */
    public static void main(String[] args)
    {
        Student[] compSciStudent = new Student[11];
        compSciStudent[0] = new Student("Jim",80);
        compSciStudent[1] = new Student("Sue",98);
        compSciStudent[2] = new Student("Bob",74);
        compSciStudent[3] = new Student("Liz",77);
        compSciStudent[4] = new Student("Lee",68);
        compSciStudent[5] = null;  // Student dropped the class
        compSciStudent[6] = new Student("Tom",91);
        compSciStudent[7] = new Student("Kim",85);
        compSciStudent[8] = new Student("Lou",84);
        compSciStudent[9] = new Student("Jan",81);
        compSciStudent[10] = null;  // Student dropped the class

        StudentList s = new StudentList(compSciStudent);

        s.printStudents();
        s.addStudent("Ned",82);  

        System.out.println("\n");
        s.printStudents();

        System.out.println("\n Highest Average: " + s.getHighAve());
        System.out.println("\n Class Average: " + s.classAverage());

    }
}