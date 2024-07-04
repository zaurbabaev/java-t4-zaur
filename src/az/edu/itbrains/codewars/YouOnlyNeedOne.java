package az.edu.itbrains.codewars;

/*
You will be given an array a and a value x. All you need to do
is check whether the provided array contains the value.
Array can contain numbers or strings. X can be either.
Return true if the array contains the value, false if not.
 */
public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Object[] objects = {66, 101};
        Object[] objects1 = {80, 117, 115, 104, 45, 85, 112, 115};
        Object[] objects2 = {'t', 'e', 's', 't'};
        Object[] objects3 = {"what", "a", "great", "kata"};
        System.out.println(check(objects, 66));
        System.out.println(check(objects1, 104));
        System.out.println(check(objects2, 't'));
        System.out.println(check(objects3, "kat"));
    }
}
