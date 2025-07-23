public class VisitorCounter {
    private static int _totalVisitors = 0;
    private int _sessionVisits;
    private String _visitorName;

    public VisitorCounter(String name) {
        _visitorName = name;
        _sessionVisits = 0;
        _totalVisitors++;
    }

    public void recordVisit(){
        _sessionVisits++;
        System.out.println(_visitorName + " visited. Session visits: "+_sessionVisits);
    }

    public static void displayTotalVisitors(){
        System.out.println("Total visitors today: "+_totalVisitors);
    }

    public static int getTotalVisitors(){
        return _totalVisitors;
    }
}
