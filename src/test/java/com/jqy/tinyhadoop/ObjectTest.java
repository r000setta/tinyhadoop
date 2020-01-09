package com.jqy.tinyhadoop;

import com.jqy.tinyhadoop.io.IntWritable;
import org.junit.jupiter.api.Test;
import org.mockito.internal.creation.SuspendMethod;

import java.io.*;

class ObjectTest {
    @Test
    void writeObject() throws Exception{
        IntWritable intWritable=new IntWritable(4);
        DataOutputStream stream=new DataOutputStream(new FileOutputStream("D:\\java2\\tinyhadoop\\src\\main\\resources\\object.txt"));
        intWritable.write(stream);
    }

    @Test
    void readObject() throws Exception{
        IntWritable intWritable=new IntWritable();
        DataInputStream inputStream=new DataInputStream(new FileInputStream("D:\\java2\\tinyhadoop\\src\\main\\resources\\object.txt"));
        intWritable.read(inputStream);
        System.out.println(intWritable.getValue());
    }
}
