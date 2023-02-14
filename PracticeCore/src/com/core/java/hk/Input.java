package com.core.java.hk;

import java.io.*;
import java.util.Arrays;

public class Input
{
    public static void main (String args[])
    {
        try {
            echo(System.in);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void echo(InputStream stream) throws IOException
    {
        byte[] input = new byte[10];

        char[] inputChar = new char[10];
        int current;
        while ((current = stream.read()) > 0){
            stream.read(input);

            int i = 0;
            while (input[i] != 0) {
                inputChar[i] = (char)input[i];
                if (i < 9) {
                    i++;
                }
                else {
                    break;
                }
            }   
            System.out.println(Arrays.toString(inputChar));
        }
    }
}