interface I {
    void afficher();
}

class A {
    protected String f(B obj) {
        return ("A");
    }

    String f(A obj) {
        return ("A et A");
    }
}

class B extends A implements I {
    public B() {
        super();
    }

    public void afficher() { // Implementing the abstract method from I
        System.out.println("B");
    }

    protected String f(B obj) { // Corrected access modifier
        return ("B et B");
    }

    String f(A obj) {
        return ("B et A");
    }
}

class C extends B {
    public void afficher() {
        System.out.println("C");
    }
}

class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new C();
        //B a3 = new A(); // This will cause a compilation error
        A a4 = new B();

        System.out.println(a1.f(a1));
        System.out.println(a1.f(a2));
        System.out.println(((B) a2).f(a1));
        System.out.println(a2.f(a2));
    }
}
