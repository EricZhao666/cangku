
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public class StudentDao {
    private SqlSessionFactory sqlSessionFactory;

    public StudentDao(String configPath) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(configPath);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
//查找所有
    public List<user> findAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<user> studentList = sqlSession.selectList("findAll");
        sqlSession.close();
        return studentList;
    }
//增加学生
    public int addStudent(user student) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int rowsAffected = sqlSession.insert("insert", student);
        sqlSession.commit();
        sqlSession.close();
        return rowsAffected;
    }
//删除学生
    public int deleteStudent(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int rowsAffected = sqlSession.delete("delete",id);
        sqlSession.commit();
        sqlSession.close();
        return rowsAffected;
    }

}
