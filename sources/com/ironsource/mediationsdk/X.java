package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

public interface X {
    void a(Y y);

    void a(Y y, long j);

    void a(IronSourceError ironSourceError, Y y);

    void a(IronSourceError ironSourceError, Y y, long j);

    void b(Y y);

    void b(IronSourceError ironSourceError, Y y);

    void c(Y y);

    void d(Y y);

    void e(Y y);

    void f(Y y);
}
