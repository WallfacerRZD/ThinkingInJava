# 并发
## 并发的多面性
### 定义任务
[LiftOff.java](./LiftOff.java)  
### Thread类
[BasicThreads.java](./BasicThreads.java)  
一个线程会创建一个单独的执行线程, 在对start()的调用完成之后, 它仍旧会继续存在.  
### 使用Executor
[CachedThreadPool.java](./CachedThreadPool.java)  

[SingleThreadExecutor.java](./SingleThreadExecutor.java)

### 从任务中产生返回值
[CallableDemo.java](./CallableDemo.java)

### 休眠
[SleepingTask.java](./SleepingTask.java)

### 优先级
调度器倾向于让优先权最高的线程先执行  

在大多数时间里, 所有线程都应该以默认的优先级运行, 试图擦组线程优先级通常是一种错误  

[SimplePriorities.java](./SimplePriorities.java)  

### 让步
调用yield(), 建议具有相同优先级的其他线程可以运行, 但是没有任何机制保存它会被采纳  

### 后台线程
后台(daemon)进程[SimpleDaemon.java](./SimpleDaemons.java)

### 编码的变体
[SimpleThread.java](./SimpleThread.java)

### 加入一个线程
如果某个线程在另一个线程t上调用t.join(), 此线程将被挂起, 直到线程t结束才恢复.  

### 捕获异常
一旦异常逃出任务的run()方法, 它就会向外传播到控制台, 除非采取特殊的步骤捕获异常  
[CaptureUncaughtException](./CaptureUncaughtException.java)
### 解决共享资源竞争
1. 如果某个任务处于一个对标记为synchronized的方法的调用中, 那么在这个线程从该方法返回之前, 其他所有要调用类中任何标记为synchronized的方法的线程都会被阻塞.  
2. 使用Lock对象, 显示创建, 锁定和释放

使用synchronize关键字时, 某些事物失败了会抛出一个异常, 没有机会做任何清理工作.使用Lock可以使用finally子句将系统维护在正确的状态  

### 原子性和易变性
原子操作是不能被线程调度机制中断的操作  

volatile关键字确保了可视性: 如果将一个域声明为volaile, 那么只要对这个域产生了写操作, 那么所有的读操作都可以看到这个修改, 即使使用了本地缓存, 情况也确实如此, volatile域会立即被写入到主存中   

同步也会导致主存刷新, 因此一个域完全有synchronize方法或语句块来防护, 那就不必将其设置为是volatile的  

> 依赖于原子性是很棘手且很危险的, 如果你是一个并发专家, 或者你得到了来自这样的专家的帮助, 你才应该使用原子性来代替同步

### 原子类
Java SE5引入了特殊的原子性变量类, 对于常规编程来说, 它们很搜少胡派上用场, 但是涉及性能调优时, 它们就大有用武之地了

### 临界区
防止多个线程同时访问方法内部的部分代码而不是防止访问整个方法  

```
synchronized(syncObject) {
    // This code can be accessed
    // by only one task at a time
}
```

## 线程之间的协作
wait()期间对象锁是释放的, sleep()期间对象锁不释放  

### notify()与notifyAll()
notify():唤醒一个任务.   
notifyAll(): 唤醒所有等待这个锁的任务.  

### 生产者与消费者
[Restaurant.java](./Restaurant.java)

### 使用显示的Lock和Condition对象
[WaxOMatic2.java](./WaxOMatic2.java)

### 生产者-消费者队列
[TestBlockingQueues.java](./TestBlockingQueues.java)

### 吐司BlockingQueue
使用同阻塞队列, 消除类与类之间的耦合[TestBlockingQueues](./TestBlockingQueues.java)

### 任务间使用管道进行输入/输出
[PipedIO](./PipedIO.java)