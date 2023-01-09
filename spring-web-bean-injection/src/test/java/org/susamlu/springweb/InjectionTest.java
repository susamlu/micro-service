package org.susamlu.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.susamlu.springweb.bean.MyBean;

/**
 * @author Sam Lu
 * @date 2023/01/09
 */
@SpringBootTest
public class InjectionTest {

    @Test
    public void test(@Autowired MyBean myBean) {
        assert myBean != null;
    }

}
