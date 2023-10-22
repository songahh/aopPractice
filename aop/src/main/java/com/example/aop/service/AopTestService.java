package com.example.aop.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class AopTestService {

    public long task1(int taskSize) {
        long result = 0;
        try {
            for (int i = 1; i <= taskSize; ++i) {
                result += i;
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
