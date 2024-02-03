package lessonOOPDSingleton;

public class PerformanceStage {

  private static PerformanceStage INSTANCE = null;
  private static int COUNTER;
  // private constructor for singleton
  private PerformanceStage(){ // in singleton , the constructor never can be public
    COUNTER++;
  }

  // only one instance
  public synchronized static PerformanceStage getInstance() {
    // Not thread safe, when there are a lot of thread, this could be created 2 instances
    // for prevent that  public static PerformanceStage getInstance() {
    // we use synchronized keyword public synchronized static PerformanceStage getInstance() { -> thread safe
    if(INSTANCE == null) {
      INSTANCE = new PerformanceStage();
    }
    return INSTANCE;
  }

  public void turnOnLights() {
    System.out.println("turned on lights...");
  }

  public int getCounter() {
    return COUNTER;
  }


}
