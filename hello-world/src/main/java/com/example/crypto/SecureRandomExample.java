package com.example.crypto;

import java.security.SecureRandom;
import java.util.Arrays;

public class SecureRandomExample {
    public static void main(String[] args) {
        // SecureRandom 객체 생성
        SecureRandom random = new SecureRandom();

        // 16바이트 크기의 바이트 배열 생성
        byte[] bytes = new byte[16];

        // 바이트 배열을 SecureRandom으로 채움
        random.nextBytes(bytes);

        // 바이트 배열 내용을 문자열로 출력
        System.out.println(Arrays.toString(bytes));

        // 바이트 배열을 16진수 문자열로 변환
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            // 각 바이트를 16진수 문자열로 변환하여 StringBuilder에 추가
            hexString.append(String.format("%02X", b));
        }

        // 16진수 문자열 출력
        System.out.println(hexString.toString());
    }
}
