public class ComplexeRI extends Complexe{
private double reel, imaginaire;

public ComplexeRI(double reel, double imaginaire){

this.reel = reel;
this.imaginaire=imaginaire;

}
public ComplexeRI(Complexe c){
this.reel = c.getReel();
this.imaginaire = c.getImaginaire();

}

    public  double getReel(){
    return this.reel;
    };
    
    public  double getImaginaire(){
    return this.imaginaire;
    };

    public double getMod(){
    return Math.sqrt(reel*reel + imaginaire*imaginaire);
    };

    public double getArg(){
    return Math.atan2(imaginaire, reel);
    };

    public Complexe plus(Complexe c){
    //  (a + bi)  + (a'+ b'i)
    return new ComplexeRI(reel+ this.reel, imaginaire + this.imaginaire);

    };

    public Complexe moins(Complexe c){
    // (a + bi) - (a'+ b'i)
    return new ComplexeRI(this.reel - reel, this.imaginaire - imaginaire);

    };
    public Complexe multipliePar(Complexe c){
    
    };
    public Complexe divisePar(Complexe c){

    };
    public  Complexe conjugue(){

    };
    public  Complexe puissance(double x){

    };
    public  Complexe ln(){

    };
    public  String toString(){

    };

}
