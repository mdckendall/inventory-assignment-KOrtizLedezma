import java.util.Scanner;
import java.util.ArrayList;
class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Item> items = new ArrayList<>();
    boolean state = true;
    int option = 0;

    String name = "";
    String serialNumber = "";
    int value = 0;
    do{
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      option = scanner.nextInt();
      scanner.nextLine();
      switch(option){
        case 1:
          System.out.println("Enter the name:");
          name =  scanner.nextLine();
          System.out.println("Enter the serial number:");
          serialNumber = scanner.nextLine();
          System.out.println("Enter the value in dollars (whole number):");
          value = scanner.nextInt();
          scanner.nextLine();
          Item i = new Item(name, serialNumber, value);
          items.add(i);
          break;
        case 2:
          System.out.println("Enter the serial number of the item to change:");
          serialNumber = scanner.nextLine();
          for(int j =0; j<items.size(); j++){
            if(items.get(j).getSerialNumber().equals(serialNumber)){
              items.remove(j);
            }
          }
          break;
        case 3:
          System.out.println("Enter the serial number of the item to change:");
          serialNumber = scanner.nextLine();
          for(Item current : items){
            if(current.getSerialNumber().equals(serialNumber)){
              System.out.println("Enter the new name:");
              name = scanner.nextLine();
              System.out.println("Enter the new value in dollars (whole number):");
              value = scanner.nextInt();
              scanner.nextLine();
              current.setName(name);
              current.setValue(value);
            }
          }
          break;
        case 4:
          for(Item current : items){
            System.out.println(current.toString());
          }
          break;
        case 5:
          state = false;
          break;
        default:
          System.out.println("The option is not valid, please try again");
          break;
      }
    }
    while(state == true);
  }
}