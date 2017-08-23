package com.example.mvpmultiplecomponents.data.local.dummy1;


public class Dummy1DataRepository implements Dummy1Repository {
    @Override
    public String getDummyString() {
        return "My dummy String from Dummy1Repository";
    }
}
