class Library
{
    String name , author ;
    double p;
    Library(String n , String a , double pr)
    {
        name = n;
        author = a;
        p = pr;
    }
    void show()
    {
        System.out.println("Name = "+name+"\n"+"Author = "+author+"\n"+"Price = "+p);
    }
}

