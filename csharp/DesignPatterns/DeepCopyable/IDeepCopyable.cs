using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DeepCopyable
{
    interface IDeepCopyable<T>
    {
        T DeepCopy();
    }
}
