package com.example.crypto;


import java.util.Random;
import java.util.Scanner;

public class RandomSeedExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("시드 값을 입력하세요 (종료: -1): ");
            long seed = scanner.nextLong();
            
            if (seed == -1) {
                break;
            }
            
            // 시드 값을 사용하여 Random 객체 생성
            Random random = new Random(seed);
            
            // 10개의 난수 생성
            System.out.print("생성된 난수: ");
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                System.out.print(randomNumber + " ");
            }
            System.out.println();
        }
    }
}

