public class SorterTest {
    public static void testNameSchoolSort() {
        Staff[] staff = {
                new Faculty("Apple", "SOL", "20170101"),
                new Faculty("Apple", "LKCSB", "20170101"),
                new Faculty("Apple", "SOE", "20170101"),
                new Faculty("Pear", "SIS", "20170101"),
                new Faculty("Apple", "SOA", "20170101"),
                new Faculty("Apple", "SOSS", "20170101"),
                new Faculty("Apple", "SIS", "20170101"),
                new Faculty("Durian", "SIS", "20170101")};

        Criterion[] criteria =  {
                new Criterion(Criterion.NAME, true),
                new Criterion(Criterion.SCHOOL, true)};


        Sorter sorter = new Sorter(criteria);
        sorter.sort(staff);

        for (Staff s : staff) {
            System.out.println(s);
        }
        System.out.println();

    }

    public static void testNameSchoolDescendingSort() {
        Staff[] staff = {
                new Faculty("Apple", "SOL", "20170101"),
                new Faculty("Apple", "LKCSB", "20170101"),
                new Faculty("Apple", "SOE", "20170101"),
                new Faculty("Pear", "SIS", "20170101"),
                new Faculty("Apple", "SOA", "20170101"),
                new Faculty("Apple", "SOSS", "20170101"),
                new Faculty("Apple", "SIS", "20170101"),
                new Faculty("Durian", "SIS", "20170101")};

        Criterion[] criteria =  {
                new Criterion(Criterion.NAME, false),
                new Criterion(Criterion.SCHOOL, false)};


        Sorter sorter = new Sorter(criteria);
        sorter.sort(staff);

        System.out.println("Test (testNameSchoolDescendingSort)");
        for (Staff s : staff) {
            System.out.println(s);
        }
        System.out.println();

    }

    public static void testClassSort() {
        Staff[] staff = {
                new TA("Apple", "SIS", 2),
                new TA("Berry", "SIS", 1),
                new TA("Cherry", "SIS", 3),
                new Faculty("Elderberry", "SIS", "20170101"),
                new Faculty("Durian", "SIS", "20170101")};

        Criterion[] criteria =  {
                new Criterion(Criterion.CLASS, true),
                new Criterion(Criterion.NAME, true)};


        Sorter sorter = new Sorter(criteria);
        sorter.sort(staff);

        System.out.println("Test (testNameSchoolDescendingSort)");
        for (Staff s : staff) {
            System.out.println(s);
        }
        System.out.println();

    }

    public static void testClassNameYearSort() {
        Staff[] staff = {
                new TA("Apple", "SIS", 2),
                new TA("Berry", "SIS", 1),
                new TA("Cherry", "SIS", 3),
                new TA("Cherry", "SIS", 1),
                new TA("Cherry", "SIS", 2),
                new Faculty("Durian", "SIS", "20170101")};

        Criterion[] criteria =  {
                new Criterion(Criterion.CLASS, true),
                new Criterion(Criterion.NAME, true),
                new Criterion(Criterion.YEAR, true)};


        Sorter sorter = new Sorter(criteria);
        sorter.sort(staff);

        System.out.println("Test (testNameSchoolDescendingSort)");
        for (Staff s : staff) {
            System.out.println(s);
        }
        System.out.println();

    }

    public static void testSorterConstructor() {

        try {
            System.out.println("Test Constructor(1)");
            Sorter s = new Sorter(null);
            System.out.println("Result:Fail");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("invalid criteria")) {
                System.out.println("Result:Pass");
            } else {
                System.out.println("Result:Pass");
            }
        }
        System.out.println();
        try {
            System.out.println("Test Constructor(2)");
            Sorter s = new Sorter(new Criterion[0]);
            System.out.println("Result:Fail");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("invalid criteria")) {
                System.out.println("Result:Pass");
            } else {
                System.out.println("Result:Pass");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        testSorterConstructor();

        testNameSchoolSort();

        testNameSchoolDescendingSort();

        testClassSort();

        testClassNameYearSort();
    }
}
