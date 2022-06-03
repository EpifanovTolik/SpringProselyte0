package net.proselyte.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Position {
    @Autowired
    @Qualifier("dotNetDeveloper")
    private Developer developer;

    public Position() {
    }

    public void getDevelopersInfo(){
        System.out.println(this.developer);
    }
}
