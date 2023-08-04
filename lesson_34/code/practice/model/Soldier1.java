package practice.model;

import java.util.Objects;

public class Soldier1 implements Comparable<Soldier1>{

        String name;
        int height;
        double weight;
        int profile;

        public Soldier1(String name, int height, double weight, int profile) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.profile = profile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getProfile() {
            return profile;
        }

        public void setProfile(int profile) {
            this.profile = profile;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Soldier{");
            sb.append("name='").append(name).append('\'');
            sb.append(", height=").append(height);
            sb.append(", weight=").append(weight);
            sb.append(", profile=").append(profile);
            sb.append('}');
            return sb.toString();
        }

        @Override
        public int compareTo(Soldier1 o) {
            int res = this.height - o.height;//по росту от меньшего к большему
            return res != 0 ? res : -(this.profile - o.profile); // сравнивает по профилям
        }   //тернарный оператор
            //


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier1 soldier1 = (Soldier1) o;
        return height == soldier1.height && Double.compare(soldier1.weight, weight) == 0 && profile == soldier1.profile && Objects.equals(name, soldier1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, profile);
    }
}
























