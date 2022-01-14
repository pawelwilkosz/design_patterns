using Builder.builders;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public class DeviceBuilder
    {
        protected Device device;
        protected DeviceBuilder(Device device) => this.device = device;

        public DeviceBuilder() => device = new Device();
        public ConnectionBuilder Connects => new ConnectionBuilder(device);
        public EncryptionBuilder Encrypts => new EncryptionBuilder(device);
        public static implicit operator Device(DeviceBuilder deviceBuilder)
        {
            return deviceBuilder.device;
        }
    }
}
