import java.io.*;
interface in1 {
final int a = 10;
void display();
}
class A implements in1 {
public void display() 
{ 
System.out.println("Hello Interface implementation ");
 }
public static void main(String[] args){
A t = new A();
t.display();
System.out.println(a);

}}

