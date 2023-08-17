package Persistence;
import dto.Student;
public interface IStudentDao {
    public String addStudent(String sname, Integer sage, String saddress,Integer course_id);

    public Student searchStudent(Integer sid);

    public String updateStudent(Integer sid, String sname, Integer sage, String saddress,Integer course_id);

    public String deleteStudent(Integer sid);

}
