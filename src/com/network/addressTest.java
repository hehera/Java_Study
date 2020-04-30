package com.network;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HHR
 * @date 2020/4/29 17:24
 */
public class addressTest {
    @Test
    public void adrtest() throws UnknownHostException {
        InetAddress w=InetAddress.getLocalHost();
        InetAddress ww=InetAddress.getByName("www.baidu.com");

        System.out.println(ww);
        System.out.println(w);
    }

}
