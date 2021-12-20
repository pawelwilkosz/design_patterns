using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public class ConnectionBuilder : DeviceBuilder
    {
        public ConnectionBuilder(Device device)
        {
            this.device = device;
        }

        public ConnectionBuilder WithScopeId(String scopeId)
        {
            device.ScopeId = scopeId;

            return this;
        }

        public ConnectionBuilder OnGlobalEndpoint(string globalEndpoint)
        {
            device.GlobalEndpoint = globalEndpoint;

            return this;
        }
    }
}
