package com.itender.proxy;

import com.itender.proxy.service.Image;
import com.itender.proxy.service.impl.ProxyImage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: ITender
 * @CreateTime: 2021-12-11 17:03
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProxyTest {

    @Test
    public void proxyTest() {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
