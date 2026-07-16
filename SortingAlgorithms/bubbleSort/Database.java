import java.util.ArrayList;


public class Database {
    private ArrayList<Registration> registrations = new ArrayList();

    public Database() {
        // Initialize the list of registrations

        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        registrations.add(new Registration("ANA-2866", "Zane Hallworth"));
        registrations.add(new Registration("DYC-5707", "Jodi Gatfield"));
        registrations.add(new Registration("GIG-1870", "Harvey Kenny"));
        registrations.add(new Registration("NWK-2057", "Janice Hudson"));
        registrations.add(new Registration("BYJ-6279", "Larry Newman"));
        registrations.add(new Registration("ENY-2915", "Helen Pryor"));
        registrations.add(new Registration("OYW-0632", "Quincy Cromwell"));
        registrations.add(new Registration("KEC-3996", "Kathy Myers"));
        registrations.add(new Registration("HOZ-1224", "Hugh Haines"));
        registrations.add(new Registration("KGJ-5010", "Tammy Mallard"));
        registrations.add(new Registration("FVA-4467", "Michael Knowles"));
        registrations.add(new Registration("NEV-9119", "Michael Knowles"));
        registrations.add(new Registration("BJT-9772", "Karl Yardley"));
        registrations.add(new Registration("YQD-3410", "Andrea Elsworth"));
        registrations.add(new Registration("DUY-0288", "Jay Zagorski"));
        registrations.add(new Registration("ATZ-9783", "Sally Oakes"));
        registrations.add(new Registration("IAG-6602", "Patrick Hewitt"));
        registrations.add(new Registration("DCP-2974", "Donna Wardman"));
        registrations.add(new Registration("FAH-2515", "Jay Newton"));
        registrations.add(new Registration("GYF-3958", "Carla Collins"));
        registrations.add(new Registration("NCL-9068", "James McBride"));
        registrations.add(new Registration("UBJ-1923", "Helen Gibbs"));
        registrations.add(new Registration("UUG-4837", "Conrad Pryor"));
        registrations.add(new Registration("GMD-6786", "Tracy Gilbert"));
        registrations.add(new Registration("QTW-6473", "Donald Gatfield"));
        registrations.add(new Registration("QQE-3264", "Charlotte Newport"));
        registrations.add(new Registration("WAO-8258", "Rodney Gilbert"));

    }

    public void printAll(){
        for (Object obj : registrations) {
            Registration reg = (Registration) obj;
            System.out.println(reg);
        }
    }

    // TODO 4: Uncomment the bubble sort method
    public void bubbleSort() {
        // TODO 5: Declare two local variables n and swapped
        int n = registrations.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            // TODO 6: Set swapped to false
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // TODO 7: Get references to two Registration objects.
                //         The current registration is at index j and
                //         the next registration is at index (j + 1)
                Registration current = registrations.get(j);
                Registration next = registrations.get(j+1);

                // TODO 11: Remove the nextJ declaration and the print statement.
                //Removed.
                // TODO 12: Uncomment the IF statement.
                //Done
                // TODO 13 Write an IF condition that is true if the license
                //         value of the current registration is greater than
                //         that of the next Registration object.
                if (current.license.compareTo(next.license) > 0) {
                    // TODO 14: Swap the positions of the current and next
                    //          Registration objects in the array
                    Registration temp = current;
                    registrations.set(j, next);
                    registrations.set(j + 1, temp);

                    // TODO 15: Set the swapped variable to true;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {

        // TODO 1: Create an instance of the Database class
        Database data = new Database();

        System.out.println("\n******* Unsorted List ******\n");

        // TODO 2: Call the printAll() method on the Database instance
        data.printAll();

        System.out.println("\n******* Sorted List ******\n");

        // TODO 8: Call the bubbleSort() method on the
        //          Database instance.
        data.bubbleSort();

        // TODO 9: call the printAll() method
        data.printAll();

    }
}

/* Output:

******* Unsorted List ******

SGL-6855	: Tyler Lennon
SDN-2659	: Margaret Finn
ANA-2866	: Zane Hallworth
DYC-5707	: Jodi Gatfield
GIG-1870	: Harvey Kenny
NWK-2057	: Janice Hudson
BYJ-6279	: Larry Newman
ENY-2915	: Helen Pryor
OYW-0632	: Quincy Cromwell
KEC-3996	: Kathy Myers
HOZ-1224	: Hugh Haines
KGJ-5010	: Tammy Mallard
FVA-4467	: Michael Knowles
NEV-9119	: Michael Knowles
BJT-9772	: Karl Yardley
YQD-3410	: Andrea Elsworth
DUY-0288	: Jay Zagorski
ATZ-9783	: Sally Oakes
IAG-6602	: Patrick Hewitt
DCP-2974	: Donna Wardman
FAH-2515	: Jay Newton
GYF-3958	: Carla Collins
NCL-9068	: James McBride
UBJ-1923	: Helen Gibbs
UUG-4837	: Conrad Pryor
GMD-6786	: Tracy Gilbert
QTW-6473	: Donald Gatfield
QQE-3264	: Charlotte Newport
WAO-8258	: Rodney Gilbert

******* Sorted List ******

ANA-2866	: Zane Hallworth
ATZ-9783	: Sally Oakes
BJT-9772	: Karl Yardley
BYJ-6279	: Larry Newman
DCP-2974	: Donna Wardman
DUY-0288	: Jay Zagorski
DYC-5707	: Jodi Gatfield
ENY-2915	: Helen Pryor
FAH-2515	: Jay Newton
FVA-4467	: Michael Knowles
GIG-1870	: Harvey Kenny
GMD-6786	: Tracy Gilbert
GYF-3958	: Carla Collins
HOZ-1224	: Hugh Haines
IAG-6602	: Patrick Hewitt
KEC-3996	: Kathy Myers
KGJ-5010	: Tammy Mallard
NCL-9068	: James McBride
NEV-9119	: Michael Knowles
NWK-2057	: Janice Hudson
OYW-0632	: Quincy Cromwell
QQE-3264	: Charlotte Newport
QTW-6473	: Donald Gatfield
SDN-2659	: Margaret Finn
SGL-6855	: Tyler Lennon
UBJ-1923	: Helen Gibbs
UUG-4837	: Conrad Pryor
WAO-8258	: Rodney Gilbert
YQD-3410	: Andrea Elsworth

Process finished with exit code 0
*/
