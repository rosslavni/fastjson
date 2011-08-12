package com.alibaba.json.test.bvt;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class MaterializedInterfaceTest extends TestCase {
    
    public void test_parse() throws Exception {
        String text = "{\"id\":123, \"name\":\"chris\"}";
        Bean bean = JSON.parseObject(text, Bean.class);
        
        Assert.assertEquals(123, bean.getId());
        Assert.assertEquals("chris", bean.getName());
    }

    public static interface Bean {
        int getId();

        void setId(int value);

        String getName();

        void setName(String value);
    }
}
