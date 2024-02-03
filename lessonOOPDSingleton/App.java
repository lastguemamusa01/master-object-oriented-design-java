package lessonOOPDSingleton;

public class App {

  /*
  Singleton - simply a class that is instantiated exactly once in an application and no more than that

  example: there are a lot different games, but there is only one stadium.
  singleton: stage, game dock, stadium

  singleton - they do not have a public constructor

   */

  public static void main(String[] args) {
    // PerformanceStage performanceStage = new PerformanceStage(); // error , no visible
    PerformanceStage performanceStage = PerformanceStage.getInstance(); // singleton

    performanceStage.turnOnLights();
    System.out.println(performanceStage.getCounter());

    PerformanceStage performanceStage2 = PerformanceStage.getInstance();
    System.out.println(performanceStage2.getCounter());


  }

}
