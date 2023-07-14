package com.iterator;

import com.iterator.domain.Facebook;
import com.iterator.domain.LinkedIn;
import com.iterator.domain.SocialNetwork;
import com.iterator.domain.SocialNetworkType;
import com.iterator.service.SocialSpammer;

import java.util.Scanner;

public class Main {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==please input SocialTypeNumber==");

        for (SocialNetworkType type : SocialNetworkType.values()) {
            System.out.println(type.getTypeNumber() + ". : " + type.name());
        }

        int typeNumber = SCANNER.nextInt();
        SocialNetworkType socialNetworkType = SocialNetworkType.findByNumber(typeNumber);

        SocialNetwork socialNetwork = switch(socialNetworkType) {
            case FACEBOOK -> new Facebook(TestData.initData());
            case LINKEDIN -> new LinkedIn(TestData.initData());
        };

        SocialSpammer spammer = new SocialSpammer(socialNetwork);
        spammer.sendSpamToFriends("bombo96@naver.com", "너모 어렵습니다");
        spammer.sendSpamToCoworkers("bombo96@naver.com", "스펜서님은 언제 쉬시나요?");
    }
}
