package com.rpgfoundation.JobType;

import com.rpgfoundation.Secondary.Attribute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brandon on 1/1/2017.
 */
public class JobType {

    protected String title;
    private Attribute attribute;

    public JobType(Attribute attribute) {
        this.attribute = attribute;
    }
    public JobType(){

    }

    public Attribute getAttribute()
    {
        return attribute;
    }

    @Override
    public String toString() {
        return title;
    }

    public void spell()
    {

    }

    public static Attribute generateStats(int a, int b) {
        return new Attribute(
                randomStats(a,b),
                randomStats(a,b),
                randomStats(a,b),
                randomStats(a,b),
                randomStats(a,b),
                randomStats(a,b));
    }

    private static int randomStats(int max, int min)
    {
        return (int) (Math.random()*(max-min+1)+min);
    }
}
