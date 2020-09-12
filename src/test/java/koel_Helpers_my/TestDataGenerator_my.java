package koel_Helpers_my;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataGenerator_my {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}
