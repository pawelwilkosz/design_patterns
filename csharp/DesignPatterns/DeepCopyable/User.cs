using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DeepCopyable
{
    public class User : IDeepCopyable<User>
    {
        public string FirstName;
        public string SecondName;

        public User DeepCopy()
        {
            var copy = new User();
            copy.FirstName = FirstName;
            copy.SecondName = SecondName;

            return copy;
        }
    }
}
