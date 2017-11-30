package com.pingplusplus;

import org.junit.BeforeClass;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'Afon' at '16-12-16 上午10:33' with Gradle 3.1
 *
 * @author Afon, @date 16-12-16 上午10:33
 */
public class PingppAccountTestBase {

    @BeforeClass public static void initApiKey() {
        Pingpp.overrideApiBase(PingppAccountTestData.getApiBase());
        Pingpp.apiKey = PingppAccountTestData.getApiKey();
        Pingpp.appId = PingppAccountTestData.getAppID();
        Pingpp.privateKey = PingppAccountTestData.getPKCS8PrivateKey();

        Pingpp.DEBUG = true;
    }
}
