package ru.GeekBrains.equipment;

public class ProtectiveScreen {
    private boolean protect;

    protected void protectOn(String side) {
        this.protect = true;
        System.out.printf("Защитный экран %s опущен%n", side);
    }

    protected void protectOff(String side) {
        this.protect = false;
        System.out.printf("Защитный экран %s поднят%n", side);
    }

    public boolean isProtect() {
        return protect;
    }
}
