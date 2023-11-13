public interface Live {
    protected int reproductionRate;
    protected int dieRate;
    
    protected String name;
    protected int age;
    protected int placement;
    
    protected void reproduce();
    protected void die();
    public void setRates();
    protected void tick();
}