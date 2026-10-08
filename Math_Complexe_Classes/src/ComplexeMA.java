public class ComplexeMA extends Complexe{
private double argument, module;


public ComplexeMA (double module, double argument){
this.module= module;
this.argument=argument;
}
public ComplexeMA (Complexe c ){
this.argument = c.getArg();
this.module = c.getMod();

}


    public  double getReel(){
    return module * Math.cos(argument);
    };

    public  double getImaginaire(){
    return module * Math.sin(argument);
    };

    public double getMod(){
    return this.module;
    };

    public double getArg(){
    return this.argument;
    };

    public Complexe plus(Complexe c){
    // Fact : l'idee c'est soit je renvoie une ComplexeMA ou bien Complexe tout court 
    if (c instanceof ComplexeRI) { // mais surtout pas un ComplexeRI 
        return new ComplexeMA(c.plus(this));
    }

    // Si l'utilisateur met un ComplexeRI alors on appelera un ComplexeMA 


    return (ComplexeMA)(new ComplexeRI((this)).plus(c));
    };

    public Complexe moins(Complexe c){
    return (Complexe)(new ComplexeRI(this).moins(c));
    };
    public Complexe multipliePar(Complexe c){
    // r * r et teta + teta (comme sous forme exp)
    return  new ComplexeMA(this.module * c.getMod(), this.argument + c.getArg());
    };
    public Complexe divisePar(Complexe c){
    // r / r et teta - teta (comme sous forme exp aussi)
    return new ComplexeMA(this.module /c.getMod() , this.argument - c.getArg() );
    };
    public  Complexe conjugue(){
    return (ComplexeMA) new ComplexeRI(this).conjugue();
    };
    public  Complexe puissance(double x){
    return new ComplexeMA( Math.pow(this.module, x),this.argument * x) ;
    };
    public  Complexe ln(){
    return new ComplexeMA(Math.log(this.module),this.argument);
    };
    public  String toString(){
    return "[" + this.module + " ; " + this.argument + " rad]";
    };

}
