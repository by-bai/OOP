public class Baby {

    private boolean isHungry;

    public void setIsHungry(boolean hunger) { //setter
        isHungry = hunger; 
    }

    public void eat(String foodDesc) throws NotHungryException {
        if (isHungry) {
            System.out.println("eating " + foodDesc); 
        } else {
            throw new NotHungryException("rejects " + foodDesc);
        }
        
    }

}
