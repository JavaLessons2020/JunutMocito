package lukas.task4;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class NumberTest {

    Number mock = spy(Number.class);


//    @Test(expected = IOException.class)
//    public void writeFile() throws IOException {
//        doThrow(new IOException()).when(mockWriter).write("345");
//        mockWriter.write("345");
//    }

    @Test
    public void readFromFile() throws Exception {
        when(mock.readFromFile("test.txt")).thenReturn("345");
        //mock.readFromFile("test.txt");
        assertEquals("345", mock.readFromFile("test.txt"));
        verify(mock).readFromFile("test.txt");

    }
}