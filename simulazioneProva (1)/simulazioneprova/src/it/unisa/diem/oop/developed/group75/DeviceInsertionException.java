package it.unisa.diem.oop.developed.group75;

public class DeviceInsertionException extends Exception{
    public DeviceInsertionException() {
    }

    public DeviceInsertionException(String errorMessage) {
        super(errorMessage);
    }
}