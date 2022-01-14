namespace DeepCopyable.builders
{
    public  class NamesBuilder : PersonalInformationBuilder
    {
        public NamesBuilder(User user)
        {
            this.user = user;
        }

        public NamesBuilder WithFirstNames(string firstName)
        {
            user.FirstName = firstName;

            return this;
        }

        public NamesBuilder WithSecondName(string secondName)
        {
            user.SecondName = secondName;

            return this;
        }
    }
}