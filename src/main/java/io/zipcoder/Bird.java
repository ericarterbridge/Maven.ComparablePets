package io.zipcoder;

public class Bird extends Pet{

    Bird(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "bok bok SQUAWK!";
    }

    public Bird(){};
}
