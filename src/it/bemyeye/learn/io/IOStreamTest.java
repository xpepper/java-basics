package it.bemyeye.learn.io;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

import org.junit.Test;

public class IOStreamTest {

    @Test
    public void readBytes() throws Exception {
        // First, create a file containing ciao, in '/tmp/ciao.txt'
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("/tmp/ciao.txt"));
        byte[] bytes = new byte[10];
        inputStream.read(bytes);

        assertTrue(new String(bytes).startsWith("ciao"));
    }

    @Test
    public void readChars() throws Exception {
        // First, create a file containing ciao, in '/tmp/ciao.txt'
        FileReader fileReader = new FileReader("/tmp/ciao.txt");
        char[] chars = new char[4];
        fileReader.read(chars);

        assertEquals("ciao", new String(chars));
    }

    @Test
    public void readFileContentAsStrings() throws Exception {
        // First, create a file containing ciao, in '/tmp/ciao.txt'
        BufferedReader fileReader = new BufferedReader(new FileReader("/tmp/ciao.txt"));
        String line = fileReader.readLine();

        assertEquals("ciao", line);
    }

}
