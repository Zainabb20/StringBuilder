//StringBuilder - Class used to create mutable String.
//Same as StringBuffer but it is non- synchronized.

import java.net.SocketOption;

public class Main
{
    public static void main(String[] args)
    {
        StringBuilder sb= new StringBuilder("Hello");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(2,"y");
        System.out.println(sb);
        sb.replace(1,4,"aiishh");
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        //capacity - default is 16
        //ensure capacity - minimum capacity is passed as an argument

        StringBuilder bs=new StringBuilder("Party");
        System.out.println(bs.capacity());
        bs.append("Woo Woo Woo Woo");
        System.out.println(bs.capacity());

        StringBuilder sbb = new StringBuilder();
        System.out.println(sbb.capacity()); //default 16
        sbb.append("Hey");
        System.out.println(sbb.capacity());
        sbb.append("Peeps");
        System.out.println(sbb.capacity());
        sbb.ensureCapacity(50);
        System.out.println(sbb.capacity());


    }
}