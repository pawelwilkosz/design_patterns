using Factory.Utils;
using System;

namespace Factory
{
    class Demo
    {
        static void Main(string[] args)
        {
            MessageProcessor producerA = MessageProducer.Factory.NewEventHub("<EVENT_HUB_NAMESPACE>", "<EVENT_HUB_NAME>");
            MessageProcessor producerB = MessageProducer.Factory.NewServiceBus("<SERVICE_BUS_NAME>");

            Console.WriteLine(((EventHub)producerA).EventHubNamespace + " " + ((EventHub)producerA).EventHubName);
            Console.WriteLine(((ServiceBus)producerB).ServiceBusName);
        }
    }
}
