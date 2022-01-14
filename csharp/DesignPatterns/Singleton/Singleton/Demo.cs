using System;

namespace Singleton
{
    class Demo
    {
        static void Main(string[] args)
        {
            DatabaseConnector dbA = DatabaseConnector.Instance;
            DatabaseConnector dbB = DatabaseConnector.Instance;

            Console.WriteLine(dbA == dbB);
         }
    }
}
