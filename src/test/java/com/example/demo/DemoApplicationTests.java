package com.example.demo;

import com.example.demo.controller.UserData;
import com.example.demo.controller.UserDataRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserDataRepository userDataRepository;



    @Test
    public void pt() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        //when
        List<UserData> userDataList = userDataRepository.findAll();

        System.out.println(title);
        System.out.println(userDataList);

    }
}
