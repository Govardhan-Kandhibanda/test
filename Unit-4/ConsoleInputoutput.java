import java.io.*;
import java.util.*;
public class ConsoleInputoutput {

public static void main(String []args)
throws Exception
 {
ConsoleConsole=SystemConsole();
if(Console==null)
{
System.out.println("Console is not supported");
System.exit(1);
}
String name=Console.readline("what is your name?");
String age=Console.readline("how old are you?");
String city=Console.readline("where do you live?");
Console.format("%s  is a %s year oldman is living in %s",name,age,city);
}
}
