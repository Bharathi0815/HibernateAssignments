package Service;
import dto.Student;
public interface IStudentService {
    //operations to be implemented
    public String addStudent(String sname, Integer sage, String saddress,Integer course_id);

    public Student searchStudent(Integer sid);

    public String updateStudent(Integer sid, String sname, Integer sage, String saddress, Integer course_id);

    public String deleteStudent(Integer sid);
}
