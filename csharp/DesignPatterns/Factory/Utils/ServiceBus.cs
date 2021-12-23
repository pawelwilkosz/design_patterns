using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.Utils
{
    public class ServiceBus : MessageProcessor
    {
        public string ServiceBusName { get; }
        public ServiceBus(string serviceBusName)
        {
            ServiceBusName = serviceBusName;
        }
    }
}
