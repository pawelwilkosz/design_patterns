using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DeepCopyable.builders
{
    public class PersonalInformationBuilder
    {
        protected User user;
        protected PersonalInformationBuilder(User user) => this.user = user;

        public PersonalInformationBuilder() => user = new User();
        public NamesBuilder Create => new NamesBuilder(user);

        public static implicit operator User(PersonalInformationBuilder personalInformationBuilder)
        {
            return personalInformationBuilder.user;
        }
    }
}
