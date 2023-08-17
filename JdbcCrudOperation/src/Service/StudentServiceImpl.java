package Service;
import dto.Student;
public class StudentServiceImpl implements IStudentService {
    @Override
    public String addStudent(String sname, Integer sage, String saddress,Integer course_id) {

        stdDao = StudentDaoFactory.getStudentDao();
        return stdDao.addStudent(sname, sage, saddress);
    }

    @Override
    public Student searchStudent(Integer sid) {
        stdDao = StudentDaoFactory.getStudentDao();
        return stdDao.searchStudent(sid);

    }

    @Override
    public String updateStudent(Integer sid, String sname, Integer sage, String saddress,Integer course_id) {
        return null;
    }

    @Override
    public String deleteStudent(Integer sid) {

        stdDao = StudentDaoFactory.getStudentDao();
        return stdDao.deleteStudent(sid);
    }
}
