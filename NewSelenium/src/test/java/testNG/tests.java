package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class tests {
public void Test1(){

Random random=new Random();
int a= random.nextInt(10);
int b= random.nextInt(3);
int c=a+b;
    System.out.println("c" + c );
    Assert.assertTrue(c<12);
    }



}
