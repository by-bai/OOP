public class W10Iterator {

    List<String> list = new Arraylist<>(); 
    list.add("apple"); 
    list.add("orange"); 
    list.add("orange"); 
    list.add("pear"); 

    Iterator iter = list.iterator();

    while (iter.hasNext()) {
        String s = iter.next(); //returns an instance of java.lang.Object 
                                //--> error: incompatible types: Object cannot be converted to String
                                //must change above code to Iterator<String> iter = list.iterator(); then can compile
        if(s.equals("orange"){
            iter.remove(); 
        }


    }
    
}
