package 西二;
import java.sql.*;
import java.util.*;
public class jdbc的操作 {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static final String USER = "root";
    public static final String PASS = "123456";
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
//增加学生姓名
    public static void StudentNumber(){
        Connection con = getConnection();
        String sql = "insert into Info values(?, ?, ?)";
        PreparedStatement psmt = null;
        try {
            psmt = con.prepareStatement(sql);
            psmt.setString(1, "123");
            psmt.setString(2, "12");
            psmt.setInt(3, 3);
            int count = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(psmt != null){
                try {
                    psmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//减去人物
    public static void delete(){
        Connection con = getConnection();
        String sql = "delete from Info where id=?";
        PreparedStatement psmt = null;
        try {
            psmt = con.prepareStatement(sql);
            psmt.setString(1, "10330070");
            int count = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(psmt != null){
                try {
                    psmt.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
//更新
    public static void update(){
        Connection con = getConnection();
        String sql = "update Info set age = ? where id = ?";
        PreparedStatement psmt = null;
        try {
            psmt = con.prepareStatement(sql);
            psmt.setInt(1, 22);
            psmt.setString(2, "111313");
            int count = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(psmt != null){
                try {
                    psmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//查询
    public static List<Info> query(){
        List<Info> list = new ArrayList<Info>();
        Connection con = getConnection();
        String sql = "select * from Info";
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            psmt = con.prepareStatement(sql);
            rs = psmt.executeQuery();

            while(rs.next()){    //依次取出数据
                Info info = new Info();
                info.setId(rs.getString("id"));
                info.setPass(rs.getString("name"));
                info.setAge(rs.getInt("age"));
                System.out.println(info.getId() +"\t" + info.getPass() + "\t" + info.getAge());
                list.add(info);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(psmt != null){
                try {
                    psmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(query().get(0).getAge());

    }
}
class Info{
    private String id;
    private String name;
    private int age;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPass() {
        return name;
    }
    public void setPass(String pass) {
        this.name = pass;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


