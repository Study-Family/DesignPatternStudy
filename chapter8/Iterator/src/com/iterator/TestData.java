package com.iterator;

import com.iterator.domain.Profile;

import java.util.ArrayList;
import java.util.List;

public final class TestData {

    public static List<Profile> initData() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("bombo96@naver.com", "문종운", "friends:seyeon@naver.com", "friends:wonu123@naver.com", "friends:kbg1155@naver.com", "friends:sw1234@naver.com", "coworkers:spencer@naver.com"));
        data.add(new Profile("kbg1155@naver.com", "강병곤", "friends:seyeon@naver.com", "friends:wonu123@naver.com", "friends:bombo96@naver.com", "friends:sw1234@naver.com", "coworkers:spencer@naver.com"));
        data.add(new Profile("sw1234@naver.com", "한승원", "friends:seyeon@naver.com", "friends:wonu123@naver.com", "friends:kbg1155@naver.com", "friends:bombo96@naver.com", "coworkers:spencer@naver.com"));
        data.add(new Profile("seyeon@naver.com", "박세연", "friends:bombo96@naver.com", "friends:wonu123@naver.com", "friends:kbg1155@naver.com", "friends:sw1234@naver.com", "coworkers:spencer@naver.com"));
        data.add(new Profile("wonu123@naver.com", "유원우", "friends:seyeon@naver.com", "friends:bombo96@naver.com", "friends:kbg1155@naver.com", "friends:sw1234@naver.com", "coworkers:spencer@naver.com"));
        data.add(new Profile("spencer@naver.com", "스펜서", "friends:seyeon@naver.com", "friends:wonu123@naver.com", "friends:kbg1155@naver.com", "friends:sw1234@naver.com", "coworkers:bombo96@naver.com"));
        return data;
    }
}
