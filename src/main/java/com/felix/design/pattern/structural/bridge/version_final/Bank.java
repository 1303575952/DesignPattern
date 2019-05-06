package com.felix.design.pattern.structural.bridge.version_final;

/**
 * Created by lifei
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
