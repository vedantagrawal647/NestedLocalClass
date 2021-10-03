class Door
{
    String c;
    public void display()
    {
        class Lock
        {
            String a,b;
            Lock(String a)
            {
                this.a=a;
                b="1234";
            }
            public void show()
            {
                if(a.equals(b))
                {
                    System.out.println("Key is match");
                }
                else
                {
                    System.out.println("Key is not match");
                }
            }

        }
        Lock obj =new Lock(c);
        obj.show();

    }
    Door(String c)
    {
        this.c=c;
    }
}

public class Key
{
    public static void main(String[] args) {
        Door obj1=new Door(args[0]);
        obj1.display();

    }
}