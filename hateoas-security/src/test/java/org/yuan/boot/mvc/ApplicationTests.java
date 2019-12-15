package org.yuan.boot.mvc;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yuan.boot.Application;
import org.yuan.boot.mvc.pojo.Result;

@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @Test
    public void t1() {
        String prettyStr = JSONUtil.toJsonPrettyStr(new Result(1, "aa", null));
        System.out.println("prettyStr = " + prettyStr);
    }
}
