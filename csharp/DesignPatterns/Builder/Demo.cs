using System;

using Builder;

namespace DesignPatterns
{
    class Demo
    {
        public static void Main(String[] argc)
        {
            DeviceBuilder db = new DeviceBuilder();
            Device device = db.Connects
                                    .OnGlobalEndpoint("<GLOBAL ENDPOINT>")
                                    .WithScopeId("<SCOPE ID>")
                                .Encrypts
                                    .UsingCert("<CERTS>")
                                    .WithPrivateKey("<PRIVATE KEY>");

            Console.WriteLine(device.PrivateKey);
        }
    }
}
