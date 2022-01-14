using DeepCopyable.builders;
using System;

namespace DeepCopyable
{
    class Demo
    {
        static void Print(string key, object value)
        {
            Console.WriteLine(key + ": " + value);
        }
        static void Main(string[] args)
        {
            PersonalInformationBuilder personBuilder = new PersonalInformationBuilder();
            User firstUser = personBuilder.Create
                                                .WithFirstNames("John")
                                                .WithSecondName("Smith");
            User secondUser = firstUser.DeepCopy();

            Print("Are equal?", firstUser == secondUser);
            Print("First user name", firstUser.FirstName);
            Print("Second user name", secondUser.FirstName);
            Print("First user second name", firstUser.SecondName);
            Print("Second user second name", secondUser.SecondName);
        }
    }
}
