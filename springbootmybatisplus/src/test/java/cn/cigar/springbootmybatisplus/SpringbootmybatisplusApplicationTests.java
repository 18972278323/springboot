package cn.cigar.springbootmybatisplus;

import cn.cigar.springbootmybatisplus.entity.User;
import cn.cigar.springbootmybatisplus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootmybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    // 测试自动完成的更新
    public void testAutoCompleteUpdate() {
        User user = userMapper.selectById(1287760439727538182L);
        user.setName("雪茄");
        int i = userMapper.updateById(user);
        System.out.println("i = " + i);
    }

    @Test
    // 测试更新
    public void testUpdate() {
        User user = new User();
        user.setId(1L);
        user.setName("哈哈哈哈哈");

        int i = userMapper.updateById(user);
        System.out.println("i = " + i);
    }


    @Test
    // 测主键策略
    public void testId() {
        String uuid = IdWorker.get32UUID();
//        long uuid = IdWorker.getId();
        System.out.println("uuid = " + uuid);
    }

    @Test
    // 测新增
    public void testAdd() {
        User user = new User();
        user.setAge(20);
        user.setEmail("1505329414@qq.com");
        user.setName("雪茄");

        int insert = userMapper.insert(user);
        System.out.println("insert = " + insert);
        System.out.println("user = " + user);
    }

    @Test
    // 测查询
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
