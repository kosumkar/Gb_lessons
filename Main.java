public class Main {

    public static void main(String[] args) {

        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personArray[1] = new Employee("Stanislavov Ivan", "Cryptologist", "stanislavov@crypto.gud", "%N321N@#13", 190000, 40);
        personArray[2] = new Employee("Dobrinin Ivan", "Writer", "dobrobezzla@karma.god", "986723561", 50000, 32);
        personArray[3] = new Employee("Kozlov Ivan", "Storekeeper", "samtakoi@agro.net", "614411243", 30000, 55);
        personArray[4] = new Employee("Vladimirovich Ivan", "Works", "vladimirovich@prosto.est", "321516613", 11000, 25);

         int AgeRange = 40;

        for (Employee i : personArray) {

            if (i.getAge() >= AgeRange) {

                i.InfoSysOut();

            }

        }


    }

}



