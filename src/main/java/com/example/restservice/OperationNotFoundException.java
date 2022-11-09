package com.example.restservice;

public class OperationNotFoundException extends RuntimeException {
    OperationNotFoundException (String operation){
        super("Could not find operation " + operation);
    }
}
