package it.bemyeye.learn.io;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import org.junit.Test;

public class IOSamples {

    @Test
    public void readBytes() throws Exception {
        // First, create a file containing ciao, in '/tmp/ciao.txt'
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("/tmp/ciao.txt"));
        byte[] bytes = new byte[10];
        inputStream.read(bytes);

        assertTrue(new String(bytes).startsWith("ciao"));
    }
}
