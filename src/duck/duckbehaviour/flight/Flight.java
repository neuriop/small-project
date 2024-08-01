package duck.duckbehaviour.flight;

public class Flight implements FlightBehaviour {
    private String colorHead;
    private String colorBody;

    public Flight(String colorHead, String colorBody) {
        this.colorHead = colorHead;
        this.colorBody = colorBody;
    }

    public void flight(){
        System.out.println(colorBody + "__" + colorHead + "  _\n" +
                colorBody + "\\_\\" + colorHead + "(.)>\n" +
                colorBody + " \\___)\n");
    }

}
