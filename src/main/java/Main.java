import bean.User;
import lombok.extern.slf4j.Slf4j;
import mapper.UserMapper;
import sqlSession.MySqlsession;

@Slf4j
public class Main {


    public static void main(String[] args) {

        MySqlsession sqlsession = new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");

        System.out.println(user);


    }


}
