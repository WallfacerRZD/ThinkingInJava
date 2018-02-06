# 持有对象
## 泛型和类型安全的容器
通过使用泛型, 可以在编译期防止将错误类型的对象防止到容器中.  

## 基本概念
Java容器类类库的用途是"保存对象", 并将其划分为两个不同的概念:
1. Collection: 一个独立元素的序列.
2. Map: 一组成对的"键值对"对象, 允许你使用键来查找值.  

## 添加一组元素
- Arrays.asList():接受一个数组或是一个用逗号分隔的元素列表(使用可变参数), 将其转换为一个List对象.  

- Collection.addAll(): 接受一个Collection对象, 以及一个数组或是一个用逗号分割的列表, 将元素添加到Collection中

## 容器的打印
必须使用Arrays.toString()来产生数组的课打印表示.  

容器重载了toString()方法.  

## List
List接口承诺可以将元素维持在特定的序列中
两种类型List:
- ArrayList: 长于随机访问元素, 在List的中间插入和移出元素时较慢
- LinkedList: 随机访问元素较慢, 在List中间进行的插入和删除操作较快

List用对象的equals()方法比较对象是否相同.  

## 迭代器
迭代器是一个对象, 它的工作是遍历并选择序列中的对象, 而客户端程序员不必知道该序列底层的结构.  

Java的Iterator只能单向移动:
- 使用方法iterator()返回一个Iterator
- 使用next()获得序列中的下一个元素
- 使用hasNext()检测序列中是否还有元素
- 使用remove()将迭代器新返回的元素删除

### ListIterator
ListIterator是一个更加强大的Iterator的字类型, 它只能用于各种List类的访问.  

## LinkedList
LinkedList也想ArrayList一样实现了基本的List接口, 但是它执行某些操作(在List的中间插入和移除)时比ArrayList更高效, 但在随机访问操作方面却要逊色一些.  

LinkedList还添加了可以使其用作栈, 队列或双端队列的方法.  

## Stack
"栈"通常是指"后进先出"容器  

java.tuil.Stack使用LinkedList实现栈

## Set
- HashSet: 使用散列
- TreeSet: 使用红黑树
- LinkedHashList: 使用散列, 但是看起来它使用了链表来维护元素的插入顺序

## Map
将对象映射到其他对象

## Queue
队列是典型的先进先出容器  

### PriorityQueue
可以提供自己的Comparator来修改队列中的排列顺序.  

## Collection和Iterator
Collection是描述所有序列容器的共性的跟接口  

实现Collection就意味着需要提供iterator()方法


## Foreach与迭代器
Java SE5引入了新的被称为Iterable的接口, 接口包含一个能够产生Iterator的iterator()方法, 并且Iterable接口被foreach用来在序列中移动.  

[IterableClass.java](./IterableClass.java)