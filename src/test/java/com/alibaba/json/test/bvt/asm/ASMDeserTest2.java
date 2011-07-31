package com.alibaba.json.test.bvt.asm;

import java.util.ArrayList;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class ASMDeserTest2 extends TestCase {

    public void test_codec_1() throws Exception {
        String text = JSON.toJSONString(new VO());

        Assert.assertEquals("{\"value\":[]}", text);

        VO object = JSON.parseObject(text, VO.class);
        Assert.assertEquals(0, object.getValue().size());
    }

    public static class VO {

        private Entity value = new Entity();

        public Entity getValue() {
            return value;
        }

        public void setValue(Entity value) {
            this.value = value;
        }

    }

    public static class Entity extends ArrayList<String> {

    }

}
