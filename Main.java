public class Main {
    public static void main(String[] args){
        // ---- Functional Programming ----------//

        // write functionality

        Prettifier prettifierImpl = x -> "*~*~" + x + "*~*~";

        // use functionality 
        Integer myInteger = 5;
        String result = prettifierImpl.prettify(myInteger);
        System.out.println(result);

        // swap functionality 
        prettifierImpl = x -> "+-+-" + x + "+-+-";
        result = prettifierImpl.prettify(myInteger);
        System.out.println(result);
    }
}
