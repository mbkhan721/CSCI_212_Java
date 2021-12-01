package PracticeExam02;

public class Beta {

    public Beta() {
        // no arg constructor
    }

    public class Alpha extends Beta { // Class Alpha inherits from class Beta

        public Alpha(int alphaVar) { // has a one argument constructor that takes an integer parameter
        }
        public Alpha() {
        }
    }

    public class Gamma extends Alpha { // Class Gamma inherits from class Alpha

        public Gamma(float gammaVar) { // has a one argument constructor that takes a float parameter
            super(4); // Constructors should be passed the value four
        }
    }
}
