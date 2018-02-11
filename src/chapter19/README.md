# 枚举类型
## 基本enum特性
[EnumClass.java](./EnumClass.java)  

## 向enum中添加新方法
除了不能继承自一个enum外, 基本可以把enum看成一个常规的类  

[OzWitch.java](./OzWitch.java)  

### 覆盖enum的方法
[SpaceShip.java](./SpaceShip.java)

### switch语句中的enum
[TrafficLight.java](./TrafficLight.java)

## values()的神秘之处
[Reflection.java](./Reflection.java)  

values()由编译器添加的static方法

## 实现, 而非继承
enum都继承自java.lang.Enum, 你的enum不能再继承其他类, 但是可以实现一个或多个接口

## 使用EnumSet代替标志
使用EnumSet的优点是: 它在说明一个二进制位是否存在时, 具有更好的表达能力, 并且无需担心性能
[EnumSets.java](./EnumSets.java)

## 使用EnumMap
[EnumMaps.java](./EnumMaps.java)

## 常量相关的方法
[ConstantSpecificMethod.java](./ConstantSpecificMethod.java)

### enum职责链
..

### enum的状态机
...

