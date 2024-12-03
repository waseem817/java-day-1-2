import java.io.PrintWriter;
public class PrinterWriter
{
public static void main(String[] args)
{
    PrintWriter  pw=new  PrintWriter(System.out);
    pw.println("hello world");
    pw.println("this is java program");
    pw.println("statements");
    pw.close();
}
}