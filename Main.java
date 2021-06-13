public class Main
{


  public static void main(String[] args)
  {
    System.out.println("Starting Picture Lab...");

    ConsoleInput cin = new ConsoleInput();

    while (true)
    {
      System.out.println("Select 1: color chooser, 2: pic explorer, 3: pic tester,4:intArryTest, 0: quit");
      cin.read();
      if (!cin.validInt() || cin.getInt() == 0) {
        System.out.println("bye");
        break;
      }

      switch (cin.getInt()) {
        case 1:  // entry point to ColorChooser
          ColorChooser.start();
          break;

        case 2:  // entry point to PictureExplorer
          PictureExplorer.start();
          break;

        case 3:  // entry point to PictureTester
          PictureTester.start();
          break;

        case 4:  // entry point to IntArrayWorkerTester
          IntArrayWorkerTester.start();
          break;
        

        default:
          System.out.println("enter a valid command...");
      }
    }
    
  }

}
