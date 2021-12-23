using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.Utils
{
    public class EventHub : MessageProcessor
    {
        public string EventHubNamespace { get; }
        public string EventHubName { get; }
        public EventHub(string eventHubNamespace, string eventHubName)
        {
            EventHubNamespace = eventHubNamespace;
            EventHubName = eventHubName;
        }
    }
}
