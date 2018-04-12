package com.example.shiyan4;

/**
 * Created by 紫薯 on 2018/4/2.
 */

public class Animal {
    private  String name;
    private int imageId;
    public Animal (String name,int imageId)
    {
        this.name=name;
        this.imageId=imageId;
    }
    public String getName()
    {
        return name;
    }
    public int getImageId()
    {
        return imageId;
    }
}
