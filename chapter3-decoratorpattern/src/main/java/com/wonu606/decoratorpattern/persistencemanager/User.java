package com.wonu606.decoratorpattern.persistencemanager;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {

    private String name;
    private String phoneNumber;
    private String address;
}
