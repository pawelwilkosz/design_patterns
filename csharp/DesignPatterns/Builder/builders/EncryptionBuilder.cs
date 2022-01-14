using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder.builders
{
    public class EncryptionBuilder : DeviceBuilder
    {
        public EncryptionBuilder(Device device)
        {
            this.device = device;
        }

        public EncryptionBuilder UsingCert(string x509cert)
        {
            device.X509Certificate = x509cert;

            return this;
        }

        public EncryptionBuilder WithPrivateKey(string privateKey)
        {
            device.PrivateKey = privateKey;

            return this;
        }
    }
}
