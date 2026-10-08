public class ComplexeRI extends Complexe{
private double reel, imaginaire;

public ComplexeRI(double reel, double imaginaire){

this.reel = reel;
this.imaginaire=imaginaire;

}
public ComplexeRI(Complexe c){
if (c == null) {
throw new IllegalArgumentException(" 'c' --> cannot be null ");
}

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
    //  (a + bi)  + (a'+ b'i) = (a + a') + (b + b')i
    return new ComplexeRI(c.getReel()+ this.reel, c.getImaginaire() + this.imaginaire);

    };

    public Complexe moins(Complexe c){
    // (a + bi) - (a'+ b'i)
    return new ComplexeRI(this.reel - c.getReel(), this.imaginaire - c.getImaginaire());

    };
    public Complexe multipliePar(Complexe c){
        if (c instanceof ComplexeMA) { // optionnelle
            return new ComplexeRI(c.multipliePar(this));
        }
    return (Complexe)(new ComplexeMA(this).multipliePar(c));
    };
    public Complexe divisePar(Complexe c){

    if (c instanceof ComplexeMA) { // optionnelle 
    return new ComplexeRI(c.divisePar(this));
    }

    return (ComplexeRI) new ComplexeMA(this).divisePar(c);
    };

    public  Complexe conjugue(){
    return new ComplexeRI(this.reel, - this.imaginaire);
    };

    public  Complexe puissance(double x){
    return (ComplexeRI) new ComplexeMA(this).puissance(x);
    };

    public  Complexe ln(){
    return (ComplexeRI) new ComplexeMA(this).ln();
    };

    public  String toString(){
    return this.reel + " + " + this.imaginaire + "i" ;
    };

}
