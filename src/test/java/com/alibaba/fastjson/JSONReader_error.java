package com.alibaba.fastjson;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

public class JSONReader_error extends TestCase {

    public void test_0() throws Exception {
        JSONReader reader = new JSONReader(new StringReader("[]"));

        Exception error = null;
        try {
            reader.hasNext();
        } catch (Exception e) {
            error = e;
        }
        Assert.assertNotNull(error);
        
        reader.close();
    }

    public void test_1() throws Exception {
        JSONReader reader = new JSONReader(new StringReader("{\"id\":123}"));

        reader.startObject();
        reader.readObject();

        Exception error = null;
        try {
            reader.hasNext();
        } catch (Exception e) {
            error = e;
        }
        Assert.assertNotNull(error);
        reader.close();
    }
}
