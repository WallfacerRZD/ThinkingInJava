package chapter15;

public interface Payable<T> {
}

// 泛型擦除使Payable<Employee1>, Payable<Hourly>简化为同一个接口
// 意味着重复两次实现了相同的接口
// class Employee1 implements Payable<Employee1> {
//
// }
// class Hourly extends Employee1 implements Payable<Hourly>{
//
// }

// 以下代码可以编译
class Employee1 implements Payable {

}
class Hourly extends Employee1 implements Payable{

}
