package com.dawn.crowd.test;


import com.dawn.crowd.util.CrowdUtils;
import org.junit.Test;

public class StringTest {

    @Test
    public  void testSendCode(){
        String appcode="091becf1a1cf4344bdea79ce8df27903";
        String randomCode= CrowdUtils.randomCode(4);
        String phoneNum="13263100970";

        System.out.println(CrowdUtils.sendShortMessage(appcode,randomCode,phoneNum));
    }

}
