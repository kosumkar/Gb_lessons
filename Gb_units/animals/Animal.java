package Gb_units.animals;

public abstract class Animal {

        protected int runDistance;
        protected int swimDistance;

        public Animal(int runDistance, int swimDistance) {
            this.runDistance = runDistance;
            this.swimDistance = swimDistance;
        }

        public abstract void swim(int distance);

        public abstract void run(int distance);
    }

