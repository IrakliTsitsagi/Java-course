public class Switch {
    public static void main(String[] args) {
      /*  int value = 1;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }*/
        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
                case 3: case 4: case 5:
                System.out.println("was 3 or 4 or 5");
                System.out.println("it was " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        char charValue='B';
        switch(charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("your char is "+ charValue);
                break;
            default:
                System.out.println("your char is not A, B, C, D or E,  it is " + charValue);
                break;
        }
        String month = "JuNe";
        switch(month.toLowerCase()){   // aq rogorc ar unda chawero zemot ianvari
            // gadmoyavs lower case rom 1 didi asos gamo ar iyos error
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
        }
    }
}
