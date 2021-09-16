
//https://www.hackerrank.com/challenges/30-class-vs-instance/problem

public class Person {
    private int age;

    public Person(int initialAge) {
        //return "Age is not valid, setting age to 0";
        this.age = Math.max(initialAge, 0);
    }
    public void yearPasses(){
        age++;
    }
    public String amIOld(){

       if (age < 13) {
           return "You are young.";
       }else if (age < 18){
           return "You are a teenager.";
        }else{
           return "You are old.";
       }
    }

    public int getAge() {
        return age;
    }
}
