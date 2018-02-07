#include<iostream>

template<typename T>
class Manipulator {
private:
    T obj;
public:
    Manipulator(T x):obj(x) {}
    void manipulate() {
        obj.f();
    }
};

class HasF {
public:
    void f() {
        std::cout<<"HasF::f()"<<std::endl;
    }
};

// 成功编译, 输出: HasF::f()
int main() {
    HasF f;
    Manipulator<HasF> mp(f);
    mp.manipulate();
    return 0;
}