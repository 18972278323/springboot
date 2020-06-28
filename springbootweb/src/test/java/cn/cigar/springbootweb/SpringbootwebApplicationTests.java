package cn.cigar.springbootweb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootwebApplicationTests {

	@Test
	void contextLoads() {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.debug("这是debug级别日志-------");
		logger.info("这是info级别日志*******");
		logger.error("这是error级别日志=======");
	}

}
