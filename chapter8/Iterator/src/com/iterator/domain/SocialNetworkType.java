package com.iterator.domain;

import java.util.Arrays;

public enum SocialNetworkType {
    FACEBOOK(1),
    LINKEDIN(2);

    private final int typeNumber;

    SocialNetworkType(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public static SocialNetworkType findByNumber(int number) {
        SocialNetworkType socialNetworkType = Arrays.stream(values())
                .filter((type) -> type.typeNumber == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 소셜 타입 번호 입력"));

        return socialNetworkType;
    }

    public int getTypeNumber() {
        return this.typeNumber;
    }
}
