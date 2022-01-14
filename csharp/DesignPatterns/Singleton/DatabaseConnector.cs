using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Singleton
{
    public class DatabaseConnector
    {
        public static DatabaseConnector Instance => instance.Value;

        private DatabaseConnector()
        {
            Console.WriteLine("Database object initialization...");
        }

        private static Lazy<DatabaseConnector> instance =
            new Lazy<DatabaseConnector>(
                () => new DatabaseConnector()
                );
    }
}
