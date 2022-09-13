package school.managment.system;



/**
 * 
 *Classe responsabile di tenere traccia dei nomi degli insegnanti, id e stipendi
*/
public class Teacher {
    private int id;
    private String name;
    private int salary;


/**
 * Costruttore che crea un nuovo oggetto Teacher.
 * @param id id for the teacher.
 * @param name of the teacher.
 * @param salary of the teacher.
 */
    public Teacher (int id, String name, int salary){
        this.salary = salary;
        this.id = id;
        this.name = name;

    }

/**
 * 
 * @return id of teacher
 */
    public int getId(){
        return id;

    }

/**
 * 
 * @return name of teacher
 */
    public String getName (){
        return name;

    }

/**
 * 
 * @return the salary of teacher
 */
    public int getSalary(){
        return salary;

    }

/**
 * set the salary
 * @param salary
 */
    public void setSalary(int salary){
        this.salary = salary;
    }
   
}

