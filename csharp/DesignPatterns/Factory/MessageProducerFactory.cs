using Factory.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    public partial class MessageProducer
    {
        public static class Factory
        {
            public static EventHub NewEventHub(string eventHubNamespace, string eventHubName)
            {
                return new EventHub(eventHubNamespace, eventHubName);
            }

            public static ServiceBus NewServiceBus(string serviceBusName)
            {
                return new ServiceBus(serviceBusName);
            }
        }
    }
}
