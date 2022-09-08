class ClassTest{
  public void C_Programming() {
    System.out.println("The class test marks is: 70");
  }
}


class Internals extends ClassTest{
  public void Java_Programming() {
    System.out.println("The internal marks is: 80");
  }
}

class FinalMarks{
  public static void main(String[] args) {

    // create an object of the subclass
    Internals m = new Internals();

    m.C_Programming();
    m.Java_Programming();
  }
}