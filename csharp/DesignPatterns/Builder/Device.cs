using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Builder
{
    public class Device
    {
        public string ScopeId { get; set; }
        public string GlobalEndpoint { get; set; }
        public string X509Certificate { get; set; }
        public string PrivateKey { get; set; }
    }
}
