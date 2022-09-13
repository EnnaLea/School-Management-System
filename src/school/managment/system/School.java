package school.managment.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students using an ArrayList.
 */
public class School {
    
    
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;


    // per generare costruttori automaticamente: CTRl + .
    /**
     * new school objects is created.
     * @param teachers list of teachers.
     * @param students list of students.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

/**
 * 
 * @return the list of teachers
 */
    public List<Teacher> getTeachers() {
        return teachers;
    }

/**
 * Adds teachers to the school.
 * @param teacher to be added 
 */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

/**
 * 
 * @return the list of students.
 */
    public List<Student> getStudents() {
        return students;
    }

/**
 * Adds a students to the school.
 * @param student to added.
 */
    public void addStudents(Student student) {
        students.add(student);
    }

/**
 * 
 * @return the total money earned by the school.
 */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

/**
 * Adds the total money earned by the school.
 * @param totalMoneyEarned that is to be added.
 */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned = MoneyEarned;
    }

/**
 * 
 * @return the money spent by the school.
 *  */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

/**
 * Update the money spent by the school
 * @param MoneySpent the money used to pay salary of teachers.
 */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    


    
    


  
    

}
 