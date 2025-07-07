package generic.ex4;

import generic.animal.Animal;
// 제네릭 타입
public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    // 제네릭 메서드
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.classname: " + animal.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }
}
