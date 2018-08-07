## 职责链模式

构建一系列对象组成链，沿着这条链传递请求，直到找到合适的对象处理请求。

**适用场景**：
- 有多个对象可以处理同一个请求，具体哪个对象处理该请求在运行时确定，客户端只需要将请求提交到链上，而无须关心请求的处理对象是谁。
- 在不明确具体接收者的情况下，向多个对象中的某一个提交请求。