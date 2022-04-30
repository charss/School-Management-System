/**
 * This class is responsible for keeping the
 * the track of students fees, name, grade & fees
 * paid.
 */
public class Student {
  // Not going to alter student's name, id.
  private int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;

  /**
   * To create a new Student by initializing.
   * Fees for every student is $30,000.
   * Fees paid initially is 0.
   * 
   * @param id    id for the student: unique.
   * @param name  name of the student.
   * @param grade grade of the student.
   */
  public Student(int id, String name, int grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.feesTotal = 30000;
    this.feesPaid = 0;
  }

  /**
   * Used to update the student's grade
   * 
   * @param grade new grade of the student.
   */
  public void setGrade(int grade) {
    this.grade = grade;
  }

  /**
   * Keep adding the fees to feesPaid Field.
   * Add the fees to the fees paid.
   * The school is going to receive the funds.
   * 
   * @param fees the fees that the student pays.
   */
  public void payFees(int fees) {
    this.feesPaid += fees;
    School.updateTotalMoneyEarned(this.feesPaid);
  }

  /**
   * 
   * @return id of the student
   */
  public int getId() {
    return this.id;
  }

  /**
   * 
   * @return name of the student
   */
  public String getName() {
    return this.name;
  }

  /**
   * 
   * @return grade of the student
   */
  public int getGrade() {
    return this.grade;
  }

  /**
   * 
   * @return fees paid by the student
   */
  public int getFeesPaid() {
    return this.feesPaid;
  }

  /**
   * 
   * @return the total fees paid by the student
   */
  public int getFeesTotal() {
    return this.feesTotal;
  }

  /**
   * 
   * @return the student's remaining fees
   */
  public int getRemainingFees() {
    return this.feesTotal - this.feesPaid;
  }

  @Override
  public String toString() {
    return "Student's name: " + this.name +
        ", Total fees paid so far $" + this.feesPaid;
  }

}