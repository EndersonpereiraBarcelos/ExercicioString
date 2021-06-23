public class ex1{
    public static void main(String[]args){

        String location = "Florida";
        int flightNumber = 175;
        StringBuilder sb = new StringBuilder();
        sb.append("I flew to");
        sb.append(location);
        sb.append(" on flight #");
        sb.append(flightNumber);
        String message = sb.toString(); //I  flew to florida on flight #175
        System.out.println(message);

        String time = "9:00";
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at");
        sb.insert(pos + 4, time);
        message = sb.toString();
        System.out.println(message);
        



















/*
       
            */



        /*
    int iVal = 100;
    String sVal = String.valueOf(iVal);
        System.out.println(sVal);

        int  i =2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result ;
        System.out.println(output);
    */
    }
}