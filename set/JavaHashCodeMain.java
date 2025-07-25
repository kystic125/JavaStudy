package collection.set;

import collection.set.Member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해둠
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());


        // hashCode는 마이너스 값이 들어올 수 있음
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와 한 경우 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

        /** 동일성과 동등성
         * 동일성: == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 참조하는지 비교
         * 동등성: equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
         */


    }
}
